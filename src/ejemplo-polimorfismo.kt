/*
 El polimorfismo es una característica de la programación orientada a objetos
 que permite llamar a métodos con igual nombre pero que pertenecen a metodos o clases distintas.

 */

fun main() {

    sumaNumeros(10, 15)
    sumaNumeros(5, 15, 5)

    var operaciones = Sumas()

    operaciones.sumas(20,4,6)
    operaciones.sumas(1,2,3,4)

}

fun sumaNumeros(num1: Int, num2: Int) {
    println("Suma Funcion: La suma de $num1 + $num2 = ${num1 + num2}")
}

fun sumaNumeros(num1: Int, num2: Int, num3: Int) {
    println("Suma Funcion: La suma de $num1 + $num2 + $num3 = ${num1 + num2 + num3}")
}

class Sumas {
    fun sumas(num1: Int, num2: Int, num3: Int) {
        println("Suma Clase: La suma de $num1 + $num2 + $num3 = ${num1 + num2 + num3}")
    }

    fun sumas(num1: Int, num2: Int, num3: Int, num4: Int) {
        println("Suma Clase: La suma de $num1 + $num2 + $num3 + $num4 = ${num1 + num2 + num3 + num4}")
    }
}