fun main(){
    var primerNumero = 0
    var segundoNumero = 0
    var tercerNumero = 0

    tituloPrincipal()
    ingresarPrimerNumero()
    primerNumero = readLine()!!.toInt()
    ingresarSegundoNumero()
    segundoNumero = readLine()!!.toInt()
    ingresarTercerNumero()
    tercerNumero = readLine()!!.toInt()
    ordenarNumeros(primerNumero = primerNumero, segundoNumero = segundoNumero, tercerNumero = tercerNumero)
}