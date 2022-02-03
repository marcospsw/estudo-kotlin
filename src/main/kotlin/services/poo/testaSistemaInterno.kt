package services

import model.SistemaInterno
import model.cliente.Cliente
import model.funcionario.Diretor
import model.funcionario.Gerente

fun testaSistemaInterno() {
    val sistemaInterno = SistemaInterno()
    val gerente = Gerente(nome = "Gerente", cpf = "222.222.222-22", salario = 2000.0, senha = 1234)

    println("Nome: ${gerente.nome}")
    println("CPF: ${gerente.cpf}")
    println("Salario: ${gerente.salario}")
    println("Bonificação: ${gerente.bonificar}")
    sistemaInterno.login(gerente, 1234)

    val diretor = Diretor(
        nome = "Diretor",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 456,
        plr = 1000.00
    )

    println("Nome: ${diretor.nome}")
    println("CPF: ${diretor.cpf}")
    println("Salario: ${diretor.salario}")
    println("Bonificação: ${diretor.bonificar}")
    sistemaInterno.login(diretor, 1234)

    val cliente = Cliente(nome = "Cliente", cpf = "444.444.444-44", senha = 456)

    println("Nome: ${cliente.nome}")
    println("CPF: ${cliente.cpf}")
    sistemaInterno.login(cliente, 456)
}