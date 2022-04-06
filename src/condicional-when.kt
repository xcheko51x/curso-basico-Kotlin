fun main() {
    // CONDICIONAL when
    /*
     Si la condición que vamos a evaluar va a tomar un número determinado de valores
     que tenemos controlados a priori y para los que queremos ejecutar un código diferente
     podemos utilizar when en lugar de usar múltiples if else para hacer un código más legible.
    */
    /*
    when (condicion) {
        valor1 -> {//...}
        valor1 -> {//...}
        valorN -> {//...}
        else -> {//...}
    }
    */

    val numero = 6

    /*when(numero) {
        1,2 -> {
            // Es 1 o 2
            println("El numero es: $numero ")
        }
        3,4,5,6 -> {
            // Es de 3 a 6
            println("El numero es: $numero ")
        }
        7,8,9,10 -> {
            // Es de 4 a 10
            println("El numero es: $numero ")
        }
        else -> {
            // Cualquier otro numero
            println("El numero $numero no entra en ningun rango definido")
        }
    }*/

    when(numero) {
        1, 2 -> {
            // Es 1 o 2
            println("El numero es: $numero ")
        }
        in 3 .. 6 -> {
            // Es de 3 a 6
            println("El numero es: $numero ")
        }
        in 7..10 -> {
            // Es de 4 a 10
            println("El numero es: $numero ")
        }
        else -> {
            // Cualquier otro numero
            println("El numero $numero no entra en ningun rango definido")
        }
    }
}