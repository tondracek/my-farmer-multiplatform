package com.tondracek.myfarmer.features.demo.domain

import kotlinx.datetime.LocalDateTime
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid

@OptIn(ExperimentalUuidApi::class)
data class Demo(
    val id: Uuid,
    val name: String,
    val index: Int,
    val date: LocalDateTime
)
