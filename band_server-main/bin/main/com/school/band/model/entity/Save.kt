package com.school.band.model.entity

import javax.persistence.*



@Entity
class Save(
    @Id
    val idx: Long = 0L,
    var schoolNumber: String = "",
    var schoolName: String = "",

)