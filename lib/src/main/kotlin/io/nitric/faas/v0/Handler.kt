package io.nitric.faas.v0

interface Handler<Ctx> {
    fun invoke(ctx: Ctx): Ctx
}