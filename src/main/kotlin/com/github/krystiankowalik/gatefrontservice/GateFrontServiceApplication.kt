package com.github.krystiankowalik.gatefrontservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GateFrontServiceApplication

fun main(args: Array<String>) {
    runApplication<GateFrontServiceApplication>(*args)
}
