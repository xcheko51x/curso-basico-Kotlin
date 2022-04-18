/*
    FUNCIONES DE EXTENSION

    Permiten añadir metodos a objetos inicializados sin tener que heredar de otra clase o de interface.

    En otras palabras, una función de extensión es una función que puede ser llamada como miembro de una clase,
    pero está definida por fuera de ella.
 */

fun main() {
    var pez = Pez("Nemo")
    pez.nadar()
    pez.comer()
    pez.reproduccion()
}

class Pez {
    var nombre: String? = null

    constructor(nombre: String) {
        this.nombre = nombre
    }

    fun nadar() {
        println("${this.nombre} es un pez y esta nadando")
    }

    fun comer() {
        println("${this.nombre} es un pez y esta comiendo")
    }
}

fun Pez.reproduccion() {
    println("${this.nombre} es un pez y busca pareja")
}