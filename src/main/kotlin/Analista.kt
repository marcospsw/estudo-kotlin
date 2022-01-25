class Analista(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(nome, cpf, salario) {
    override val bonificar: Double get() = salario * 0.1
}