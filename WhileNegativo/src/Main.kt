import java.util.Scanner

fun main() {
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