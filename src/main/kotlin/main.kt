fun main(){
    var radio: Int = 0
    var PI : Double = 3.14

    tituloPrincipal()
    tituloRadio()
    radio = readLine()!!.toInt()
    println("El area del circulo es -> ${calcularArea(radio = radio, PI = PI)}")
}