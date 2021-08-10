package test

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val test = Analista(
        "Lukas",
        "12345689",
        "Analista de Sistemas",
        1000.00
    )
    ImprimeRelatorioFuncionario.imprimir(test)
}
