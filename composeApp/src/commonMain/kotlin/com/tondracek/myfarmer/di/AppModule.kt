package com.tondracek.myfarmer.di

import com.tondracek.myfarmer.features.demo.domain.AddDemoUC
import com.tondracek.myfarmer.features.demo.domain.GetFilteredDemosUC
import org.koin.dsl.module

val appModule = module {
    single { AddDemoUC() }
    single { GetFilteredDemosUC() }
}

