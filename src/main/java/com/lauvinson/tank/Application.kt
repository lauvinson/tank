package com.lauvinson.tank

import com.lauvinson.tank.open.api.module
import io.ktor.application.Application
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty


fun main() {
    embeddedServer(Netty, 5970, watchPaths = listOf("BlogAppKt"), module = Application::module).start()
}