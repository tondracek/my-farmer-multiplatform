package com.tondracek.myfarmer

import androidx.compose.ui.window.ComposeUIViewController
import com.tondracek.myfarmer.di.KoinInitializer
import com.tondracek.myfarmer.ui.MyFarmerApp

fun MainViewController() = ComposeUIViewController(
    configure = {
        KoinInitializer().init()
    }
) {
    MyFarmerApp()
}