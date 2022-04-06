
fun main() {

    // Crear un objeto de nuesta clase Pokemon
    var pikachu = Pokemon()
    //mostrar_pokemon(pikachu)

    var charmander = Pokemon("Charmander", "Fuego", 100, 30, 15)
    mostrar_pokemon(charmander)

}

fun mostrar_pokemon(pokemon: Pokemon) {
    println(
        "Nombre: ${pokemon.nombre} \n" +
                "Tipo: ${pokemon.tipo} \n" +
                "Vida: ${pokemon.vida} \n" +
                "Ataque: ${pokemon.poder_ataque} \n" +
                "Defensa: ${pokemon.poder_defensa}"
    )
}