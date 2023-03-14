fun main(){
    println("Calcular el total de números ingresados por el usuario:")
    var numero = 5
    var contador = 0

    while (numero != 0){
        println("Ingrese un número: ")
        numero = readLine()!!.toInt()
        if (numero != 0) contador++
    }
    println("Resultado esperado es: $contador")
}