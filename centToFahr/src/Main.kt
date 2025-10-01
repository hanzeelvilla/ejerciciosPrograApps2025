import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    println("Programa para convertir Centigrados a Fahrenheit")

    print("Dame los centigrados: ")
    val centigrados = scanner.nextInt()
    val fahr = 32 + (9 * centigrados / 5)

    println("$centigrados°C = $fahr°F")
}