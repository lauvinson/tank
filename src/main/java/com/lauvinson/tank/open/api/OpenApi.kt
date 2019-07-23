package com.lauvinson.tank.open.api

import com.fasterxml.jackson.databind.SerializationFeature
import com.lauvinson.tank.internal.entity.FightResult
import com.lauvinson.tank.internal.entity.RequestInit
import com.lauvinson.tank.internal.entity.Result
import com.lauvinson.tank.internal.service.Fight
import com.lauvinson.tank.internal.service.FightService
import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.application.install
import io.ktor.features.ContentNegotiation
import io.ktor.jackson.jackson
import io.ktor.request.receiveOrNull
import io.ktor.response.respond
import io.ktor.routing.post
import io.ktor.routing.route
import io.ktor.routing.routing

fun Application.module() {
    install(ContentNegotiation) {
        jackson {
            enable(SerializationFeature.INDENT_OUTPUT) // Pretty Prints the JSON
        }
    }
    routing {
        route("/player") {
            val fightService: Fight = FightService()
            /**
             * TODO 初始化接口
             * created by vinson on 2018-11-30
             **/
            post(path = "/init") {
                val post = call.receiveOrNull(RequestInit::class)
                post?.let { it1 -> print(it1) }
                call.respond(fightService.setInit("/player/init",post))
            }

            /**
             * TODO 开打接口
             * created by vinson on 2018-11-30
             **/
            post(path = "/action") {
                val post = call.receiveOrNull(RequestInit::class)
                post?.let { it1 -> print(it1) }
                call.respond(fightService.getAction("/player/action",post))
            }
        }
    }
}
