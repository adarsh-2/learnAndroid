package com.example.viewmodelscopedemo.model

import kotlinx.coroutines.delay

class UserRepository {
    suspend fun getUsers() : List<User>{
        delay(8000)
        val users : List<User> = listOf(
            User(1, "Adarsh"),
            User(2, "Rohit"),
            User(3, "Krishna"),
            User(4, "Kanha")
        )

        return users
    }
}