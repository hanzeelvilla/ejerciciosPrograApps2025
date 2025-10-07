import java.util.Scanner
import kotlin.random.Random

fun main() {
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

