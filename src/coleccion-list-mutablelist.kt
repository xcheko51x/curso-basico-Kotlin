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

    // List y MutableList

    // MutableList
    val numeros: MutableList<String> = mutableListOf("Uno", "Dos", "Tres", "Cuatro", "Cinco")
    println( "MutableList: $numeros")
    numeros.add("Seis")
    numeros.add("Siete")
    numeros.add("Tres")
    numeros.add("Ocho")
    println("MutableList: $numeros")
    numeros.remove("Ocho")
    println("MutableList: $numeros")
    numeros[numeros.size-1] = "Ocho"
    println("MutableList: $numeros")

    // List
    val list_numeros: List<String> = listOf("Uno", "Dos", "Tres", "Cuatro", "Cinco")
    println("List: $list_numeros")
    //list_numeros.add("Diez")
    println("List: ${list_numeros.get(1)}")


}