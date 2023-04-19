package com.example.listapersonagens.data.network.service

import com.example.listapersonagens.data.model.api.RickyAndMortyCharacters
import retrofit2.http.GET

interface RickyAndMortyService {
    
    @GET("character")
    suspend fun getCharacters(): RickyAndMortyCharacters
    
}