package io.nitric.faas.v0

fun interface Handler<Ctx> {
    operator fun invoke(ctx: Ctx): Ctx
}