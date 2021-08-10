package test

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
val joao = Cliente(
    "Joao Marcos",
    "123.456.789.10",
    clienteTipo = ClienteTipo.PF,
    senha = "1234567"
)
    println(joao.toString())
    TesteAuth().testeAutenticacao(joao)

}