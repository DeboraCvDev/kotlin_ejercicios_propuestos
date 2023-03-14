fun main(){
    println("Calcular el factorial de un número")
    println("Ingrese el número: ")
    var numero = readLine()!!.toInt()

    for (i in numero-1 downTo 1){
        numero *= i
    }
    println("El factorial es: $numero")
}