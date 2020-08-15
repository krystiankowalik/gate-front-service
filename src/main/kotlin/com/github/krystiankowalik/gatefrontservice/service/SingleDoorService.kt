package com.github.krystiankowalik.gatefrontservice.service

import org.springframework.http.ResponseEntity

interface SingleDoorService {

    fun toggle(): ResponseEntity<ResponseEntity<*>>

}