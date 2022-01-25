open class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
) : Funcionario(nome, cpf, salario) {
    override val bonificar: Double get() = salario

    fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }
}