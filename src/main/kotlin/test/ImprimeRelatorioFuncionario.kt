package test

import one.digitalinnovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario {
    companion object{
        fun imprimir(funcionario: Funcionario) {
            println(
                funcionario.toString()
            )
        }
    }
}