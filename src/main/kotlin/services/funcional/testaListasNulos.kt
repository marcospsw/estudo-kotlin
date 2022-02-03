package services.funcional

import model.livro.Livro

fun testaListasNulos() {
    listaDeLivrosMutaveis().add(Livro(titulo = "livro5", autor = "autor5", anoPublicacao = 2020, editora = "editora5"))

    listaDeLivrosMutaveis().imprime()
}