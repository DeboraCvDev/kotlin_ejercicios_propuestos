fun main(){
    var cantidadDePersonas: Int = 0

    tituloPrincipal()
    ingresarCantidadDePersonas()
    cantidadDePersonas = readLine()!!.toInt()
    calcularElAforo(cantidadDePersonas = cantidadDePersonas)


}