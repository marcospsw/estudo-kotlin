class ContaCorrente(
    titular: String,
    numeroConta: Int,
    saldo: Double = 0.0
) : Conta(titular, numeroConta, saldo) {
    override fun sacar(saque: Double) {
        super.sacar(saque + 3.0)
    }
}