fun main(){
    var rpta: Int = 0
    var gramos: Double = 0.0
     tituloPrincipal()
    ingresarGramos()
    gramos = readLine()!!.toDouble()
     tituloOpcionMenu()
    rpta = readLine()!!.toInt()
    escogerOpcion(gramos = gramos, rpta = rpta)
}