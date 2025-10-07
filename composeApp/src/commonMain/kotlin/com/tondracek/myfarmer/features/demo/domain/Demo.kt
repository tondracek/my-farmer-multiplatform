package com.tondracek.myfarmer.shared.demo.domain

import java.time.LocalDateTime
import java.util.UUID

data class Demo(
    val id: UUID,
    val name: String,
    val index: Int,
    val date: LocalDateTime
)
