fun main() {
    val maxMult = 10
    val maxTabla = 12

    for(i in 1 .. maxTabla) {
        println("TABLA DEL $i")
        for(j in 1 .. maxMult) {
            println("$i * $j = ${i * j}")
        }
        println("======================================")
    }
}