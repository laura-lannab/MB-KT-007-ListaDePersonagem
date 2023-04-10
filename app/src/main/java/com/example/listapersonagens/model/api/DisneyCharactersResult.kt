package com.example.listapersonagens.model.api

data class DisneyCharactersResult(
    val data: List<DisneyCharacterResponse>
)

data class DisneyCharacterResponse(
    val name: String,
    val imageUrl: String
)
