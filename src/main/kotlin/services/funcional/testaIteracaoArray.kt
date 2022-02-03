package services.funcional

fun testaIteracaoArray() {
    val salarios: DoubleArray = doubleArrayOf(1500.0, 25600.5, 1200.6, 522.0)

    val aumento = 1.1

    for (index in salarios.indices) {
        salarios[index] *= aumento
    }

    println(salarios.contentToString())

    salarios.forEach { element ->
        println(element * 1.1)
    }

    salarios.forEachIndexed { index, element ->
        salarios[index] *= 1.1
    }

    println(salarios.contentToString())
}