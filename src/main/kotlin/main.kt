fun main(){
    var primerNumero: Int = 0
    var segundoNumero: Int = 0


    tituloPrincipal()
    ingresarNumero()
    primerNumero = readLine()!!.toInt()

    segundoNumero = primerNumero.toDouble().toInt()
    hallarSiUnNumeroTerminaEnCifraCero(primerNumero = primerNumero, segundoNumero = segundoNumero)
}