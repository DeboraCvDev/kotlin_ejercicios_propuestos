fun tituloPrincipal(){
    println("Dado uncaracter determinar si es una vocal")
}
fun ingreseCaracter(){
    println("Ingrese un caracter")
}
fun calcularSiEsVocal(caracter:String) =
    when(caracter){
    "a","e","i","o","u"  -> {
        println("Es una vocal")
    }
    else -> {
        println("No es una vocal")
    }
}
