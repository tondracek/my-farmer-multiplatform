package com.tondracek.myfarmer.ui

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.tondracek.myfarmer.ui.demoscreen.DemoScreenRoute
import com.tondracek.myfarmer.ui.demoscreen.demoDestination
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun MyFarmerApp() {
    MaterialTheme {
        val navController = rememberNavController()

        NavHost(
            navController = navController,
            startDestination = DemoScreenRoute
        ) {
            demoDestination()
        }
    }
}