import com.google.protobuf.gradle.id
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import java.io.FileOutputStream

tasks.register<DefaultTask>("downloadProto") {
    val nitricVersion = "v0.33.1"
    if (!File("${projectDir}/src/main/proto").exists()) {
        uri("https://github.com/nitrictech/nitric/releases/download/${nitricVersion}/contracts.tgz").toURL().openStream().use {
            // Convert the zip file
            it.copyTo(FileOutputStream(File("lib/proto.tgz")))
        }
    }
}

tasks.register<Copy>("unpackProto") {
    dependsOn("downloadProto")
    if (!File("src/main/proto").exists()) {
        from(tarTree("proto.tgz")) {
            include("contracts/**")
            eachFile {
                relativePath = RelativePath(true, *relativePath.segments.drop(1).toTypedArray())
            }
            includeEmptyDirs = false
        }
        into("src/main/proto")
    }
}

plugins {
    // Apply the org.jetbrains.kotlin.jvm Plugin to add support for Kotlin.
    // id("org.jetbrains.kotlin.jvm") version "1.5.31"

    // Apply the java-library plugin for API and implementation separation.
    `java-library`
    kotlin("jvm") version "1.7.20"

    id("com.google.protobuf") version "0.9.1"

    kotlin("plugin.serialization") version "1.7.20"

    // Apply the maven-publish plugin for publishing the final artifact
    `maven-publish`
}

group = "io.nitric"
version = "0.0.1"

java {
    withJavadocJar()
    withSourcesJar()
}

buildscript {
    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("com.google.protobuf:protobuf-gradle-plugin:0.9.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.20")
    }
}

publishing {
    repositories {
        maven {

        }
    }

    publications {
        create<MavenPublication>("mavenJava"){
            groupId = "io.nitric"
            artifactId = "jvm-sdk"
            from(components["java"])
            pom {
                name.set("Nitric JVM SDK")
                description.set("Nitric JVM language SDK")
                url.set("https://github.com/nitrictech/jvm-sdk")

                licenses {
                    license {
                        name.set("Apache-2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0")
                    }
                }
                developers {
                    developer {
                        id.set("nitric")
                        name.set("nitric")
                        email.set("maintainers@nitric.io")
                    }
                }
            }
        }
    }
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // This dependency is used internally, and not exposed to consumers on their own compile classpath.
    implementation("com.google.guava:guava:30.1.1-jre")

    implementation("com.google.code.gson:gson:2.10")

    // Kotlin co-routines lib
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

    // Kotlin serialization lib
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.2")

    // This dependency is exported to consumers, that is to say found on their compile classpath.
    api("org.apache.commons:commons-math3:3.6.1")

    // Protocol Buffers dependencies
    implementation("io.grpc:grpc-stub:1.46.0")
    implementation("io.grpc:grpc-kotlin-stub:1.3.0")
    implementation("io.grpc:grpc-protobuf:1.50.2")
    implementation("com.google.protobuf:protobuf-kotlin:3.21.8")
    implementation("com.google.protobuf:protobuf-java:3.21.8")
    implementation("io.grpc:grpc-netty:1.50.2")

    testImplementation(kotlin("test"))
    testImplementation("io.mockk:mockk:1.12.4")

}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.21.8"
    }
    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.50.2"
        }
        id("javapgv") {
            artifact = "build.buf.protoc-gen-validate:protoc-gen-validate:1.0.2"
        }
    }

    generateProtoTasks {
        all().forEach {
            it.plugins {
                id("grpc")
            }
            it.dependsOn("unpackProto")
        }

        generatedFilesBaseDir = "${projectDir}/src/main/kotlin/io/nitric/proto"
    }
}

val compileKotlin: KotlinCompile by tasks
compileKotlin.dependsOn ":generateProto"
compileKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}

tasks.test {
    useJUnitPlatform()
}