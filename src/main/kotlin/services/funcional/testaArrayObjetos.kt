package services.funcional

import java.math.BigDecimal
import java.math.RoundingMode

fun testaArrayObjetos() {
    val salarios = bigDecimalArrayOf("1000", "2000", "5000", "10000")
    println(salarios.contentToString())

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> =
        salarios.map { salario ->
            if (salario < "5000".toBigDecimal()) {
                salario + "500".toBigDecimal().setScale(2)
            } else {
                (salario * aumento).setScale(2)
            }
        }.toTypedArray()
    println(salariosComAumento.contentToString())

    println(salariosComAumento.somatoria())

    println(salariosComAumento.fold(salariosComAumento.somatoria()) { acc, salario ->
        acc + (salario * (6.toBigDecimal()).setScale(2, RoundingMode.UP))
    })

    //Maneira Bruta
    val salariosOrdenados = salariosComAumento.sorted()
    val tresUltimosSalarios: Array<BigDecimal> = salariosOrdenados.takeLast(3).toTypedArray()
    println(tresUltimosSalarios.media())

    //Maneira rebuscada
    println(
        salariosComAumento
            .sorted().takeLast(3).toTypedArray().media()
    )

    println(
        salariosComAumento
            .sorted().take(3).toTypedArray().media()
    )
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria(): BigDecimal {
    return this.reduce { acc, valor ->
        acc + valor
    }
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()) {
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }
}