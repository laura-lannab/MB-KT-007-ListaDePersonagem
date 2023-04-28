package com.example.listapersonagens.data.network.authentication

import com.example.listapersonagens.data.model.domain.User

object BackendAuthenticator : Authenticator {
    
    private val registeredUsers = listOf(
        User("teste3@gmail.com", "789"),
        User("teste4@gmail.com", "123")
    )
    
    override fun login(email: String, password: String): Boolean =
        registeredUsers.any { it.email == email && it.password == password }
    
}