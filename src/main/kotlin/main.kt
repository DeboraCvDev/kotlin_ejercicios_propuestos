fun main() {
    var base: Int = 0
    var altura: Int = 0
    var lado: Int = 0

    tituloPrincipal()
    tituloBase()
    base = readLine()!!.toInt()
    tituloAltura()
    altura = readLine()!!.toInt()
    tituloLado()
    lado = readLine()!!.toInt()

    println("Dado la base $base y la altura $altura da como resultado un area de -->${calcularArea(base = base, altura = altura)}")
    println("Dado el lado $lado da como resultado un perimetro de ${calcularPerimetro(lado=lado)}")
}