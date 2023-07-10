package com.school.band.service

import com.school.band.model.dto.SaveDto
import com.school.band.model.entity.Save
import com.school.band.repository.SaveRepository
import org.springframework.stereotype.Service

@Service
class MainServer(
    private val saveRepository: SaveRepository
) {
    fun save(saveDto: SaveDto) {
        val saveData = Save(
            0L,
            saveDto.schoolName,
            saveDto.schoolNumber
        )
        saveRepository.save(saveData)
    }
}
