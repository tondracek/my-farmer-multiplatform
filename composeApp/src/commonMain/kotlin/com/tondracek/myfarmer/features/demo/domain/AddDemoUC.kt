package com.tondracek.myfarmer.features.demo.domain

import com.tondracek.myfarmer.shared.demo.domain.Demo
import kotlinx.datetime.LocalDateTime
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlin.time.Clock
import kotlin.time.ExperimentalTime
import kotlin.time.Instant
import kotlin.uuid.ExperimentalUuidApi
import kotlin.uuid.Uuid


class AddDemoUC(
//    private val demoRepository: DemoRepository
) {
    @OptIn(ExperimentalUuidApi::class)
    suspend operator fun invoke() {
        val demo = Demo(
            id = Uuid.random(),
            name = "Demo ${(0..100).random()}",
            index = (0..10).random(),
            date = getLocalDateTimeNow()
        )

//        demoRepository.create(demo)
        println("XXX ADD DEMO $demo")
    }
}

@OptIn(ExperimentalTime::class)
private fun getLocalDateTimeNow(): LocalDateTime {
    val clockNow: Instant = Clock.System.now()
    return clockNow.toLocalDateTime(TimeZone.currentSystemDefault())
}