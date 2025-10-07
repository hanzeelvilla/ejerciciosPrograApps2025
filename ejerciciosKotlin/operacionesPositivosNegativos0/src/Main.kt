import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    val numPositivos: MutableList<Int> = mutableListOf()
    val numNegativos: MutableList<Int> = mutableListOf()
    var num0 = 0

    val maxNums = 5
    var numActual = 0

    for(i in 1 .. maxNums) {
        print("Dame el num $i: ")
        numActual = scanner.nextInt()

        if(numActual > 0) {
            numPositivos.add(numActual)
        }
        else if(numActual < 0) {
            numNegativos.add(numActual)
        }
        else {
            num0++
        }
    }

    println("Promedio num positivos: ${numPositivos.average()}")
    println("Promedio num negativos: ${numNegativos.average()}")
    println("Num de ceros: $num0")
}