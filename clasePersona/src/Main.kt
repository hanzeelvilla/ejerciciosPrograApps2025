class Persona(pnombre: String, papellido: String, pedad: Int) {
    var nombre: String = pnombre
    var apellido: String = papellido
    var edad: Int = pedad

    constructor(nombre: String, apellido: String) :this(nombre, apellido, 0)

    fun imprimirNombreCompleto(): Unit {
        println("$nombre $apellido")
    }
}

fun main() {
    val p1 = Persona("Hanzeel", "Villa", 21)

    /*
    p1.nombre = "Hanzeel"
    p1.apellido = "Villa"
    p1.edad = 21
    */

    p1.imprimirNombreCompleto()
}