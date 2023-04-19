package com.example.listapersonagens.data.model.api

data class DisneyCharactersResult(
    val data: List<DisneyCharacterResponse>
)

data class DisneyCharacterResponse(
    val name: String,
    val imageUrl: String
)
