/*
    MODIFICADORES DE ACCESO Y ENCAPSULAMIENTO

    Los modificadores nos ayudan a restringir la accesibilidad al publico,
    los modificadores se pueden utilizar en nuestras clases, interfaces,
    objetos, metodos o propiedades.

    En Kotlin tenemos cuatro tipos:

    Public: Marca una declaración como visible en todas partes.
    Private: Marca una declaración como visible en la clase o archivo actual.
    Protected: Marca una declaración como visible en la clase y subclases de la misma.
    Internal: Marca una declaración como visible en el módulo actual.

 */

// Clase Padre
open class Vehiculo {

    // Atributos

    // Tiene acceso en todas partes
    public var color1: String = "Rojo"

    // Para acceder solo se puede definiendo los get y set dentro de la clase
    private var color2: String = "Azul"

    // Para acceder es por medio de get y set pero se pueden definir desde la clase padre o las subclases
    protected var color3: String = "Verde"

    var velocidadMaxima: Int = 100

    constructor()

    fun getColorPrivate(): String {
        return color2
    }

    fun setColorPrivate(nuevo_color: String) {
        this.color2 = nuevo_color
    }

    open fun muestraVelocidadMaxima() {
        println("La velocidad maxima de Vehiculo es de: ${this.velocidadMaxima}")
    }

}

// Clase Hijo
class Carro: Vehiculo {

    // Atributo
    var puertas: Int = 4
    var velocidadMax: Int = 0

    constructor(): super()

    fun getColorProtected(): String {
        return color3
    }

    fun setColorProtected(nuevo_color: String) {
        this.color3 = nuevo_color
    }

    override fun muestraVelocidadMaxima() {
        println("La velocidad maxima de Carro es de: ${this.velocidadMax}")
    }
}

class Moto: Vehiculo {

    var numLlantas: Int = 2
    var velocidadMax: Int = 0

    constructor(): super()

    override fun muestraVelocidadMaxima() {
        super.muestraVelocidadMaxima()
        println("La velocidad maxima de Moto es de: ${this.velocidadMax}")
    }
}