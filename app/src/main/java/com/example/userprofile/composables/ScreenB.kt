package com.example.userprofile.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.userprofile.UserViewModel
import com.example.userprofile.model.UserDetails

@Composable
fun NextScreen(navController: NavController, viewModel: UserViewModel) {
    val state = viewModel.user.collectAsState()
    val user = state.value
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Name: ${user.name}", modifier = Modifier.padding(8.dp))
        Text("Email: ${user.email}", modifier = Modifier.padding(8.dp))
        Text("Age: ${user.age}", modifier = Modifier.padding(8.dp))


        Button(onClick = {
            navController.popBackStack()
        }, modifier = Modifier.padding(8.dp)) {
            Text("Go Back")
        }
    }
}