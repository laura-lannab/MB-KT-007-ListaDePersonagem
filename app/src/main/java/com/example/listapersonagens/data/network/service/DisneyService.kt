package com.example.listapersonagens.data.network.service

import com.example.listapersonagens.data.model.api.DisneyCharactersResult
import retrofit2.http.GET

interface DisneyService {
    
    @GET("characters")
    suspend fun getCharacters(): DisneyCharactersResult
    
}