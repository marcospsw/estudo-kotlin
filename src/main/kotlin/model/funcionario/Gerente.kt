package model.funcionario

open class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(nome, cpf, salario, senha) {
    override val bonificar: Double get() = salario
}