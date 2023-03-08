fun main(){
    var año: Int = 0
    var mes: Int = 0
    var dia: Int = 0
    var diasRestantes: Int =0
    tituloPrincipal()
    ingresarAño()
    año = readLine()!!.toInt()
    ingresarMes()
    mes = readLine()!!.toInt()
    ingresarDia()
    dia = readLine()!!.toInt()
    calcularDiasQueFaltan(año = año, mes = mes, dia = dia)
}


