/*
    MODIFICADORES DE ACCESO Y ENCAPSULAMIENTO

    Los modificadores nos ayudan a restringir la accesibilidad al publico,
    los modificadores se pueden utilizar en niestras clases, interfaces,
    objetos, metodos o propiedades.

    En Kotlin tenemos cuatro tipos:

    Public: Marca una declaración como visible en todas partes.
    Private: Marca una declaración como visible en la clase o archivo actual.
    Protected: Marca una declaración como visible en la clase y subclases de la misma.
    Internal: Marca una declaración como visible en el módulo actual.

 */

fun main() {

    var auto = Carro()

    println("Public: ${auto.color1}")
    auto.color1 = "Blanco"
    println("Public: ${auto.color1}")

    println("Private: ${auto.getColorPrivate()}")
    auto.setColorPrivate("Negro")
    println("Private: ${auto.getColorPrivate()}")

    println("Protected: ${auto.getColorProtected()}")
    auto.setColorProtected("Gris")
    println("Protected: ${auto.getColorProtected()}")

}