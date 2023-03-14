fun main(){
    var primerNumero: Int
    var suma: Int = 0

    for (i in 1..10){
        println("Ingrese el número $i")
        primerNumero = readLine()!!.toInt()
        suma+= primerNumero
    }
    println("La suma es $suma")
}