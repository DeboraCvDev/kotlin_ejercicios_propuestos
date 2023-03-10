fun tituloPrincipal(){
    println("Calcular si el aforo de un local es el permitido")
}
fun ingresarCantidadDePersonas(){
    println("Ingrese la cantidad de personas en el local")
}
fun calcularElAforo(cantidadDePersonas: Int){
    val aforo = 200
    when{
    aforo * 0.4 > cantidadDePersonas -> println("El aforo es aceptable")
    aforo * 0.4 == cantidadDePersonas.toDouble() -> println("El aforo esta a tope")
    aforo * 0.4 < cantidadDePersonas -> println("El aforo ha sido sobre pasado")
    else -> println("Vuelva a intentarlo")
    }
}