package services.funcional

fun testaSets() {
    val android = setOf("Alex", "Fran", "Maria")
    val kotlin = setOf("Alex", "Maria", "Eduardo")

    val ambos = mutableListOf<String>()
//    ambos.addAll(android + kotlin)
    println(android union kotlin)
    println(android subtract kotlin)
    println(android intersect kotlin)

    ambos.addAll((android union kotlin).toMutableList())
    ambos.add("Marcos")
    ambos.add("Marcos")
    println(ambos)

    val set = ambos.toMutableSet()
    println(set)
}