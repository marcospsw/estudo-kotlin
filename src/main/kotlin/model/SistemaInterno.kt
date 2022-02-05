package model

class SistemaInterno {
    fun login(funcionario: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        println("Iniciando Autenticação")
        if (funcionario.autenticar(senha)) {
            println("Funcionario Autenticado")
        } else {
            println("Falha Na Autenticação")
        }
    }

    fun loginReceiver(funcionario: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}) {
        println("Iniciando Autenticação")
        if (funcionario.autenticar(senha)) {
            println("Funcionario Autenticado")
        } else {
            println("Falha Na Autenticação")
        }
    }
}