package services.funcional

fun testaFuncoesAgregadoras() {
    val idades: IntArray = intArrayOf(5, 10, 6, 8, 12, 18, 25)

    println(idades.maxOrNull())
    println(idades.minOrNull())
    println(idades.average())
    println(idades.all { it >= 18 })
    println(idades.any { it >= 18 })
    println(idades.filter { it >= 18 })
    println(idades.find { it >= 18 })
}
