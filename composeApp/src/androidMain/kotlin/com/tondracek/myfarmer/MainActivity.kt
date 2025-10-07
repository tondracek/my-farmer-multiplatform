package com.tondracek.myfarmer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.tondracek.myfarmer.ui.MyFarmerApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            MyFarmerApp()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    MyFarmerApp()
}