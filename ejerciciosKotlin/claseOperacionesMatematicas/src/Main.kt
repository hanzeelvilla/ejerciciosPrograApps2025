import java.util.Scanner
import kotlin.math.max
import kotlin.math.pow
import kotlin.random.Random

class OperacionesMats {
    fun dobleTriple() {
        val scanner = Scanner(System.`in`)

        print("Dame un número: ")
        val num1 = scanner.nextInt()

        println("Doble de $num1: ${num1 * 2}")
        print("Triple de $num1: ${num1 * 3}")
    }

    fun centToFahr() {
        val scanner = Scanner(System.`in`)
        println("Programa para convertir Centigrados a Fahrenheit")

        print("Dame los centigrados: ")
        val centigrados = scanner.nextInt()
        val fahr = 32 + (9 * centigrados / 5)

        println("$centigrados°C = $fahr°F")
    }

    fun lngAreaCircunferencia() {
        val scanner = Scanner(System.`in`)

        print("Dame el radio de un círculo: ")
        val r = scanner.nextDouble()

        val longitudCircunferencia = 2 * Math.PI * r
        val areaCircunferencia = Math.PI * r.pow(2.0)

        println("Logintud Circunferencia: $longitudCircunferencia")
        println("Area circunferencia: $areaCircunferencia")
    }

    fun kmToMs() {
        val scanner = Scanner(System.`in`)

        print("Dame la velocidad en km/h: ")
        val km = scanner.nextDouble()

        val ms = km / 3.6

        println("${km}Km/h = ${ms}m/s")
    }

    fun whileNegativo() {
        val scanner = Scanner(System.`in`)

        var totalNums: Int = 0
        var userNum: Int = 1

        while(userNum >= 0) {
            print("Este programa se acaba hasta que me des un num negativo: ")
            userNum = scanner.nextInt()
            totalNums++
        }

        println("Total nums ingresados: $totalNums")
    }

    fun adivinaElNumero() {
        val scanner = Scanner(System.`in`)

        val min = 1
        val max = 100
        val randomNum: Int = Random.nextInt(min, max + 1)
        var userGuess = -1
        var attempts = 0

        println("Estoy pensando en un número entre $min y $max. Intenta adivinar y te diré si es más o menos")
        //println(randomNum)

        while(userGuess != randomNum) {
            print("En qué número estoy pensando? ")
            userGuess = scanner.nextInt()

            if(randomNum > userGuess) {
                println("Mayor")
            }
            else if(randomNum < userGuess) {
                println("Menor")
            }

            attempts++
        }

        println("Has adivinado, el número era $randomNum")
        println("Intentos: $attempts")
    }

    fun num100To1Step7() {
        for(i in 100 downTo 0 step 7) println(i)
    }

    fun maxSueldo() {
        val scanner = Scanner(System.`in`)

        print("Cúantos sueldos quieres ingresar? ")
        val numSueldos = scanner.nextInt()
        var sueldoActual: Int = 0
        var maxSueldo = 0

        for (i in 1 .. numSueldos) {
            print("Dame el suedo $i: ")
            sueldoActual = scanner.nextInt()

            maxSueldo = max(sueldoActual, maxSueldo)
        }

        println("El sueldo máximo es: $maxSueldo")
    }

    fun tabla12() {
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

    fun contadorQueReemplaza3PorE() {
        for (i in 0..99999) {
            val numeroFormateado = String.format("%05d", i)

            val digitos = numeroFormateado.map {

                if (it == '3') 'E' else it
            }.joinToString("-")

            println(digitos)
        }
    }

    fun operacionesNumsPosNegY0() {
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

    fun posNums() {
        val scanner = Scanner(System.`in`)
        val listNums: MutableList<Int> = mutableListOf()
        val maxNums = 10

        for(i in 1 .. maxNums) {
            print("Dame el num $i: ")
            var num = scanner.nextInt()

            listNums.add(num)
        }

        println("Primer num de la lista: ${listNums.first()}")
        println("Ultimo num de la lista: ${listNums.last()}")
        println("Segundo num de la lista: ${listNums[1]}")
        println("Penultimo num de la lista: ${listNums[listNums.size - 2]}")
        println("Tercer num de la lista: ${listNums[2]}")
    }

    fun bubbleSort() {
        val scanner = Scanner(System.`in`)
        val maxNums = 5

        val listNums: MutableList<Int> = mutableListOf()

        for(i in 1 .. maxNums) {
            print("Dame el num $i: ")
            var num = scanner.nextInt()

            listNums.add(num)
        }

        println("Lista original")
        println(listNums)

        for(i in 0 until listNums.size - 1){
            for(j in 0 until listNums.size - i - 1) {
                if(listNums[j] > listNums[j + 1]) {
                    val temp = listNums[j]
                    listNums[j] = listNums[j + 1]
                    listNums[j + 1] = temp
                }
            }
        }

        println("Lista ordenada")
        println(listNums)
    }

    private fun imprimirMatriz(matriz: Array<IntArray>): Unit {
        for(i in 0 until matriz.size){
            val matrizActual = matriz[i]

            for(j in 0 until matriz.size) {
                val numText = String.format("%03d", matriz[i][j])
                print("${numText}\t")
            }

            println()
        }
    }

    private fun sumarMatrices(matriz1: Array<IntArray>, matriz2: Array<IntArray>): Array<IntArray> {
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

    fun sumaMatrices3x3() {
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
}

fun main() {
    val myObj = OperacionesMats()

    // myObj.dobleTriple()
    // myObj.centToFahr()
    // myObj.lngAreaCircunferencia()
    // myObj.kmToMs()
    //myObj.whileNegativo()
    // myObj.adivinaElNumero()
    // myObj.num100To1Step7()
    // myObj.maxSueldo()
    // myObj.tabla12()
    // myObj.contadorQueReemplaza3PorE()
    // myObj.operacionesNumsPosNegY0()
    // myObj.posNums()
    // yObj.bubbleSort()
    // myObj.sumaMatrices3x3()
}