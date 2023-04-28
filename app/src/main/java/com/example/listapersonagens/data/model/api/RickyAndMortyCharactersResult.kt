package com.example.listapersonagens.data.model.api

data class RickyAndMortyCharacters(
    val results: List<RickyAndMortyCharacterResponse>
)

data class RickyAndMortyCharacterResponse (
    val name: String,
    val image: String
)
