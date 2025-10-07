package com.tondracek.myfarmer.di

import com.tondracek.myfarmer.ui.demoscreen.DemoViewmodel
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val viewmodelModule: Module = module {
    singleOf(::DemoViewmodel)
}