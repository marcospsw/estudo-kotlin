package services.funcional

import model.livro.Livro

fun listaDeLivrosMutaveis(): MutableList<Livro> {
    val livro1 = Livro(titulo = "livro1", autor = "autor1", anoPublicacao = 1980, editora = "editora1")
    val livro2 = Livro(titulo = "livro2", autor = "autor2", anoPublicacao = 2000, editora = "editora2")
    val livro3 = Livro(titulo = "livro3", autor = "autor3", anoPublicacao = 1990)
    val livro4 = Livro(titulo = "livro4", autor = "autor4", anoPublicacao = 2010)

    return mutableListOf(livro1, livro2, livro3, livro4)
}