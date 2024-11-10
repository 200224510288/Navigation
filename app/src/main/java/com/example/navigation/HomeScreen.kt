package com.example.navigation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp), // Add padding to match the SecondScreen
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Home Screen",
            fontSize = 24.sp // Increased font size for consistency with the SecondScreen
        )

        Spacer(modifier = Modifier.height(24.dp)) // Increased spacing between elements

        Button(
            onClick = { navController.navigate(Screen.Second.route + "/www.url.com" ) },
            modifier = Modifier.padding(vertical = 8.dp)
        ) {
            Text(text = "Go To Second")
        }
    }
}
