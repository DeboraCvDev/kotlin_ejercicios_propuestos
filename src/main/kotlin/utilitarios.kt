fun tituloPrincipal() {
    println("Ordenar tres números en forma ASCENDENTE y DESCENDENTE")
}

fun ingresarPrimerNumero() {
    println("Ingrese primer numero:")
}

fun ingresarSegundoNumero() {
    println("Ingrese segundo numero:")
}

fun ingresarTercerNumero() {
    println("Ingrese tercer numero:")
}

fun ordenarNumeros(primerNumero: Int, segundoNumero: Int, tercerNumero: Int) {
    var mayor = 0
    var medio = 0
    var menor = 0

    if (primerNumero > segundoNumero && segundoNumero > tercerNumero) {
        mayor = primerNumero
        medio = segundoNumero
        menor = tercerNumero
    } else if (primerNumero > tercerNumero && tercerNumero > segundoNumero){
        mayor = segundoNumero
        medio = primerNumero
        menor = tercerNumero
    } else if (segundoNumero > primerNumero && primerNumero > tercerNumero){
       mayor = segundoNumero
       medio = tercerNumero
       menor = primerNumero
    } else if (segundoNumero > tercerNumero && tercerNumero > primerNumero){
        mayor = segundoNumero
        medio = primerNumero
        menor = tercerNumero
    } else if (tercerNumero > primerNumero && primerNumero > segundoNumero){
        mayor = tercerNumero
        medio = primerNumero
        menor = segundoNumero
}else{
    mayor = tercerNumero
    medio = segundoNumero
    menor = primerNumero
   }
    println("Acendente: $tercerNumero $segundoNumero $primerNumero")
    println("Decendente: $primerNumero $segundoNumero $tercerNumero")
 }