import model.cliente.Cliente
import model.conta.ContaCorrente

fun exercicioObjeto() {
    val cliente = Cliente("Marcos", "111.111.111-11", senha = 123)
    val contaMarcos = ContaCorrente(cliente, 12, 12.0)

    println(contaMarcos.titular)
    println(contaMarcos.saldo + 5)
    println(contaMarcos.saldo)
}
