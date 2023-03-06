fun main() {
    var precioIncial: Int = 0
    var IGV = 18
    tituloPrincipal()
    primerPrecio()
    precioIncial = readLine()!!.toInt()
    println("El IGV es ${calcularElIgv(precioInicial = precioIncial,IGV=IGV)}")
    println("El precio final es ${calcularPrecioFinal(precioInicial = precioIncial,IGV=IGV)}")

}


