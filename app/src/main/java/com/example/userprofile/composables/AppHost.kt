package com.example.userprofile.composables

import android.service.autofill.UserData
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.userprofile.UserViewModel
import com.example.userprofile.model.UserDetails

@Composable
fun AppHost(modifier: Modifier, viewModel: UserViewModel) {
    val navController = rememberNavController()

    NavHost(
        startDestination = "Home",
        navController = navController

    ) {
        composable(route = "Home") {
            FirstScreen(navController, viewModel)
        }
        composable(route = "Next") {
            NextScreen(navController, viewModel)
        }
    }

}