package services.funcional

fun testaAssinatura() {
    val funcao: () -> Unit = ::testeFuncao
    println(funcao())

    val classe: () -> Unit = TesteClasse()
    println(classe())

    val funcaoLambda: () -> Unit = {
        println("Teste função lambda")
    }
    println(funcaoLambda())

    val funcaoAnonima: () -> Unit = fun() {
        println("Teste função anonima")
    }
    println(funcaoAnonima())


}

fun testeFuncao() {
    println("Teste função")
}

class TesteClasse : () -> Unit {
    override fun invoke() {
        println("Teste classe")
    }
}
