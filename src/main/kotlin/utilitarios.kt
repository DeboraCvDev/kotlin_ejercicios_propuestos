fun tituloPrincipal(){
    println(" Hallar el tipo de TRIÁNGULO según sus lados")
}
fun primerLado(){
    println("Ingresa el primer lado:")
}
fun segundoLado(){
    println("Ingresa el segundo lado:")
}
fun tercerLado(){
    println("Ingresa el tercer lado:")
}
fun hallarElTipoDeTriangulo(primerLado: Int, segundoLado: Int, tercerLado: Int) {
    {var primerLado = 0
        var segundoLado = 0
        var tercerLado = 0}

    if (primerLado == segundoLado && segundoLado == tercerLado){
        println("El triangulo es equilatero (3 lados iguales)")
    }else if (primerLado == segundoLado && segundoLado != tercerLado){
        println("El triangulo es isosceles (2 lados iguales)")
    }else if (primerLado == tercerLado && tercerLado != primerLado){
        println("El triangulo es isoceles (2 lados iguales)")
    }else if (segundoLado == tercerLado && tercerLado != primerLado){
        println("El triangulo es isoceles (2 lados iguales)")
    }else{
        println(message = "El triangulo es escaleno(Ni un lado igual)")
    }
}


