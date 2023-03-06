fun tituloPrincipal(){
    println("Calcular area y perimetro de un triangulo")
}
fun tituloBase(){
    println("Ingrese base")
}
fun tituloAltura(){
    println("Ingrese altura")
}
fun tituloLado(){
    println("Ingrese lado")
}
fun calcularArea(base:Int,altura:Int):Int{
   return base*altura/2
}
fun calcularPerimetro(lado:Int):Int{
    return lado*lado*lado
}