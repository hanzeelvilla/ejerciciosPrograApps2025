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

fun sumarMatrices(matriz1: Array<IntArray>, matriz2: Array<IntArray>): Array<IntArray> {
    if(matriz1.size != matriz2.size || matriz1[0].size != matriz2[0].size) {
        throw IllegalArgumentException("Las matrices deben tener las mismas dimensiones")
    }

    val matrizRes = Array(matriz1.size) { IntArray(matriz1.size) }

    for(i in 0 until matriz1.size) {
        for(j in 0 until matriz1.size) {
            matrizRes[i][j] = matriz1[i][j] + matriz2[i][j]
        }
    }

    return matrizRes
}

fun main() {
    val cols = 3
    val rows = 3

    val matriz1 = Array(cols) { IntArray(rows) { Random.nextInt(1, 100 + 1) } }
    val matriz2 = Array(cols) { IntArray(rows) { Random.nextInt(1, 100 + 1) } }

    println("Matriz 1")
    imprimirMatriz(matriz1)
    println("==========================")

    println("Matriz 2")
    imprimirMatriz(matriz2)
    println("==========================")

    val sumaDeMatrices = sumarMatrices(matriz1, matriz2)

    println("Matrices 1 y 2 sumadas")
    imprimirMatriz(sumaDeMatrices)
}