fun main() {

    var sergio = Profesor()
    mostrar_datos(sergio)

    var luis = Profesor(
        "Luis",
        "Lopez",
        20
    )
    mostrar_datos(luis)

    var laura = Profesor(
        "Laura",
        "Perez",
        30,
        "Educadora",
        "MX")
    mostrar_datos(laura)

}

fun mostrar_datos(profesor: Profesor) {
    println(
        "Nombre: ${profesor.nombre} \n" +
                "Apellido: ${profesor.apellido} \n" +
                "Edad: ${profesor.edad} \n" +
                "Carrera: ${profesor.carrera} \n" +
                "Pais: ${profesor.pais} \n\n"
    )
}