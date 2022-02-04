package services.funcional

import model.pedido.Pedido

fun testaTranformacao() {
    val pedidos = listOf<Pedido>(
        Pedido(1, 20.0),
        Pedido(2, 30.0),
        Pedido(3, 40.0),
        Pedido(4, 50.0),
        Pedido(5, 60.0),
        Pedido(6, 70.0),
    )

    val pedidosMap = pedidos.associate { pedido: Pedido ->
        Pair(pedido.numero, pedido)
    }
    println(pedidosMap)

    val pedidosMapBy = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapBy)

    val pedidosMapWith = pedidos.associateWith {
        it.valor > 50
    }
    println(pedidosMapWith)

    val pedidoAgrupado = pedidos.groupBy { pedido -> pedido.valor >= 50 }
    println(pedidoAgrupado)

    val nomes = listOf("Marcos", "Mario", "Camile", "Tiago", "Carlos", "Renata")

    val agenda = nomes.groupBy { nome -> nome.first() }
    println(agenda)
}