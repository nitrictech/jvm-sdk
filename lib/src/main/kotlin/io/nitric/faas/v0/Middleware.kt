package io.nitric.faas.v0

fun interface Middleware<Ctx> {
    fun invoke(ctx: Ctx, next: Handler<Ctx>): Ctx
}