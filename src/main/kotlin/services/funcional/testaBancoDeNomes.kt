package services.funcional

fun testaBancoDeNomes() {
    val banco = BancoDeNomes()
    banco.salva("Testa")

    println(banco.nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}
