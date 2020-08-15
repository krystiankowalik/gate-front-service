package com.github.krystiankowalik.gatefrontservice.service

import org.springframework.http.ResponseEntity

interface DoubleDoorService {

    fun toggle(): ResponseEntity<ResponseEntity<*>>

}