fun main() {
    var primerNumero: Int = 0
    var segundoNumero: Double = 0.1

    tituloPrincipal()
    horasTrabajadas()
    primerNumero = readLine()!!.toInt()
    salarioPorHora()
    segundoNumero = readLine()!!.toDouble()
    println("El salario quincelas por las horas trbajadas es ${calcularElSalarioQuincenal(primerNumero = primerNumero,segundoNumero=segundoNumero)}")
}