package com.example

import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import com.example.model.TariffCalculator
import java.sql.Connection
import java.sql.DriverManager
import org.jetbrains.exposed.sql.*

fun Application.configureRouting() {
    install(StatusPages) {
        exception<Throwable> { call, cause ->
            call.respondText(text = "500: $cause" , status = HttpStatusCode.InternalServerError)
        }
    }
    routing {
        get("/ping") {
            call.respondText("pong")
        }

        get("/calculateDelivery") {
            call.respond(TariffCalculator().calculate())
        }

        get("/createShipment") {
            call.respondText("pong")
        }

        get("/getShipmentStatus") {
            call.respondText("pong")
        }

        get("/cancelShipment") {
            call.respondText("pong")
        }
    }
}
