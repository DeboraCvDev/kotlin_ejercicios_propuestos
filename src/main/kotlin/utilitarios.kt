fun tituloPrincipal(){
    println("Hallar si un número es PAR o IMPAR")
}
fun tituloIngresaUnNumero(){
    println("Ingrese un numero:")
}
fun calcularParOImpar(primerNumero: Int){
    return if (primerNumero % 2 == 0 ) {
        println("El numero $primerNumero es par")
    } else{
        println("El numero $primerNumero es impar")
    }
}