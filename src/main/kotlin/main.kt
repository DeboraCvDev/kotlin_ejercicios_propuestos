fun main(){
    var primerNumero: Int = 0

    tituloPrincipal()
    ingresarNumero()
    primerNumero = readLine()!!.toInt()
    println("La suma de cuadrados de $primerNumero numeros es igual a ${calcularElCuadradoDeElNumero(primerNumero = primerNumero)}")
}