package model.conta

import exception.FalhaAutenticacaoException
import exception.SaldoInsuficienteException
import model.Autenticavel
import model.cliente.Cliente

abstract class Conta(
    val titular: Cliente,
    val numeroConta: Int,
    saldo: Double = 0.0
) : Autenticavel {
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

    override fun autenticar(senha: Int): Boolean {
        return titular.autenticar(senha)
    }

    fun depositar(deposito: Double) {
        println("INCIANDO DEPOSITO")
        this.saldo += deposito
        println("Conta: ${this.titular.nome}")
        println("Saldo: ${this.saldo}")
    }

    abstract fun sacar(saque: Double)

    fun transferir(contaDestino: Conta, valor: Double, senha: Int) {
        println("INCIANDO TRANSFERÊNCIA")
        if (this.saldo < valor) {
            throw SaldoInsuficienteException("O saldo é insuficiente, saldo atual: $saldo")
        }
        if (!autenticar(senha)) {
            throw FalhaAutenticacaoException()
        }
        this.saldo -= valor
        contaDestino.saldo += valor
        println("ContaOrigem Titular: ${this.titular.nome}")
        println("ContaOrigem Saldo: ${this.saldo}")
        println("ContaDestino Titular: ${contaDestino.titular.nome}")
        println("ContaDestino Saldo: ${contaDestino.saldo}")
    }
}

