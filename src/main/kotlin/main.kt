fun main(){
    var numero: Int
    var numerosPares = 0
    var numerosImpares = 0

    tituloPrincipal()
    ingresarTotalDeNumero()
    numero = readLine()!!.toInt()
    for (i in 1..numero){
        println("Ingrese el número $i: ")
        numero = readLine()!!.toInt()
        if (numero % 5 != 0){
            if (numero % 2 == 0)numerosPares++ else numerosImpares++
        }
    }
    println("En total hay $numerosPares números pares y $numerosImpares números impares")
}