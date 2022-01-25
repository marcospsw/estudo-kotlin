open class Conta(
    val titular: String,
    val numeroConta: Int,
    saldo: Double = 0.0
) {
    var saldo = saldo
        private set

    fun depositar(deposito: Double) {
        println("INCIANDO DEPOSITO")
        this.saldo += deposito
        println("Conta: ${this.titular}")
        println("Saldo: ${this.saldo}")
    }

    open fun sacar(saque: Double) {
        println("INCIANDO SAQUE")
        if (this.saldo < saque) {
            println("SALDO INDISPONÍVEL")
            println("Saldo disponível: $this.saldo")
            println("Valor do saque a ser realizado: $saque")
            return
        }
        this.saldo -= saque
        println("Conta: ${this.titular}")
        println("Saldo: ${this.saldo}")
    }

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