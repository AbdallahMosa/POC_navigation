package com.example.presentation.navigation

import LoginScreenCompose
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.core.util.Constant.HOME_SCREEN
import com.example.core.util.Constant.LOGIN_SCREEN


fun NavGraphBuilder.authNavGraph(loginNavigation: authNavigation){

    navigation(startDestination = LOGIN_SCREEN, route = "auth_graph"){
        composable(route =LOGIN_SCREEN ){
            LoginScreenCompose(loginNavigation)
        }
    }



}

class authNavigation(val navController: NavController){

    fun toHomeScreen() {
        navController.navigate(route= HOME_SCREEN){
            popUpTo(HOME_SCREEN){inclusive = true}
        }
    }

}