package com.example.listapersonagens.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listapersonagens.data.datasourse.UserLocalDataSource
import com.example.listapersonagens.data.datasourse.UserRemoteDataSource
import com.example.listapersonagens.data.network.service.LoginRetrofitService
import com.example.listapersonagens.data.repository.UserRepository
import com.example.listapersonagens.databinding.ActivityMainBinding
import com.example.listapersonagens.viewModel.LoginViewModel
import org.koin.android.ext.android.inject
import retrofit2.Retrofit

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val loginViewModel: LoginViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


    }

}
