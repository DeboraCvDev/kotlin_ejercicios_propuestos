@file:Suppress("UNREACHABLE_CODE")

fun tituloPrincipal(){
    println("Hallar el inverso de las cifras de un número")
}
fun ingresarElNumero(){
    println("Ingresar un numero de 3 cifras:")
}
fun primerDigitoEncontrado(primerNumero:Int):Int{
    return  primerNumero/100
}
fun SegundoDigitoEncontrado(primerNumero:Int):Int{
    return  primerNumero%100/10
}
fun TercerDigitoEncontrado(primerNumero:Int):Int{
    return  primerNumero%10
}