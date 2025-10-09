import kotlin.random.Random

fun imprimirMatriz(matriz: Array<IntArray>): Unit {
    for(i in 0 until matriz.size){
        val matrizActual = matriz[i]

        for(j in 0 until matriz.size) {
            val numText = String.format("%03d", matriz[i][j])
            print("${numText}\t")
        }

        println()
    }
}

fun imprimirArray(arr: Array<Int>): Unit {
    for(num in arr) {
        println(num)
    }
}

fun sumaRows(matriz: Array<IntArray>): Array<Int> {
    val res = Array<Int>(matriz.size) { 0 }

    matriz.forEachIndexed { rowIndex, row ->
        res[rowIndex] = row.sum()
    }

    return res
}

fun main() {
    val cols = 10
    val rows = 10

    val matriz = Array(rows) { IntArray(cols) { Random.nextInt(1, 101) } }
    val sumaRows = sumaRows(matriz)

    println("MATRIZ ${cols}X${10}")
    imprimirMatriz(matriz)

    println("SUMA ROWS")
    imprimirArray(sumaRows)
}