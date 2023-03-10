fun main(){
    var nota: Int = 0
    tituloPrincipal()
    ingresarNota()
    nota = readLine()!!.toInt()
    estadoDeNota(nota = nota)
}
