package services

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