open class Persona {

    var nombre: String? = null
    var apellido: String? = null
    var edad: Int? = 0

    constructor()

    constructor(nombre: String?, apellido: String?, edad:Int?) {
        this.nombre = nombre
        this.apellido = apellido
        this.edad = edad
    }

}

class Profesor: Persona {

    var carrera: String? = null
    var pais: String? = null

    // Se construye el objeto con valores definidos por default tanto de persona como de profesor
    constructor(): super()

    // Se construye el objeto con valores por default de profesor pero se reciben valores de persona
    constructor(
        nombre: String?,
        apellido: String?,
        edad: Int?
    ): super(nombre, apellido, edad)

    // Se construye el objeto con valores de profesor y persona
    constructor(
        nombre: String?,
        apellido: String?,
        edad: Int?,
        carrera: String,
        pais: String
    ): super(nombre, apellido, edad) {
        this.carrera = carrera
        this.pais = pais
    }
}