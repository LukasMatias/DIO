package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    cpf:String,
    salario: Double,
    cargo: String
):Funcionario(nome=nome,cpf=cpf,cargo=cargo,salario=salario) {
    override fun calculoSalario(): Double = salario * 0.4
}