package com.devsawe.laundry_app.navigation

sealed class Screen(val route: String){
    object Home: Screen(route = "home_screen")
    object Splash: Screen(route = "splash_screen")
    object Welcome: Screen(route = "welcome_screen")



}
