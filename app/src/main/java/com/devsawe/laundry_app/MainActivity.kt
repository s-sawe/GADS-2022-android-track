package com.devsawe.laundry_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.devsawe.laundry_app.composables.HomeScreen
import com.devsawe.laundry_app.navigation.SetupNavGraph
import com.devsawe.laundry_app.ui.theme.LaundryappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LaundryappTheme {
                val navController = rememberNavController()
                SetupNavGraph(navController = navController)
            HomeScreen(navController)
            }
        }
    }
}
