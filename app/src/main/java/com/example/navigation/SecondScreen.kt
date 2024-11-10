package com.example.navigation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController

@Composable
fun SecondScreen(navController: NavHostController,
                 backStackEntry: NavBackStackEntry,
                 url: String?
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp), // Add padding to create more space around the content
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Second Screen",
            fontSize = 24.sp, // Increased font size for emphasis
        )

        Spacer(modifier = Modifier.height(24.dp)) // Add more space between the text and button

        Button(
            onClick = { navController.navigate("last") },
            modifier = Modifier.padding(vertical = 8.dp) // Add padding for a bit more spacing
        ) {
            Text(text = "Go To Last:  $url")
        }
    }
}
