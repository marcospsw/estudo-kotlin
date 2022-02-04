package services.funcional

fun testaConcatenarListas() {
    val android: List<String> = listOf("Alex", "Fran", "Maria")
    val kotlin: List<String> = listOf("Alex", "Maria")

    val ambos = mutableListOf<String>()

    ambos.addAll(android + kotlin)

    println(ambos.distinct())
}