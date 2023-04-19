package com.example.listapersonagens.data.datasourse

import android.content.Context
import com.example.listapersonagens.data.model.domain.Profile

class UserLocalDataSource(context: Context) {
    fun getProfile(): Profile {
        return Profile("","","")
    }
}