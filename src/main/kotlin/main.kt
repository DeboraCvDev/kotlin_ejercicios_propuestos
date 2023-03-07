fun main() {
    var primerNumero: Int = 0


    tituloPrincipal()
    ingresarElNumero()
    primerNumero = readLine()!!.toInt()

    println("El numero inverso de $primerNumero es ${TercerDigitoEncontrado(primerNumero=primerNumero)}${SegundoDigitoEncontrado(primerNumero=primerNumero)}${primerDigitoEncontrado(primerNumero=primerNumero)}")
}