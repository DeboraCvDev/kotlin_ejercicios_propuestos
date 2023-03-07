fun tituloPrincipal(){
    println("En Steam se hace un descuento de 50% a las personas cuya compra sea mayoy a 100$ .Indicar el monto descontado y el descuento")
}
fun ingreseCosto(){
    println("Ingresa costo del juego:")
}
fun calcularMonto(costoDeJuego: Int):Double{
    return costoDeJuego*0.5
}
fun calcularDescuento(costoDeJuego: Int,precioFinal:Double):Double{
    return costoDeJuego-precioFinal
}