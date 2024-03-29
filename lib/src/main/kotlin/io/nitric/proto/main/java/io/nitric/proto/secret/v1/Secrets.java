// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/secret/v1/secret.proto

package io.nitric.proto.secret.v1;

public final class Secrets {
  private Secrets() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_secret_v1_SecretPutRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_secret_v1_SecretPutRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_secret_v1_SecretPutResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_secret_v1_SecretPutResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_secret_v1_SecretAccessRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_secret_v1_SecretAccessRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_secret_v1_SecretAccessResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_secret_v1_SecretAccessResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_secret_v1_Secret_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_secret_v1_Secret_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nitric_secret_v1_SecretVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nitric_secret_v1_SecretVersion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034proto/secret/v1/secret.proto\022\020nitric.s" +
      "ecret.v1\032\027validate/validate.proto\"U\n\020Sec" +
      "retPutRequest\0222\n\006secret\030\001 \001(\0132\030.nitric.s" +
      "ecret.v1.SecretB\010\372B\005\212\001\002\020\001\022\r\n\005value\030\002 \001(\014" +
      "\"L\n\021SecretPutResponse\0227\n\016secret_version\030" +
      "\001 \001(\0132\037.nitric.secret.v1.SecretVersion\"X" +
      "\n\023SecretAccessRequest\022A\n\016secret_version\030" +
      "\001 \001(\0132\037.nitric.secret.v1.SecretVersionB\010" +
      "\372B\005\212\001\002\020\001\"s\n\024SecretAccessResponse\022A\n\016secr" +
      "et_version\030\001 \001(\0132\037.nitric.secret.v1.Secr" +
      "etVersionB\010\372B\005\212\001\002\020\001\022\030\n\005value\030\002 \001(\014B\t\372B\006z" +
      "\004\030\300\273\001\"\026\n\006Secret\022\014\n\004name\030\001 \001(\t\"]\n\rSecretV" +
      "ersion\0222\n\006secret\030\001 \001(\0132\030.nitric.secret.v" +
      "1.SecretB\010\372B\005\212\001\002\020\001\022\030\n\007version\030\002 \001(\tB\007\372B\004" +
      "r\002\020\0012\270\001\n\rSecretService\022N\n\003Put\022\".nitric.s" +
      "ecret.v1.SecretPutRequest\032#.nitric.secre" +
      "t.v1.SecretPutResponse\022W\n\006Access\022%.nitri" +
      "c.secret.v1.SecretAccessRequest\032&.nitric" +
      ".secret.v1.SecretAccessResponseB\215\001\n\031io.n" +
      "itric.proto.secret.v1B\007SecretsP\001Z3github" +
      ".com/nitrictech/nitric/core/pkg/api/nitr" +
      "ic/v1\252\002\026Nitric.Proto.Secret.v1\312\002\026Nitric\\" +
      "Proto\\Secret\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.pgv.validate.Validate.getDescriptor(),
        });
    internal_static_nitric_secret_v1_SecretPutRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_nitric_secret_v1_SecretPutRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_secret_v1_SecretPutRequest_descriptor,
        new java.lang.String[] { "Secret", "Value", });
    internal_static_nitric_secret_v1_SecretPutResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_nitric_secret_v1_SecretPutResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_secret_v1_SecretPutResponse_descriptor,
        new java.lang.String[] { "SecretVersion", });
    internal_static_nitric_secret_v1_SecretAccessRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_nitric_secret_v1_SecretAccessRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_secret_v1_SecretAccessRequest_descriptor,
        new java.lang.String[] { "SecretVersion", });
    internal_static_nitric_secret_v1_SecretAccessResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_nitric_secret_v1_SecretAccessResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_secret_v1_SecretAccessResponse_descriptor,
        new java.lang.String[] { "SecretVersion", "Value", });
    internal_static_nitric_secret_v1_Secret_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_nitric_secret_v1_Secret_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_secret_v1_Secret_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_nitric_secret_v1_SecretVersion_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_nitric_secret_v1_SecretVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nitric_secret_v1_SecretVersion_descriptor,
        new java.lang.String[] { "Secret", "Version", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(io.envoyproxy.pgv.validate.Validate.rules);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    io.envoyproxy.pgv.validate.Validate.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
