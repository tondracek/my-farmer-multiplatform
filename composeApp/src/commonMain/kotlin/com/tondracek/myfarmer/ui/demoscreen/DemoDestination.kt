package com.tondracek.myfarmer.ui.demoscreen

import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.tondracek.myfarmer.di.koinViewModel
import kotlinx.serialization.Serializable

@Serializable
data object DemoScreenRoute

fun NavGraphBuilder.demoDestination() {
    composable<DemoScreenRoute> {
        val viewmodel = koinViewModel<DemoViewmodel>()

        val state by viewmodel.state.collectAsState()

        DemoScreen(
            state = state,
            onAddDemoClick = viewmodel::addDemo,
        )
    }
}
