package test

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val pedro = Gerente(
        "Pedro",
        "12345689",
        2000.00,
        "Gerente",
        "1234")
    ImprimeRelatorioFuncionario.imprimir(pedro)
    TesteAuth().testeAutenticacao(pedro)
}

