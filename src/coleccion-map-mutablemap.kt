/*
En general, en programación las colecciones son estructuras o conjuntos de elementos o ítems,
y concretamente los tipos de colecciones usadas en Kotlin son:

Listas (List): colección ordenada con acceso a sus elementos por el índice o posición de cada uno.
Conjuntos (Set): colección de elementos únicos (no repetidos) donde el orden no suele ser relevante.
Diccionarios (Map): conjunto de pares del tipo clave-valor donde las claves son únicas y
a cada una de ellas se asigna un valor (que pueden ser duplicados),
por lo que suelen ser útiles para almacenar conexiones lógicas entre objetos.

En Kotlin las colecciones se pueden agrupar en dos grandes categorías:
Colecciones de solo lectura, con operaciones para acceder a los elementos de la colección, como List, Set y Map.
Colecciones mutables, con operaciones de escritura como agregar, eliminar y actualizar sus elementos,
como MutableList, MutableSet y MutableMap.

 */

fun main() {

    // Map y MutableMap

    // MutableMap
    val semana: MutableMap<Int, String> = mutableMapOf(
        1 to "Lunes",
        2 to "Martes",
        3 to "Miercoles",
        4 to "Jueves",
        5 to "Viernes"
    )

    println( "MutableMap: $semana")
    semana.put(6, "Sabado")
    semana.put(7, "Sabado")
    println( "MutableMap: $semana")
    semana.replace(7, "Sabado", "Domingo")
    println( "MutableMap: $semana")
    semana.remove(7)
    println( "MutableMap: $semana")

    println("Llaves: ${semana.keys}")
    println("Valores: ${semana.values}")

    // Map
    val list_semana: Map<Int, String> = mapOf(
        1 to "Lunes",
        2 to "Martes",
        3 to "Miercoles",
        4 to "Jueves",
        5 to "Viernes"
    )

    println("Map: $list_semana")
    println("Llaves: ${list_semana.keys}")
    println("Valores: ${list_semana.values}")
    println("Map: ${list_semana.size}")
    //list_semana.put(7, "Sabado")
}