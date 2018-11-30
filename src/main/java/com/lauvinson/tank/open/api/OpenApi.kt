package com.lauvinson.tank.open.api

import com.fasterxml.jackson.databind.SerializationFeature
import com.lauvinson.tank.internal.entity.RequestInit
import com.lauvinson.tank.internal.entity.Result
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
            
            /**
             * TODO 初始化接口
             * created by vinson on 2018-11-30
             **/
            post(path = "/init") {
                val post = call.receiveOrNull(RequestInit::class)
                post?.let { it1 -> print(it1) }
                call.respond(Result.ok("/player/init"))
            }

            /**
             * TODO 开打接口
             * created by vinson on 2018-11-30
             **/
            post(path = "/action") {
                val post = call.receiveOrNull(RequestInit::class)
                post?.let { it1 -> print(it1) }
                call.respond(Result.ok("/player/action"))
            }
        }
    }
}
