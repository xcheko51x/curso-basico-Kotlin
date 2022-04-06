/*
Para definir una función en kotlin tenemos que usar la palabra reservada fun
seguida del nombre de la función y entre paréntesis se pueden indicar
los parámetros que recibe la función en caso de que los tenga y
finalmente tenemos que indicar el tipo de retorno,
las llaves {} y dentro pondremos el contenido de nuestra función.
fun nombreFuncion(parametro1:Tipo, ..., parametroN:Tipo): TipoRespuesta {
    // Cuerpo de la funcion
}
 */

fun main() {

    var nombre = "xcheko51x"

    var numero1 = 10
    var numero2 = 5

    //saludar(nombre)
    //despedirse(nombre)

    //println(saludo_personalizado(nombre))

    //println("La suma de $numero1 y $numero2 es: ${suma(numero1, numero2)}")

    //mensaje()
}

// Funcion sin parametros y sin valor de retorno
fun mensaje() {
    println("Hola Mundo")
}

// Indicando que la función no devuelve nada
fun saludar(nombre: String): Unit {
    println("Hola, " + nombre)
}

// Sin indicación quela función no devuelve nada
fun despedirse(nombre: String) {
    println("Adios, " + nombre)
}

// Función con algun valor de retorno
fun saludo_personalizado(nombre: String): String {

    var mensaje = "Hola $nombre es un gusto saludarte :)"

    return mensaje
}

// Suma de dos numeros y devuelve el resultado
fun suma(num1: Int, num2: Int): Int {

    var resultado = num1 + num2

    return resultado
}