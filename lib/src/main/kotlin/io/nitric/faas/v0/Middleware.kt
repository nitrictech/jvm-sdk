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

package io.nitric.faas.v0

/**
 * Represents a chainable handler for incoming requests. Useful for decorating existing handlers.
 */
fun interface Middleware<Ctx> {
    /**
     * Invoke the [Middleware] to process the [ctx] object. Passed any future middleware or handlers to call [next].
     */
    operator fun invoke(ctx: Ctx, next: Handler<Ctx>): Ctx
}