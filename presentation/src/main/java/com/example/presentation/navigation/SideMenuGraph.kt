package com.example.presentation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.presentation.mailbox.mailBoxScreen

fun NavGraphBuilder.sideMenuGraph(sideMenu: HomeNavigation){

    composable(route = "Mailbox_Screen"){
        mailBoxScreen()

    }

}

