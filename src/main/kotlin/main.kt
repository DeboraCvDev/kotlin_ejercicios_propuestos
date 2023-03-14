fun main(){
    var tiempo: Int = 0
    tituloPrincipal()
    ingresarMinutos()
    tiempo = readLine()!!.toInt()
    calcularTiempo(tiempo = tiempo)
}