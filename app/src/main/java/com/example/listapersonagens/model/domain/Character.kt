package com.example.listapersonagens.model.domain

sealed class Character(private val name: String, private val imageUrl: String) {
    //Princípio aberto/fechado - O princípio de aberto/fechado diz que as classes devem estar
    // abertas para extensão, mas fechadas para modificação.
    // Aos construtores, foram adicionados modificadores de visibilidade, protegendo-os de possíveis
    // modificações e diminuindo as chances de introduzir novos bugs.

    fun getName(): String {
        return name
    }

    fun getImage(): String {
        return imageUrl
    }

    class RickyAndMortyCharacter(
        name: String,
        imageUrl: String
    ) : Character(name, imageUrl)

    class DisneyCharacter(
        name: String,
        imageUrl: String
    ) : Character(name, imageUrl)
}