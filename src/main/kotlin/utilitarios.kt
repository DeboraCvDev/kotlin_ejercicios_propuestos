
fun tituloPrincipal(){
    println("Mostrar el ESTADO de las notas de un examen")
}
fun ingresarNota(){
    println("Ingrese nota:")
}
fun estadoDeNota(nota:Int){
    val estado  = when(nota){
        in 0..3 -> "Desaprobado"
        in 4..7 -> "Aprobado"
        in 8..10 -> "Excelente"
        else -> "Respuesta incorrecta"
    }
    println("El estado del examen es $estado")
}