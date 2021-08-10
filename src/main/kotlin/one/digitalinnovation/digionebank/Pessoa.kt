package one.digitalinnovation.digionebank

class Pessoa {
    var name: String  = "Lukas"
    private set
    var cpf: String = "085.448.764.00"
    private set

fun pessoaInfo() = " Nome: ${name.toUpperCase()}\n CPF: $cpf"
}
 fun main(){
     val test = Pessoa()
     println(test.pessoaInfo())
 }
