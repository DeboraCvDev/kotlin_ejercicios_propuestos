fun main(){
    var primerNumero: Int = 0


    tituloPrincipal()
    tituloIngresaUnNumero()
    primerNumero = readLine()!!.toInt()
    calcularParOImpar(primerNumero = primerNumero)
}