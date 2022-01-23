fun main() {
    val contaMarcos = Conta("Marcos", 157)
    val contaAlex = Conta("Alex", 123, 15.0)

    println("INICIANDO OPERAÇÕES")
    contaMarcos.depositar(50.0)
    contaMarcos.sacar(25.0)

    contaMarcos.transferir(contaAlex, 15.0)
}

class Conta(
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

    fun sacar(saque: Double) {
        println("INCIANDO SAQUE")
        if (this.saldo < saque) {
            println("SALDO INDISPONÍVEL")
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
        this.sacar(valor)
        contaDestino.depositar(valor)
        println("ContaOrigem Titular: ${this.titular}")
        println("ContaOrigem Saldo: ${this.saldo}")
        println("ContaDestino Titular: ${contaDestino.titular}")
        println("ContaDestino Saldo: ${contaDestino.saldo}")
    }
}


fun exercicioObjeto() {
    val contaMarcos = Conta("Marcos", 12, 12.0)

    println(contaMarcos.titular)
    println(contaMarcos.saldo + 5)
    println(contaMarcos.saldo)
}

fun exercicioIfWhen(balance: Double) {
    if (balance > 0.0) {
        println("Conta Positiva")
    } else if (balance == 0.0) {
        println("Conta Neutra")
    } else {
        println("Conta Negativa")
    }

    when {
        balance > 0.0 -> println("Conta Positiva")
        balance == 0.0 -> println("Conta Neutra")
        else -> println("Conta Negativa")
    }
}

fun exercicioForWhile(balance: Double) {
    for (i in 1..5) {
        println("Passo: $i")
        println("Balance: ${balance + i}")
    }
    var i = 5
    while (i > 0) {
        println("I = $i")
        i--
    }
}