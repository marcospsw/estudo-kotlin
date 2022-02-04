package services.funcional

fun testaListaEspecifica() {
    val pedidos = mutableMapOf<Int, Double>(Pair(1, 20.0), Pair(2, 35.0), 3 to 50.0)

    val pedido = pedidos.getValue(1)

    println(pedido)

    val i = 4

    val valor = pedidos.getOrElse(i) {
        pedidos.getValue(i - 1)
    }
    pedidos[i] = valor
    println(pedidos[i])

    println(pedidos.getOrDefault(5, 20.0))

    val filtro = pedidos.filter { (chave, valor) ->
        valor > 20.0
    }

    println(filtro)

    println(pedidos + Pair(7, 90.0))
    println(pedidos - 4)

    pedidos.putAll(mutableListOf(8 to 90.0, 9 to 100.0))
    println(pedidos)

    pedidos += (mutableListOf(8 to 90.0, 9 to 100.0))
    println(pedidos)

    pedidos -= (9)
    println(pedidos)

}











