/*

La finalidad de las clases y metodos abstractos es utilizarlas de cara a proveer una plantilla comun
para otras clases que hereden de ellas.

Algunas de las caracteristicas son las siguientes:

- Se utilizan solo como super clases.
- No se pueden instanciar objetos de ellas.
- Sirven para proporcionar una super clase apropiada a partir de la cual heredan otras clases.
- Su definicion tiene que ser lo mas generica posible ya que cada subclase que la utilice sera la encargada de
  definir o sobreescribir los metodos a sus necesidades.

 */

fun main() {

    var mascota = Perro("Max")
    mascota.comer()
    mascota.sonido()

}

abstract class Animal {
    var nombre: String? = null

    constructor(nombre: String) {
        this.nombre = nombre
    }

    fun comer() {
        println("${this.nombre} esta comiendo")
    }

    abstract fun sonido()
}

class Perro: Animal {

    constructor(nombre: String): super(nombre)

    override fun sonido() {
        println("${this.nombre} es un perro y esta ladrando")
    }

}