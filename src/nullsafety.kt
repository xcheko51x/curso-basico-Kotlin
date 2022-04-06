/*

En Kotlin los objetos por defecto no aceptan valores nulos,
para que le podamos asignar un null tendremos que indicar que ese objeto realmente puede ser null.
De esta forma vamos a poder garantizar que no se no producirá un NullPointerException en tiempo de ejecución
sin necesidad de llenar el código de comprobaciones cuando las variables no deban ser null en ningún caso,
pero también nos da una vía de escape para que podamos tener los queridos NullPointerException.

 */

fun main() {

    // Definiendo variables nulas usando el operador elvis ?
    //var nombre: String = null
    var nombre: String? = null

    // Desactivar la comprobacion de los nulos
    var nombre2:String? = null
    //var leng: Int = nombre2!!.length

    // Llamas seguras
    var nombre3: String? = null
    var leng2: Int? = nombre3?.length
    println("Longitud: ${leng2}")

    // Se puede definir que valor asignar en caso de ser null de la siguiente forma
    var nombre4: String? = null
    var leng3: Int = nombre4?.length ?: 10
    println("Longitud: ${leng3}")


}