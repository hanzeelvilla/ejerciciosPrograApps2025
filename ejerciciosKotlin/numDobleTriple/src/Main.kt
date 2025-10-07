//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Dame un número: ")
    val num1 = scanner.nextInt()

    println("Doble de $num1: ${num1 * 2}")
    print("Triple de $num1: ${num1 * 3}")
}