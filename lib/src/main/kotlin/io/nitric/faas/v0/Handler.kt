package io.nitric.faas.v0

fun interface Handler<Ctx> {
    fun invoke(ctx: Ctx): Ctx
}