fun tituloPrincipal(){
    println("Convertidor de unidades con ayuda de un menú")
}
fun ingresarGramos(){

    println("Ingrese el numero de gramos que desea cambiar:")
}
fun tituloOpcionMenu(){
    println("Escoja una opcion")
    println("1. Cambiar a kilogramos")
    println("2. Cambiar a Libras")
    println("3. Cambiar a Onzas")
    println("4. Cambiar a Miligramos")
}
fun escogerOpcion(gramos: Double,rpta : Int){
    when(rpta){
        1 -> println("$gramos gramos equivale a ${gramos / 1000} Kilogramos")
        2 -> println("$gramos gramos equivale a ${gramos / 453.592} Libras")
        3 -> println("$gramos gramos equivale a ${gramos / 28.3495} Kilogramos")
        4 -> println("$gramos gramos equivale a ${gramos * 1000} Kilogramos")
        else -> {
            println("Respuesta Incorrecta")
        }
    }
}