fun tituloPrincipal() {
    println("Hallar el IGV")
}

fun primerPrecio() {
    println("Dame el precio inicial")
}

fun calcularElIgv(precioInicial: Int,IGV: Int): Int {
    return IGV % precioInicial
}

fun calcularPrecioFinal(precioInicial: Int,IGV: Int): Int {
    return precioInicial - calcularElIgv(precioInicial,IGV)
}


