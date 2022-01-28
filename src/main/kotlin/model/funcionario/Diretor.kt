package model.funcionario

class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : FuncionarioAdmin(nome, cpf, salario, senha) {
    override val bonificar: Double get() = salario + plr
}