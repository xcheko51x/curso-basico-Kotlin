class Pokemon {

    // Atributos
    var nombre: String? = null
    var tipo: String? = null
    var vida: Int = 0
    var poder_ataque: Int = 0
    var poder_defensa: Int = 0

    // Constructor
    constructor()

    // Constructores con parametros
    constructor(nombre:String, tipo:String, vida:Int, ataque:Int, defensa:Int) {
        this.nombre = nombre
        this.tipo = tipo
        this.vida = vida
        this.poder_ataque = ataque
        this.poder_defensa = defensa
    }
}