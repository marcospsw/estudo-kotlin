package services

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