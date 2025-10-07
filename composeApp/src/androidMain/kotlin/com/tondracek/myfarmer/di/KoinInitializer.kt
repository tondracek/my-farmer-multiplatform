package com.tondracek.myfarmer.di

import android.content.Context
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

actual class KoinInitializer(
    private val context: Context,
) {
    actual fun init() {
        startKoin {
            androidContext(context)
//            androidLogger()
            modules(appModule, viewmodelModule)
        }
    }
}