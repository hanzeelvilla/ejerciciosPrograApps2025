import java.util.Scanner
import kotlin.math.max

fun main() {
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