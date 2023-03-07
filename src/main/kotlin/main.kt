fun main(){
    var primerNumero:  Int = 0
    var segundoNumero:  Int = 0
    var tercerNumero:  Int = 0
    var cuartoNumero:  Int = 0
    var numeroTermino: Int = 0
    var razon1:Int =0
    var razon2: Int =0
    var t0: Int =0
    var a: Int = 0
    var b: Int = 0
    var c: Int = 0
    var rpta: Int = 0


    tituloPrincipal()
    ingresarPrimerNumero()
    primerNumero = readLine()!!.toInt()
    ingresarSegundoNumero()
    segundoNumero = readLine()!!.toInt()
    ingresarTercerNumero()
    tercerNumero = readLine()!!.toInt()
    ingresarCuartoNumero()
    cuartoNumero = readLine()!!.toInt()
    terminoAHallar()
    numeroTermino = readLine()!!.toInt()

     razon1 = (cuartoNumero-tercerNumero) - (tercerNumero-segundoNumero)
     razon2 = (segundoNumero - primerNumero) -razon1
     t0 = primerNumero - razon2
     a = razon1/2
     b = razon2-a
     c = t0
    rpta = a * (numeroTermino * numeroTermino) + (b * numeroTermino) + c
    println("El termino $numeroTermino es igual a $rpta")
}