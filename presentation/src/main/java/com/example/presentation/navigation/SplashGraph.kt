package com.example.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.core.util.Constant.LOGIN_SCREEN
import com.example.core.util.Constant.SPLASH_SCREEN
import com.example.presentation.splashScreen.SplashScreen

fun NavGraphBuilder.splashNavGraph(
    splashNavigation: SplashNavigation,
    loginNavigation: authNavigation,
    homeNavigation: HomeNavigation
) {
    navigation(
        startDestination = SPLASH_SCREEN,
        route = "splash_screen_graph"
    ) {
        composable(route = SPLASH_SCREEN) {
            SplashScreen(splashNavigation)
        }

        authNavGraph(loginNavigation)
        homeScreenGraph(homeNavigation)
    }
}
class SplashNavigation(private val navController: NavController){

    fun toLogin(){
        navController.navigate(route= "auth_graph"){
            popUpTo(LOGIN_SCREEN){inclusive = true}
        }
    }

    fun toHome(){
        navController.navigate(route = "home_graph")
    }

}