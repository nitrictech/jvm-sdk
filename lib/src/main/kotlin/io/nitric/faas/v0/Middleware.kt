package io.nitric.faas.v0

fun interface Middleware<Ctx> {
    operator fun invoke(ctx: Ctx, next: Handler<Ctx>): Ctx
}