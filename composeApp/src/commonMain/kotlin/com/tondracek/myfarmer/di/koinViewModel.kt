package com.tondracek.myfarmer.di

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import org.koin.compose.currentKoinScope
import org.koin.ext.getFullName

@Composable
inline fun <reified T : ViewModel> koinViewModel(): T {
    val scope = currentKoinScope()

    println("*KOIN-VIEWMODEL*: creating viewmodel of type ${T::class.getFullName()}")

    return viewModel {
        scope.get<T>()
    }
}