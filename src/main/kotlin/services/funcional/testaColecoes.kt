package services.funcional

fun testaColecoes() {
    val letras: Iterable<String> = listOf("A", "B", "C", "D")
    val letrasMutaveis: Collection<String> = mutableListOf("A", "B", "C", "D")

    println(letrasMutaveis.contains("A"))
    println(letras)
}