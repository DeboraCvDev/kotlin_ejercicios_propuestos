fun tituloPrincipal(){
    println("Imprimir un menú que realice las operaciones básicas")
}
fun ingresarPrimerNumero(){
    println("Ingrese primer Numero:")
}
fun ingresarSegundoNumero(){
    println("Ingrese segundo Numero:")
}
fun opcionesDeMenuBasico(){
    println("Bienvenido al menu seleccione una opcion:")
    println("1. Sumar los Numeros:")
    println("2. Restar los Numeros:")
    println("3. Multiplicar los Numeros:")
    println("4. Dividir los Numeros:")
    println("seleccione una opcion:")
}
fun menu(seleccion: Int,primerNumero: Int,segundoNumero: Int){
    when(seleccion){
        1 -> println("La suma es ${primerNumero + segundoNumero}")
        2 -> println("La resta es ${primerNumero - segundoNumero}")
        3 -> println("La multiplicacion es ${primerNumero * segundoNumero}")
        4 -> println("La division es ${primerNumero / segundoNumero}")
        else
        -> println("Vuelva a intentalo")
    }

}
