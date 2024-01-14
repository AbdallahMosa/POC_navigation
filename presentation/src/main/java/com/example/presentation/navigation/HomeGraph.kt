package com.example.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.core.util.Constant.HOME_SCREEN
import com.example.presentation.homeScreen.HomeScreenCompose

fun NavGraphBuilder.homeScreenGraph(homeNavigation: HomeNavigation){


    navigation(startDestination = HOME_SCREEN, route = "home_graph"){
        composable(route = HOME_SCREEN){
            HomeScreenCompose(homeNavigation)
        }

        sideMenuGraph(homeNavigation)

    }



}

class HomeNavigation(val navController: NavController){

    fun toSideMenuItem(route : String){
        navController.navigate(route){
            popUpTo(route){inclusive= true}
        }
    }


}