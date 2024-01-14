package com.example.pocnavgtion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

import dagger.hilt.android.AndroidEntryPoint
import com.example.pocnavgtion.ui.M3NavigationDrawerTheme
import com.example.presentation.navigation.NavGraph


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private lateinit var navHostController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            M3NavigationDrawerTheme {
                // A surface container using the 'background' color from the theme

                navHostController = rememberNavController()


                com.example.presentation.navigation.NavGraph(navHostController)
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    M3NavigationDrawerTheme {
        Greeting("Androidddddsdsd")
    }
}