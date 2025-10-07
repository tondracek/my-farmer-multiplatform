package com.tondracek.myfarmer

import android.app.Application
import com.tondracek.myfarmer.di.KoinInitializer

class AndroidApp : Application() {
    override fun onCreate() {
        super.onCreate()

        KoinInitializer(applicationContext).init()
    }
}
