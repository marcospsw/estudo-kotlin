package services.funcional

fun testaListasAtributosNulos() {

    listaDeLivrosMutaveis()
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { (editora, livros) ->
            println("$editora : ${livros.joinToString { it.titulo }}")
        }
}