package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    cpf:String,
    salario: Double,
    cargo: String,
    val senha :String
):Funcionario(nome=nome,cpf=cpf,cargo=cargo,salario=salario), Log {
    override fun calculoSalario(): Double = salario + salario * 0.4
    override fun login(): Boolean = "123" == senha
}