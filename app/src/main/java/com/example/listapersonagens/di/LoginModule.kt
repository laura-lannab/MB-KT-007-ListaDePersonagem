package com.example.listapersonagens.di

import com.example.listapersonagens.data.datasourse.UserLocalDataSource
import com.example.listapersonagens.data.datasourse.UserRemoteDataSource
import com.example.listapersonagens.data.network.service.LoginRetrofitService
import com.example.listapersonagens.data.repository.UserRepository
import com.example.listapersonagens.viewModel.LoginViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val loginModule = module {
    single<LoginRetrofitService> {
        object : LoginRetrofitService {
            override fun login(email: String, password: String): Boolean {
                return true
            }
        }
    }
    single { UserRemoteDataSource(get()) }
    single { UserLocalDataSource(androidContext()) }
    single { UserRepository(get(), get()) }
    factory { LoginViewModel(get()) }
}