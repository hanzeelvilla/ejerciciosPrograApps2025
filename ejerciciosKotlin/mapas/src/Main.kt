//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val prefijos: Map<Int, String> = mapOf(52 to "Mexico", 1 to "USA", 313 to "Tecomán", 57 to "Colombia", 54 to "Argentina")

    for((key, value) in prefijos) {
        println("Llave: $key\tValor: $value")
    }

    println("De que lada es la clave 313? ${prefijos[313]}")

    println("============================")

    // MAPAS MUTABLES
    val prefijosMutable: MutableMap<Int, String> = mutableMapOf()
    prefijosMutable[3] = "Venezuela"

    println(prefijosMutable)
}