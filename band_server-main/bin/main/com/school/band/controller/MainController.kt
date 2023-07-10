package com.school.band.controller

import com.school.band.model.dto.SaveDto
import com.school.band.service.MainServer
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class MainController(
    private val mainServer: MainServer
) {
    @PostMapping("/save")
    fun save(@RequestBody saveDto: SaveDto) {
        mainServer.save(saveDto)
    }
}