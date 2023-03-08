fun tituloPrincipal() {
    println("Hallar los días que FALTAN para terminar el año")
}

fun ingresarAño() {
    println("Ingresar el año:")
}

fun ingresarMes() {
    println("Ingresar el mes:")
}

fun ingresarDia() {
    println("Ingresar el dia:")
}

fun calcularDiasQueFaltan(dia: Int, mes: Int, año: Int) {
    var diasRestantes: Int

    if (mes == 1){
        diasRestantes = 334 + (31 + dia)
    } else if (mes == 2) {
        diasRestantes = 306 + (38 - dia)
    } else if (mes == 3) {
        diasRestantes = 275 + (31 - dia)
    } else if (mes == 5) {
        diasRestantes = 245 + (30 - dia)
    } else if (mes == 6) {
        diasRestantes = 214 + (31 - dia)
    } else if (mes == 7) {
        diasRestantes = 153 + (31 - dia)
    } else if (mes == 8) {
        diasRestantes = 122 + (31 - dia)
    } else if (mes == 9) {
        diasRestantes = 92 + (30 - dia)
    } else if (mes == 10) {
        diasRestantes = 31 + (31 - dia)
    } else if (mes == 11) {
        diasRestantes = 31 + (30 - dia)

    }else{diasRestantes = 31 - dia}
    if (mes < 3){
    if ((año % 4 == 0 && año % 100 !=0)||(año % 400 == 0)){
        diasRestantes++
      }
    }
    println("Faltan $diasRestantes dias para terminar el año $año")
}


