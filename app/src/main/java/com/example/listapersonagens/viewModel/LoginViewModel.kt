package com.example.listapersonagens.viewModel

import com.example.listapersonagens.data.model.domain.Profile
import com.example.listapersonagens.data.repository.UserRepository

class LoginViewModel(
    private val userRepository: UserRepository
) {
    fun login(email: String, password: String): Boolean {
        return userRepository.login(email, password)
    }

    fun getProfile(): Profile {
        return userRepository.getProfile()
    }
}