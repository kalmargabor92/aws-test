package com.gkalmar.awstest.boundary.web.handlers.awstest

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router

@Configuration
class AWSTestActionRoutingConfiguration {

    @Bean
    fun awsTestActionRouter(): RouterFunction<ServerResponse> =
        router {
            GET("/test") { req ->
                ServerResponse.ok().bodyValue(mapOf("result" to "ok"))
            }
        }
}
