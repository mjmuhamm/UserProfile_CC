package com.example.userprofile.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.userprofile.UserViewModel
import com.example.userprofile.model.UserDetails

@Composable
fun FirstScreen(navController: NavController, viewModel: UserViewModel) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }


    Column(modifier = Modifier.fillMaxSize().background(Color.White), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Please enter name", modifier = Modifier.padding(8.dp))
        TextField(value = name, onValueChange = { name = it } )
        Text("Please enter email", modifier = Modifier.padding(8.dp))
        TextField(value = email, onValueChange = { email = it } )
        Text("Please enter age", modifier = Modifier.padding(8.dp))
        TextField(value = age, onValueChange = { age = it } )
        Button(onClick = {
            val user = UserDetails(name, email, age)
            viewModel.saveUser(user)
            navController.navigate("Next")
        }, modifier = Modifier.padding(8.dp)) {
            Text("Next Screen")
        }
    }
}
