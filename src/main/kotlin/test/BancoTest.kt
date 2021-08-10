package test

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digione = Banco(nome = "brad", numero = 14)
    println(digione.info())

    val banc = digione.copy(nome = "sas")
    println(digione.info())
}