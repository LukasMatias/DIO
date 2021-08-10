package test

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main() {
    val pedro = Analista(
        "Pedro",
        "12345689",
        "Gerente",
        2000.00)
    ImprimeRelatorioFuncionario.imprimir(pedro)
}

