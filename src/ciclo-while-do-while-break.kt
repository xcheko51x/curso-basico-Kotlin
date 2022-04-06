fun main() {

    /*
    BUCLE WHILE Y DO WHILE
    while(condicion) {
        codigo a ejecutar mientras la condicion se cumpla
    }
    do {
        El codigo se ejecuta una vez independientemente de si la condicion se cumple
        Si la condicion se siguie cumpliendo se vuelve a ejecutar el codigo
    } while()
     */

    var contador = 0

    /*while(contador <= 10) {
        println("while: El contador vale: $contador  y es menor o igual a 10")
        contador++
    } */

    do {
        println("do-while: El contador vale: $contador  y es menor o igual a 10")
        contador++

        if(contador == 5) {
            println("if do-while: El contador vale: $contador  y es igual a 5")
            break
        }
    } while (contador <= 10)


}