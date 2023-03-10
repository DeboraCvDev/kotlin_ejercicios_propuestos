fun main() {
    var seleccion: Int = 0
    var primerNumero: Int = 0
    var segundoNumero: Int = 0

    tituloPrincipal()
    opcionesDeMenuBasico()
    seleccion = readLine()!!.toInt()
    ingresarPrimerNumero()
    primerNumero = readLine()!!.toInt()
    ingresarSegundoNumero()
    segundoNumero = readLine()!!.toInt()
    menu(seleccion = seleccion, primerNumero = primerNumero, segundoNumero = segundoNumero)

}