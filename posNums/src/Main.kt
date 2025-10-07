import java.util.Scanner

fun main() {
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