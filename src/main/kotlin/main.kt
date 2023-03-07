fun main(){
    var costoDeJuego = 0
    var precioFinal = 0.0
    var descuento = 0.0
    tituloPrincipal()
    ingreseCosto()
    costoDeJuego = readLine()!!.toDouble().toInt()


    if (costoDeJuego>100){
        precioFinal = calcularMonto(costoDeJuego = costoDeJuego)
        descuento = calcularDescuento(costoDeJuego = costoDeJuego,precioFinal = precioFinal)
        println("El precio final es igual a $precioFinal")
        println("El descuento final es igual a $descuento")
    }else{
        println("El producto no cuenta con un descuento desponible")
        println("El precio sin decuento es $costoDeJuego")
    }
}