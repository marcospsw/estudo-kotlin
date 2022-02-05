package services.funcional

import model.Autenticavel
import model.SistemaInterno
import model.cliente.Endereco

fun testaHighOrder() {
//    val testeFuncao: () -> Unit
//
//    "".let {
//        it
//    }
//
//    fun testando(funcao: () -> Unit) {}

    val enderecoTeste = Endereco(rua = "Teste", numero = "2", cep = 25230)
    val enderecoMaiusculo =
        "Rua: ${enderecoTeste.rua}, Numero: ${enderecoTeste.numero}, Cep: ${enderecoTeste.cep}".toUpperCase()
    println(enderecoMaiusculo)

    Endereco(rua = "Teste", numero = "2", cep = 25230).let { endereco ->
        "Rua: ${endereco.rua}, Numero: ${endereco.numero}, Cep: ${endereco.cep}".toUpperCase()
    }.let { println(it) }

    soma(1, 3) {
        println(it)
    }

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autenticar(senha: Int): Boolean = this.senha == senha
    }

    SistemaInterno().login(autenticavel, senha = 1234) {
        println("pagar")
    }
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Antes da soma")
    resultado(a + b)
    println("Depois da soma")
}

