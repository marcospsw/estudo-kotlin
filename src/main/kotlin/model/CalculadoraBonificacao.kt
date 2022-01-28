package model

import model.funcionario.Funcionario

class CalculadoraBonificacao {
    private var total: Double = 0.0

    fun registra(funcionario: Funcionario) {
        this.total += funcionario.bonificar
    }

    fun getTotal(): Double {
        return total
    }
}