// Copyright 2021, Nitric Technologies Pty Ltd.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package io.nitric.api.secrets.v0

/**
 * The [value] of a specific [secretVersion].
 */
class SecretValue internal constructor(val secretVersion: SecretVersion, private val value: String) {
    /**
     * Convert the [SecretValue] to a [ByteArray].
     */
    fun toByteArray(): ByteArray {
        return this.value.toByteArray()
    }

    /**
     * Convert the [SecretValue] to a [String].
     */
    override fun toString(): String {
        return this.value
    }
}