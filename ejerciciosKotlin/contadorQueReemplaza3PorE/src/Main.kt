fun main() {
    for (i in 0..99999) {
        val numeroFormateado = String.format("%05d", i)

        val digitos = numeroFormateado.map {

            if (it == '3') 'E' else it
        }.joinToString("-")

        println(digitos)
    }
}