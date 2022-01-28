package model

class SistemaInterno {
    fun login(funcionario: Autenticavel, senha: Int) {
        println("Iniciando Autenticação")
        if (funcionario.autenticar(senha)) {
            println("Funcionario Autenticado")
        } else {
            println("Falha Na Autenticação")
        }
    }
}