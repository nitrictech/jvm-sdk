package io.nitric.faas.v0

interface Middleware<Ctx> {
    fun invoke(ctx: Ctx, next: Handler<Ctx>): Ctx
}