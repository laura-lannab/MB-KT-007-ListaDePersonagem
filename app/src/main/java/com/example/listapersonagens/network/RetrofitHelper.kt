package com.example.listapersonagens.network

import com.example.listapersonagens.network.service.DisneyService
import com.example.listapersonagens.network.service.RickyAndMortyService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//Princípio da Responsabilidade Única — Esse princípio declara que uma classe deve ser especializada
// em um único assunto e possuir apenas uma responsabilidade dentro do software, ou seja, a classe
// deve ter uma única tarefa ou ação para executar.
// O código abaixo estava sendo utilizado na classe CharactersFragment, sendo que a classe deveria
// ter responsabilidade somente sobre views.
// Caso venha a ter alterações na classe CharactersFragment, seria difícil modificar uma dessas responsabilidades sem comprometer as outras.

object RetrofitHelper {
    private fun getRetrofit(url: String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private val retrofitDisney = getRetrofit("https://api.disneyapi.dev/")

    val disneyService: DisneyService = retrofitDisney.create(DisneyService::class.java)

    private val retrofitRickyAndMorty = getRetrofit("https://rickandmortyapi.com/api/")

    val rickyAndMortyService: RickyAndMortyService =
        retrofitRickyAndMorty.create(RickyAndMortyService::class.java)
}