/*
  Las interfaces te permiten definir tipos cuyos comportamientos pueden ser compartidos por varias clases
  que no están relacionadas, con el fin de crear instancias se adopten a un dominio específico.

  Caracteristicas:

  - Puede contener métodos abstractos y métodos regulares con implementación
  - Puede contener propiedades abstractas y regulares pero sin campos de respaldo
  - No permite declaración de constructores
  - Las propiedades y métodos regulares de una interfaz pueden ser sobrescritos
    con el modificador override
  - Una clase puede implementar múltiples interfaces
 */

fun main() {
    var mascota = Mascota("Max")
    mascota.mostrarMensaje()
}

class Mascota: Animal2, Perro2 {
    var nombre: String? = null

    constructor(nombre: String) {
        this.nombre = nombre
    }

    fun mostrarMensaje() {
        var msgAnimal = mensajeAnimal()
        var msgPerro = mensajePerro()

        println("${this.nombre} $msgAnimal y $msgPerro")
    }
}

interface Perro2 {
    fun mensajePerro(): String {
        var msg = "es un perro"
        return msg
    }
}

interface Animal2 {
    fun mensajeAnimal(): String {
        var msg = "es un animal"
        return msg
    }
}