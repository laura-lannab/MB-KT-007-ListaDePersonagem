package com.example.listapersonagens.data.datasourse

import com.example.listapersonagens.data.network.service.LoginRetrofitService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class UserRemoteDataSource(private val loginService: LoginRetrofitService) {

    fun login(email: String, password: String): Boolean {
        return loginService.login(email, password)

    }
}