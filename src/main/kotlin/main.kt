fun main(){
    var años = 0
    var meses = 0
    var tipoDeContrato = 0
    tituloPrincipal()
    años()
    años = readLine()!!.toInt()
    meses()
    meses = readLine()!!.toInt()
    tipoDeContrato()
    tipoDeContrato = readLine()!!.toInt()
    println("${calcularSueldoTotal(años,meses,tipoDeContrato)}")
}