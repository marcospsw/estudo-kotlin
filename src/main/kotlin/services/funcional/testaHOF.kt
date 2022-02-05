package services.funcional

import model.cliente.Cliente
import model.cliente.Endereco
import model.conta.ContaPoupanca


fun testaHOF() {
    with(Endereco()) {
        rua = "Rua: 123"
        numero = "157"
        cep = 25000
        completo()
    }.let { completo -> println(completo) }

    Cliente("Marcos", "156", 123)
        .let { cliente ->
            ContaPoupanca(cliente, 157, 2500.00)
        }.run {
            depositar(1500.00)
            saldo * 0.05
        }.let(::println)

    val cli = ContaPoupanca(Cliente("Marcos", "156", 123), 157, 2500.00)

    val simu = run {
        var saldo = cli.saldo
        repeat(12) { indice ->
            saldo += saldo * 0.1
        }
        saldo
    }
    println(simu)

    val endereco = Endereco()
    endereco
        .also {
            println("Criando endereço")
        }.apply {
            rua = "Rua teste"
            numero = "157"
            cep = 250000
        }

    fun soma(a: Int, b: Int, result: (Int) -> Unit) {
        result(a + b)
    }
    soma(1, 8, ::println)
    soma(1, 8, result = {
        it.compareTo(8)
    })


    fun somaReceiver(a: Int, b: Int, result: Int.() -> Unit) {
        val total = a + b
        total.result()
    }
    somaReceiver(1, 8, ::println)
    somaReceiver(1, 8, result = {
        this.compareTo(8)
    })
}
