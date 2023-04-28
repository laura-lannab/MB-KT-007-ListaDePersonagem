package com.example.listapersonagens.data.model.mapper

import com.example.listapersonagens.data.model.domain.Character
import com.example.listapersonagens.data.model.api.DisneyCharacterResponse
import com.example.listapersonagens.data.model.api.RickyAndMortyCharacterResponse

//Princípio da substituição de Liskov - O princípio da substituição de Liskov declara que as
// subclasses devem ser substituíveis por suas classes de base.
//A classe Character, na linha 15 e 25, foram substituídas por suas devidas subclasses, sem preocupações
// com resultados inesperados. Isso permite que o polimorfismo pode ser usado com maior confiança.

@JvmName("toDisneyDomain")
fun List<DisneyCharacterResponse>.toDomain(): List<Character> {
    return this.map {
        Character.DisneyCharacter(
            name = it.name,
            imageUrl = it.imageUrl
        )
    }
}

@JvmName("toRickyAndMortyDomain")
fun List<RickyAndMortyCharacterResponse>.toDomain(): List<Character> {
    return this.map {
        Character.RickyAndMortyCharacter(
            name = it.name,
            imageUrl = it.image
        )
    }
}