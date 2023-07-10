package com.school.band.repository

import com.school.band.model.entity.Save
import org.springframework.data.jpa.repository.JpaRepository

interface SaveRepository : JpaRepository<Save, Long>
