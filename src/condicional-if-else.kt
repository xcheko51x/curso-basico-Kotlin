fun main() {
    // CONDICIONAL IF
    /*
    En Kotlin como en otros lenguajes de programación existen las sentencias condicionales
    para ejecutar un fragmento de código u otro en función de que se cumplan o no determinadas condiciones
    y los nombres para estas condiciones son los habituales if, else
    */

    val edad = 60

    /*if(edad < 18) {
        println("Tu edad es de $edad por lo tanto eres menor de edad")
    } */

    /*if(edad < 18)
        println("Tu edad es de $edad por lo tanto eres menor de edad")
    else
        println("Tu edad es de $edad por lo tanto eres mayor de edad") */

    if(edad < 18)
        println("Tu edad es de $edad por lo tanto eres menor de edad")
    else if(edad >= 18 && edad < 60)
        println("Tu edad es de $edad por lo tanto eres mayor de edad")
    else
        println("Tu edad es de $edad por lo tanto eres persona de la 3ra edad")
}