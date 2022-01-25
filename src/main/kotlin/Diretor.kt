class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int,
    val plr: Double
) : Gerente(nome, cpf, salario, senha) {
    override val bonificar: Double get() = super.bonificar + plr
}