package one.digitalinnovation.digionebank

import java.math.BigDecimal

 abstract class Funcionario(
     nome: String,
     cpf: String,
     var cargo: String,
     var salario: Double
    ): Pessoa(nome,cpf) {
     protected abstract fun calculoSalario(): Double

     override fun toString(): String ="""
     Nome: $nome
     CPF: $cpf
     cargo: $cargo
     Salário base: $salario
     Sálario + Comissão: ${calculoSalario()}
     """.trimIndent()
     }
