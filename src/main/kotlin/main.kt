fun main(){
    fun main(){
        var primerLado: Int = 0
        var segundoLado: Int = 0
        var tercerLado: Int = 0


        tituloPrincipal()
        primerLado()
        primerLado = readLine()!!.toInt()
        segundoLado()
        segundoLado = readLine()!!.toInt()
        tercerLado()
        tercerLado = readLine()!!.toInt()
        hallarElTipoDeTriangulo(primerLado = primerLado, segundoLado = segundoLado, tercerLado = tercerLado)
    }


}