fun main(){
    var a : Int = 0
    var b : Int = 0
    var c : Int =0
    var raiz : Int = 0
    var b1 : Int = 0
    var a1 : Int = 0

    tituloPrincipal()
    coeficienteDeSegundoGrado()
    a = readLine()!!.toInt()
    coeficienteDePrimerGrado()
    b = readLine()!!.toInt()
    coeficienteDeGradoCero()
    c = readLine()!!.toInt()

    raiz = (b * b) - 4 * (a * c)
    b1 = b * (-1)
    a1 = 2 * a

    println("Las raíces son: ")
    println("La raiz 1 es: $b1 + √$raiz / $a1")
    println("La raiz 2 es: $b1 - √$raiz / $a1")

}