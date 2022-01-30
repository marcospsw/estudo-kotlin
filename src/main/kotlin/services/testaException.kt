package services

fun testaException(){
    try {
        lancandoException()
    } catch (e: TestaExceptionCustom) {
        e.printStackTrace()
    }
}

fun lancandoException() {
    val endereco = Any()
    throw TestaExceptionCustom()
}

class TestaExceptionCustom : Exception("Sera que vai funcionar ?")


