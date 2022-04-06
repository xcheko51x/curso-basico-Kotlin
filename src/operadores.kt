fun main() {
    // OPERADORES ARITMETICOS
    // + , - , / , * , %

    var num1 = 9
    var num2 = 2

    println("La suma de $num1 y $num2 es igual a ${num1 + num2}")
    println("La resta de $num1 y $num2 es igual a ${num1 - num2}")
    println("La multiplicación de $num1 y $num2 es igual a ${num1 * num2}")
    println("La división de $num1 y $num2 es igual a ${num1 / num2}")
    println("El modulo de $num1 y $num2 es igual a ${num1 % num2}")

    // OPERADORES DE ASIGNACIÓN COMPUESTA
    //  +=, -= , *= , /= , % =

    var x = 8
    x += num2
    println("+= $x")

    x = 9
    x -= num2
    println("-= $x")

    x = 9
    x *= num2
    println("*= $x")

    x = 9
    x /= num2
    println("/= $x")

    x = 9
    x %= num2
    println("%= $x")

    // OPERADORES DE INCREMENTO Y DECREMENTO
    // ++ , --

    var num3 = 5
    println("El numero incial es: $num3")
    num3++
    println("Despues del incremento vale: $num3")

    num3--
    println("despues del decremento vale $num3")

    // OPERADORES RELACIONALES
    // == , != , < , > , <= , >=

    val num4 = 10
    val num5 = 15

    println("¿$num4 == $num5? Respuesta: ${num4 == num5}")
    println("¿$num4 != $num5? Respuesta: ${num4 != num5}")
    println("¿$num4 < $num5? Respuesta:  ${num4 <  num5}")
    println("¿$num4 > $num5? Respuesta:  ${num4 >  num5}")
    println("¿$num4 <= $num5? Respuesta: ${num4 <= num5}")
    println("¿$num4 >= $num5? Respuesta: ${num4 >= num5}")

    // OPERADORES LOGICOS
    // && , || , !

    val evaluacion1 = 10 < 5
    val evaluacion2 = 13 <= 13

    var resultado: Boolean

    resultado = evaluacion1 && evaluacion2
    println("¿10 es menor que 5 Y 13 es menor o igual a 13? Resultado: $resultado")

    resultado = evaluacion1 || evaluacion2
    println("¿10 es menor que 5 O 13 menor o igual 13? Resultado: $resultado")

    resultado = !evaluacion1 && evaluacion2
    println("¿10 NO es menor que 5 Y 13 menor o igual 13? Resultado: $resultado")
}