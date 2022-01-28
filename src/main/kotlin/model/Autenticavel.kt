package model

interface Autenticavel {
    fun autenticar(senha: Int): Boolean
}