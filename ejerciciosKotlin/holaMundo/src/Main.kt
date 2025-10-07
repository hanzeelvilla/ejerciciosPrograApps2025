//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("Escribe el primer número")
    val num1 = scanner.nextInt()

    println("Escribe el segundo número")
    val num2 = scanner.nextInt()

    println("$num1 + $num2 = ${num1 + num2}")
}