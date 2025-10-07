package com.tondracek.myfarmer.features.core.utils

import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlin.time.Clock
import kotlin.time.ExperimentalTime
import kotlin.time.Instant

@OptIn(ExperimentalTime::class)
fun getLocalDateTimeNow(): LocalDateTime {
    val clockNow: Instant = Clock.System.now()
    return clockNow.toLocalDateTime(TimeZone.currentSystemDefault())
}