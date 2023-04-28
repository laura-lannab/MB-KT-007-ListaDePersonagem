package com.example.listapersonagens.data.repository

import com.example.listapersonagens.data.datasourse.UserLocalDataSource
import com.example.listapersonagens.data.datasourse.UserRemoteDataSource
import com.example.listapersonagens.data.model.domain.Profile

class UserRepository (
    private val userLocalDataSource: UserLocalDataSource,
    private val userRemoteDataSource: UserRemoteDataSource
){
    fun login(email: String, password: String): Boolean{
        return userRemoteDataSource.login(email, password)
    }

    fun getProfile(): Profile {
        return userLocalDataSource.getProfile()
    }
}