fun tituloPrincipal(){
    println("calcular la suma de los cuadrados de los N primeros numeros naturales")
}
fun ingresarNumero(){
    println("Ingresa el numero")
}
fun calcularElCuadradoDeElNumero(primerNumero: Int):Int{
    return primerNumero*(primerNumero + 1)*(2*primerNumero+1)/6
}
