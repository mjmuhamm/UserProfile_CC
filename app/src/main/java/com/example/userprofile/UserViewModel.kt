package com.example.userprofile

import androidx.lifecycle.ViewModel
import com.example.userprofile.model.UserDetails
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class UserViewModel : ViewModel() {

    private val _user = MutableStateFlow(UserDetails())
    val user = _user.asStateFlow()

    fun saveUser(user: UserDetails) {
        _user.update {
            it.copy(name = user.name, email = user.email, age = user.age)
        }
    }




}