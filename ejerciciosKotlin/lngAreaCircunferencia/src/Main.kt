import java.util.Scanner
import kotlin.math.pow

fun main() {
    val scanner = Scanner(System.`in`)

    print("Dame el radio de un círculo: ")
    val r = scanner.nextDouble()

    val longitudCircunferencia = 2 * Math.PI * r
    val areaCircunferencia = Math.PI * r.pow(2.0)

    println("Logintud Circunferencia: $longitudCircunferencia")
    println("Area circunferencia: $areaCircunferencia")
}