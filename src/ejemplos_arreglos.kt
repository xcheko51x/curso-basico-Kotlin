/*
    Un arreglo es una estructura con valores de datos, que estan almacenados de forma contigua en memoria.
    Todos los elementos son referenciados por un mismo nombre y tienen el mismo tipo de dato.

    Los elementos estarán indexados tomando como base el 0 y el tamaño declarado del arreglo sera fijo

    Kotlin usa la clase generica Array<T> para representar arreglos. Crear instancias con un
    tipo parametrizado usa los siguientes metodos.

    arrayOf(vararg elements:T): recibe un argumento variables con elementos de tipo T y retorna el arreglo que los contiene.
    arrayOfNulls(size:Int): crea un arreglo de tamaño size con elementos de tipo T e inicializa los valores con null
    emptyArray(): crear un arreglo vacío con el tipo T

     */

fun main() {

    // Crea una variable con un arreglo inicializado
    var semana = arrayOf<String>("Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado")
    println("Tamanio arreglo semana: ${semana.size}")

    // Acceso al arreglo
    for(dia in semana.indices)
        println(semana.get(dia))

    // Acceso a elemento del arreglo
    println(semana[1])

    // Arreglos de nulos
    var meses = arrayOfNulls<String>(12)
    println("Tamanio arreglo meses es de ${meses.size}")

    // Acceso arreglo meses
    for(i in meses.indices) {
        println("${meses[i]} esta en la posicion ${i+1}")
    }

    // Escribir en arreglo meses
    meses[0] = "Enero"
    meses[2] = "Marzo"
    meses[11] = "Diciembre"

    // Acceso arreglo meses
    for(i in 0 until meses.size)
        println("${meses[i]} esta en la posicion $i del arreglo meses")

    // Arreglos vacios
    var planetas = emptyArray<String>()
    println("Tamanio arreglo planetas es de ${planetas.size}")
    planetas = arrayOf("Mercurio", "Venus", "Tierra", "Marte")
    println("Tamanio arreglo planetas es de ${planetas.size}")

    //for(i in 0 until planetas.size)
        //println("${planetas[i]} esta en la posicion $i del arreglo planetas")

    /*
    Otra opción es usar la función de extensión forEachIndexed(),
    la cual recibe como parámetros el índice y el valor, y te permite imprimir en el cuerpo:
     */

    planetas.forEachIndexed { planeta, planetas ->
        println("El $planeta esta en el arreglo $planetas")
    }
}