/*
    FUNCIONES LAMBDAS

    Una función lambda es un literal de función que puede ser usado como expresión. Esto quiere decir,
    una función que no está ligada a un identificador y que puedes usar como valor.

    La sintaxis de una función Lambda consta de lo siguiente:

        - Lista de parametros
        - Operador flecha ->
        - Cuerpo del lambda

        {PARAMETROS -> CUERPO}
 */

fun main() {
    println("Suma función normal: ${suma3(10, 5)}")
    println("Resta función de orden superior: ${operaciones(10, 5, ::resta3)}")

    var mult = {num1: Int, num2: Int -> num1 * num2}
    println("Multiplicación función lambda: ${operaciones(10, 5, mult)}")
    println("División función lambda: ${operaciones(10, 5, {num1: Int, num2: Int -> num1 / num2})}")
    println("Modulo función lambda: ${operaciones(10, 5){num1: Int, num2: Int -> num1 % num2}}")

    var arreglo = IntArray(10){it}
    for (i in arreglo.indices) {
        println("Arreglo: ${arreglo[i]}")
    }

    var suma = 0
    recorrerArreglo(arreglo) {
        suma += it
    }
    println("$suma")



}

fun recorrerArreglo(arr: IntArray, funcion: (Int) -> Unit) {
    for (i in arr) {
        funcion(i)
    }
}

fun suma3(num1: Int, num2: Int) = num1 + num2

fun resta3(num1: Int, num2: Int): Int {
    return num1 - num2
}

fun operaciones(num1: Int, num2: Int, funcion: ((Int, Int) -> Int)): Int {
    return funcion(num1, num2)
}