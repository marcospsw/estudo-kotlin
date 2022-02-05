package model.cliente

class Endereco(var rua: String = "", var numero: String = "", var cep: Int = 0) {
    fun completo(): String {
        return "$rua, numero: $numero, CEP: $cep "
    }

}