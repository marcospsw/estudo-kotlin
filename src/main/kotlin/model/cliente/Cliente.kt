package model.cliente

import model.Autenticavel

class Cliente(val nome: String, val cpf: String, private val senha: Int, var endereco: Endereco = Endereco()) :
    Autenticavel {
    override fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }
}