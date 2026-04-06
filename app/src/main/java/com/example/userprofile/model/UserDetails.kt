package com.example.userprofile.model

data class UserDetails(
    val name: String = "",
    val email: String = "",
    val age: Int? = 0,
)

data class UserFormState(
    val name: String = "",
    val email: String = "",
    val age: Int = 0,
    val nameError: String? = null,
    val emailError: String? = null,
    val ageError: String? = null
)