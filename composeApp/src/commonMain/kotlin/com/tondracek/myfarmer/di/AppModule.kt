package com.tondracek.myfarmer.di

import com.tondracek.myfarmer.features.demo.domain.AddDemoUC
import org.koin.dsl.module

val appModule = module {
    AddDemoUC()
}

