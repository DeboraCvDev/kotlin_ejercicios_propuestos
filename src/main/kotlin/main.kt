fun main(){
    var primerNumero: Int = 0

    tituloPrincipal()
    ingresarHoras()
    primerNumero = readLine()!!.toInt()
    println("$primerNumero horas es igual a ${convertidorAMinutos(primerNumero = primerNumero)} minutos")
    println("$primerNumero horas es igual a ${convertidorAsegundos(primerNumero = primerNumero)} segundos")
}