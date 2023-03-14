fun tituloPrincipal() {
    println("Convertir en horas los minutos ingresados")
}

fun ingresarMinutos() {
    println("Ingrese los minutos:")
}

fun calcularTiempo(tiempo: Int = 0) {

    var hora = 0
    var minutos = 0

    if (tiempo > 59) {
        when {
            tiempo % 60 == 0 -> println("El tiempo es: ${mostrarHoras(tiempo / 60)}")
            else -> {
                hora = tiempo / 60
                minutos = tiempo - (hora * 60)
                println("El tiempo es: ${mostrarHoras(hora)} y ${mostrarMinutos(minutos)}")
            }
        }
    } else {
        print("El tiempo es: ${mostrarMinutos(tiempo)}")

    }
}


fun mostrarHoras(horas: Int): String {
    return if (horas > 1) "$horas horas" else "1 hora"
}

fun mostrarMinutos( minutos: Int = 0): String {
    return if (minutos > 1) "$minutos minutos" else "1 minuto"
}
