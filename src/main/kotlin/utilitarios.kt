fun tituloPrincipal(){
    println("Hallar si un número es MÚLTIPLO de 3 y 5")
}
fun ingresarNumero(){
    println("Ingrese un numero:")
}
fun hallarSiUnNumeroEsMultiplo(primerNumero:Int){
    return if (primerNumero % 15 == 0){
        println("El numero $primerNumero SI es multiplo de 3 y 5")
    }else{
        println("El numero $primerNumero NO es multiplo de 3 y 5")
    }
}
