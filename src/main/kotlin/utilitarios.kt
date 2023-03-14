fun tituloPrincipal(){
    println("Hallar cuantos días faltan para terminar el mes")
}
fun ingresarDia(){
    println("Ingrese el dia:")
}
fun ingresarMes(){
    println("Ingrese el mes:")
}
fun ingresarAño(){
    println("Ingrese el año:")
}
fun calcularCuantoFalta(dia: Int,mes: Int,año: Int){
    when(mes){
        1,3,5,7,8,10,12 -> println("Faltan ${31 - dia} dias para terminar el mes")
        2 -> when{
            año % 4 == 0 && año % 100 !=0 -> println("Faltan ${29 - dia} dias para terminar el mes")
            año % 400 == 0 -> println("Faltan ${29 - dia} dias para terminar el mes")
            else -> println("Faltan ${28 - dia} dias para terminar el mes")
        }
        4,6,9,11 -> println("Faltan ${30 - dia} dias para terminar el mes")
    }

}
