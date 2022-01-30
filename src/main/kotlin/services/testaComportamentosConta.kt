package services

import exception.FalhaAutenticacaoException
import exception.SaldoInsuficienteException
import model.cliente.Cliente
import model.conta.ContaCorrente
import model.conta.ContaPoupanca

fun testaComportamentosConta() {
    val cliente = Cliente("Marcos", "111.111.111-11", senha = 123)

    val contaMarcos = ContaCorrente(cliente, 157)
    val contaAlex = ContaPoupanca(cliente, 123, 15.0)

    println("INICIANDO OPERAÇÕES")
    contaMarcos.depositar(50.0)
    contaMarcos.sacar(25.0)
    contaMarcos.transferir(contaAlex, 15.0, 123)

    val contaCorrente = ContaCorrente(cliente, 157)
    val contaPoupanca = ContaPoupanca(cliente, 123, 15.0)

    println("INICIANDO OPERAÇÕES")
    contaCorrente.depositar(50.0)
    contaCorrente.sacar(25.0)

    contaPoupanca.depositar(50.0)
    contaPoupanca.sacar(25.0)

    try {
        contaCorrente.transferir(contaPoupanca, 10.0, 157)
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro Desconhecido!!!")
        e.printStackTrace()
    }
}