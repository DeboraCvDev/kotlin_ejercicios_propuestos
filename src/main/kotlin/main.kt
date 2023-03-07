fun main(){
    var numeroMayor: Int =0
    var numeroMenor: Int = 0

    tituloPrincipal()
    ingresarElNumero()
    numeroMayor = readLine()!!.toInt()
    numeroMenor = readLine()!!.toInt()
    println("Los numeros incluidos dentro de $numeroMayor y $numeroMenor son un total de ${hallarElIntervalo(numeroMayor = numeroMayor, numeroMenor = numeroMenor)}")
}