fun testaFuncionarios() {
    val funcionario = Analista(nome = "FuncionarioAnalista", cpf = "111.111.111-11", salario = 1000.0)

    println("Nome: ${funcionario.nome}")
    println("CPF: ${funcionario.cpf}")
    println("Salario: ${funcionario.salario}")
    println("Bonificação: ${funcionario.bonificar}")

    val gerente = Gerente(nome = "Gerente", cpf = "222.222.222-22", salario = 2000.0, senha = 1234)

    println("Nome: ${gerente.nome}")
    println("CPF: ${gerente.cpf}")
    println("Salario: ${gerente.salario}")
    println("Bonificação: ${gerente.bonificar}")
    println("Autentiquei: ${gerente.autenticar(1234)}")

    val diretor = Diretor(nome = "Diretor", cpf = "333.333.333-33", salario = 4000.0, senha = 456, plr = 1000.00)

    println("Nome: ${diretor.nome}")
    println("CPF: ${diretor.cpf}")
    println("Salario: ${diretor.salario}")
    println("Bonificação: ${diretor.bonificar}")
    println("Autentiquei: ${diretor.autenticar(758)}")

    val analista = Analista(nome = "Analista", cpf = "444.444.444-44", salario = 3000.0)
    println("Nome: ${analista.nome}")
    println("CPF: ${analista.cpf}")
    println("Salario: ${analista.salario}")
    println("Bonificação: ${analista.bonificar}")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(funcionario)
    calculadora.registra(gerente)
    calculadora.registra(diretor)
    calculadora.registra(analista)

    println("Total de bonificação: ${calculadora.getTotal()}")
}