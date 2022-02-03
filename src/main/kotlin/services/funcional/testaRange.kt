package services.funcional

fun testaRange() {
    val serie: IntRange = 1.rangeTo(10)

    for (i in serie) {
        println(i)
    }

    //".." -> Substitui o rangeTo
    // 0..100

    val numerosPares = 2.until(100) step 2
    for (numero in numerosPares) {
        print(numero)
    }

    println()

    val reversosPares = 100.downTo(0) step 2
    reversosPares.forEach {
        print(it)
    }
    println()


    val intervalo = 1000.0..5000.0
    val salario = 2500.0
    if (salario in intervalo) {
        println("Salario dentro do intervalo")
    }

    val intervaloLetras = 'a'..'z'
    val letra = 'm'
    if (letra in intervaloLetras) {
        println("Letra dentro do intervalo")
    }
}