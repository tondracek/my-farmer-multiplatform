package com.tondracek.myfarmer.ui.demoscreen

import com.tondracek.myfarmer.shared.demo.domain.Demo

sealed interface DemoScreenState {
    object Loading : DemoScreenState
    data class Success(val demos: List<Demo>) : DemoScreenState
    data class Error(val message: String) : DemoScreenState
}
