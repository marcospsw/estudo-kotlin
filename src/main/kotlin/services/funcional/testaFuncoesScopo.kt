package services.funcional

import model.cliente.Endereco

fun testaFuncoesScopo() {
    val endereco = Endereco("Rua aaaa", "20", 25230)

    endereco.let {
        val teste = it.cep * 2

        println(teste)
    }

    with(endereco) {
        val teste = cep * 2

        println(teste)
    }

    endereco.run {
        val teste = cep * 2

        println(teste)
    }

    endereco.apply {
        val teste = cep * 2

        println(teste)
    }

    endereco.also {
        val teste = it.cep * 2

        println(teste)
    }

}