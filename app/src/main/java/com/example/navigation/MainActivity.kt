package com.example.navigation

import android.os.Bundle
import androidx.navigation.compose.rememberNavController
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            NavigationTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = Screen.Home.route
                    )
                    {
                        composable( Screen.Home.route) {
                            HomeScreen(navController = navController)
                        }
                        composable( Screen.Second.route + "/{url}",
                            arguments = listOf(
                                navArgument("url") {type = NavType.StringType}
                            )
                        ) {
                            backStackEntry ->
                            val url = backStackEntry.arguments?.getString("url")
                            SecondScreen(
                                backStackEntry = backStackEntry,
                                navController = navController,
                                url = url // Pass url to SecondScreen
                            )
                        }
                        composable( Screen.Last.route) {
                            LastScreen(navController = navController)
                        }

                    }



                }
            }

        }
    }
}

