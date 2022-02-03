package services.funcional

fun testaArray() {
    val arrayDeInteiro = IntArray(3)
    arrayDeInteiro[0] = 1
    arrayDeInteiro[1] = 2
    arrayDeInteiro[2] = 3

    var maiorInteiro = Int.MIN_VALUE

    for (inteiro in arrayDeInteiro) {
        if (inteiro > maiorInteiro) {
            maiorInteiro = inteiro
        }
    }

    println(maiorInteiro)

    val arrayDeChar = charArrayOf('M', 'P', 'S', 'W')

    var letraInicial: Char

    arrayDeChar.forEach { char ->
        if (char == 'M') {
            letraInicial = char
            println(letraInicial)
        }
    }
}