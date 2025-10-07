import java.util.Scanner

fun main() {
   val scanner = Scanner(System.`in`)

    print("Dame la velocidad en km/h: ")
    val km = scanner.nextDouble()

    val ms = km / 3.6

    println("${km}Km/h = ${ms}m/s")
}