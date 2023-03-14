fun main(){
    var dia: Int = 0
    var mes: Int = 0
    var año: Int = 0

    tituloPrincipal()
    ingresarDia()
    dia = readLine()!!.toInt()
    ingresarMes()
    mes = readLine()!!.toInt()
    ingresarAño()
    año = readLine()!!.toInt()
    calcularCuantoFalta(dia = dia, mes = mes, año = año)
}