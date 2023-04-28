package com.example.listapersonagens.data.network.authentication

//Princípio da segregação da interface - Segregação quer dizer manter as coisas separadas.
// O princípio da segregação da interface tem a ver com separar as interfaces.
//Foi criada essa interface para caso existam outros authenticator, sejam criados em outro objeto
// com suas devidas particularidades.

interface Authenticator {
    fun login(email: String, password: String): Boolean
}