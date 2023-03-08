fun tituloPrincipal(){
    println("Hallar si un número termina en cifra CERO")
}
fun ingresarNumero(){
    println("Ingrese un Numero:")
}
fun hallarSiUnNumeroTerminaEnCifraCero(primerNumero:Int, segundoNumero: Int){

    return if (primerNumero % 10 == 0){
        println("El numero SI termina en cifra cero")
        println("La mitad de $primerNumero es ${segundoNumero/2}")
    }else{
        println("El numero NO termina en cifra cero")
        println("El doble de $primerNumero es ${segundoNumero+2}")
    }
}