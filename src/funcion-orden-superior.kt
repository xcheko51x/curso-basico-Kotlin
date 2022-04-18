/*
    FUNCIONES DE ORDEN SUPERIOR

    Una función de orden superior puede recibir como argumento una o mas funciones
    y/o retornar una función como resultado.

 */
fun main() {

    println("Suma: ${operacionesAritmeticas(10, 5, ::suma2)}")
    println("Resta: ${operacionesAritmeticas(10, 5, ::resta2)}")
    println("Multiplicacion: ${operacionesAritmeticas(10, 5, ::multiplicacion2)}")
    println("Division: ${operacionesAritmeticas(10, 5, ::division2)}")


}

fun operacionesAritmeticas(num1: Int, num2: Int, funcion: ((Int, Int) -> Int)): Int {
    return  funcion(num1, num2)
}

fun suma2(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun resta2(num1: Int, num2: Int): Int {
    return num1 - num2
}

fun multiplicacion2(num1: Int, num2: Int) = num1 * num2

fun division2(num1: Int, num2: Int) = num1 / num2