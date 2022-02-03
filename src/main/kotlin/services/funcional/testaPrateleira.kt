package services.funcional

import model.prateleira.Prateleira

fun testaPrateleira() {
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivrosMutaveis())

    val prateleira2 = Prateleira(genero = "Literatura", livros = listaDeLivrosMutaveis())

    val organizarPorAutor = prateleira.organizarPorAutor()
    organizarPorAutor.imprime()
    val organizarPorAnoPublicacao = prateleira.organizarPorAnoPublicacao()
    organizarPorAnoPublicacao.imprime()
}