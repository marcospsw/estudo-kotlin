package services.funcional

fun testaMap() {
    val pedidos = mutableMapOf<Int, Double>(Pair(1, 20.0), Pair(2, 35.0), 3 to 50.0)
    println(pedidos)

    println(pedidos[0])
    val pedidoOp = pedidos[5]
    pedidoOp?.let {
        println("$it")
    }

    for (pedido in pedidos) {
        println(pedido.key)
        println(pedido.value)
    }

    pedidos[4] = 70.0
    pedidos.put(5, 80.0)

    pedidos[1] = 60.0
    pedidos.putIfAbsent(1, 500.0)
}