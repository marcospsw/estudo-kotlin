package model.conta

import model.cliente.Cliente

class ContaCorrente(
    titular: Cliente,
    numeroConta: Int,
    saldo: Double = 0.0
) : Conta(titular, numeroConta, saldo) {
    override fun sacar(saque: Double) {
        println("INCIANDO SAQUE")
        if (this.saldo < saque) {
            println("SALDO INDISPONÍVEL")
            println("Saldo disponível: $this.saldo")
            println("Valor do saque a ser realizado: $saque")
            return
        }
        this.saldo -= saque - 0.3
        println("Conta: ${this.titular.nome}")
        println("Saldo: ${this.saldo}")
    }
}