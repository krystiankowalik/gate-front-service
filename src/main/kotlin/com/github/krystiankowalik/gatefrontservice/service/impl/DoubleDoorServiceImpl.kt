package com.github.krystiankowalik.gatefrontservice.service.impl

import com.github.krystiankowalik.gatefrontservice.service.DoubleDoorService
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.validation.annotation.Validated
import org.springframework.web.client.RestTemplate

@Service
class DoubleDoorServiceImpl() : DoubleDoorService {
    @Value("\${api.base-url}")
    lateinit var baseUrl: String
    @Value("\${api.endpoint.double-door.toggle}")
    lateinit var doubleDoorToggleEndpoint :String

    override fun toggle(): ResponseEntity<ResponseEntity<*>> {
        val restTemplate = RestTemplate();
        val url = "${baseUrl}$doubleDoorToggleEndpoint"
        return restTemplate.getForEntity(url, ResponseEntity::class.java)
    }
}