package model.conta

import model.cliente.Cliente

abstract class Conta(
    val titular: Cliente,
    val numeroConta: Int,
    saldo: Double = 0.0
) {
    var saldo = saldo
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        total++
        println("Total de contas: $total")
    }

    fun depositar(deposito: Double) {
        println("INCIANDO DEPOSITO")
        this.saldo += deposito
        println("model.conta.Conta: ${this.titular}")
        println("Saldo: ${this.saldo}")
    }

    abstract fun sacar(saque: Double)

    fun transferir(contaDestino: Conta, valor: Double) {
        println("INCIANDO TRANSFERÊNCIA")
        if (this.saldo < valor) {
            println("SALDO INDISPONÍVEL")
            return
        }
        this.saldo -= valor
        contaDestino.saldo += valor
        println("ContaOrigem Titular: ${this.titular}")
        println("ContaOrigem Saldo: ${this.saldo}")
        println("ContaDestino Titular: ${contaDestino.titular}")
        println("ContaDestino Saldo: ${contaDestino.saldo}")
    }
}