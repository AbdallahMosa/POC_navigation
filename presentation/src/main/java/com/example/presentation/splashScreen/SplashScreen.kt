package com.example.presentation.splashScreen


import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.presentation.navigation.SplashNavigation

@Composable
fun SplashScreen(splashNavigation: SplashNavigation) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Splash Screen")

            Spacer(modifier = Modifier.height(20.dp))

            Button(onClick = { splashNavigation.toLogin() }) {
                Text(text = "Go to Login")
            }
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = { splashNavigation.toHome() }) {
                Text(text = "Go to Home")
            }

        }
    }
}

