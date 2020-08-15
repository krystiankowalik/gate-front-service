package com.github.krystiankowalik.gatefrontservice.service.impl

import com.github.krystiankowalik.gatefrontservice.service.SingleDoorService
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
class SingleDoorServiceImpl() : SingleDoorService {
    @Value("\${api.base-url}")
    lateinit var baseUrl: String
    @Value("\${api.endpoint.single-door.toggle}")
    lateinit var singleDoorToggleEndpoint :String

    override fun toggle(): ResponseEntity<ResponseEntity<*>> {
        val restTemplate = RestTemplate();
        val url = "${baseUrl}$singleDoorToggleEndpoint"
        return restTemplate.getForEntity(url, ResponseEntity::class.java)
    }
}