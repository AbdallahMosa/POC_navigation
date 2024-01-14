package com.example.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun NavGraph(navHostController: NavHostController) {
    val splashNavigation = remember { SplashNavigation(navHostController) }
    val homeNavigation = remember { HomeNavigation(navHostController) }
    val loginNavigation = remember { authNavigation(navHostController) }

    NavHost(
        navController = navHostController,
        startDestination = "splash_screen_graph",
        route = "Root_Graph"
    ) {
        splashNavGraph(splashNavigation, loginNavigation, homeNavigation)

    }
}