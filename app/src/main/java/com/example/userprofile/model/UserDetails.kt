package com.example.userprofile.model

data class UserDetails(
    val name : String = "",
    val email : String = "",
    val age: String = ""
)

data class UserFormState(
    val name: String = "",
    val email: String = "",
    val age: String = "",
    val nameError: String? = null,
    val emailError: String? = null,
    val ageError: String? = null
)