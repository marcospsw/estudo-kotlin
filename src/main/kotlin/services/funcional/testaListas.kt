package services.funcional

import model.livro.Livro

fun testaListas() {
    listaDeLivrosMutaveis().add(Livro(titulo = "livro5", autor = "autor5", anoPublicacao = 2020, editora = "editora5"))
    listaDeLivrosMutaveis().removeAt(3)

    listaDeLivrosMutaveis().sorted()
    listaDeLivrosMutaveis().sortBy { it.titulo }
    val listaTitulos =
        listaDeLivrosMutaveis().filter { livro -> livro.autor == "autor1" }.sortedBy { it.editora }.map { it.titulo }
    println(listaTitulos)
    listaDeLivrosMutaveis().imprime()
}

fun List<Livro?>.imprime() {
    val joinToString = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            " - ${it.titulo} de ${it.autor}"
        }
    println(joinToString)
}