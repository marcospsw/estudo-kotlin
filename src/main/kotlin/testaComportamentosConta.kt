fun testaComportamentosConta() {
    val contaMarcos = Conta("Marcos", 157)
    val contaAlex = Conta("Alex", 123, 15.0)

    println("INICIANDO OPERAÇÕES")
    contaMarcos.depositar(50.0)
    contaMarcos.sacar(25.0)
    contaMarcos.transferir(contaAlex, 15.0)

    val contaCorrente = ContaCorrente("Marcos", 157)
    val contaPoupanca = ContaPoupanca("Alex", 123, 15.0)

    println("INICIANDO OPERAÇÕES")
    contaCorrente.depositar(50.0)
    contaCorrente.sacar(25.0)

    contaPoupanca.depositar(50.0)
    contaPoupanca.sacar(25.0)

    contaCorrente.transferir(contaPoupanca, 15.0)
}