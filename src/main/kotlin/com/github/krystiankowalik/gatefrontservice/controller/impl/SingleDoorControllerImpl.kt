package com.github.krystiankowalik.gatefrontservice.controller.impl

import com.github.krystiankowalik.gatefrontservice.controller.SingleDoorController
import com.github.krystiankowalik.gatefrontservice.service.SingleDoorService
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.math.log

@RestController
@RequestMapping("/v1/single-door")
@Slf4j
class SingleDoorControllerImpl(@Autowired val singleDoorService: SingleDoorService) : SingleDoorController {

    @GetMapping("/toggle")
    override fun toggle() {
        singleDoorService.toggle()
    }

}