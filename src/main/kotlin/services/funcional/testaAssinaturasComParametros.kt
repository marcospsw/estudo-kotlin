package services.funcional

fun testaAssinaturaComParametros() {
    val funcao: (Int, Int) -> Int = ::testeFuncaoComParam
    println(funcao(5, 10))

    val classe: (Int, Int) -> Int = TesteClasseComParam()
    println(classe(1, 5))

    val funcaoLambda: (Int, Int) -> Int = { p1, p2 ->
        p1 + p2
    }
    println(funcaoLambda(5, 8))

    val funcaoAnonima: (Int, Int) -> Int = fun(p1, p2): Int {
        return p1 + p2
    }
    println(funcaoAnonima(5, 50))

    val funcaoLambdaMultiRetorno: (numero: Double) -> Double = lambda@{
        if (it > 20.0) {
            return@lambda it + 10.0
        }
        it + 100.0
    }
    println(funcaoLambdaMultiRetorno(500.0))

}

fun testeFuncaoComParam(a: Int, b: Int): Int {
    return (a + b)
}

class TesteClasseComParam : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int = p1 + p2

}





