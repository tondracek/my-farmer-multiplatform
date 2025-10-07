package com.tondracek.myfarmer.features.demo.domain

import com.tondracek.myfarmer.features.core.utils.getLocalDateTimeNow
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
