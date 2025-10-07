import java.util.Scanner

fun main() {
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