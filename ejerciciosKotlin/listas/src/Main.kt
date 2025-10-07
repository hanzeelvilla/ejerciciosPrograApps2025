import kotlin.random.Random

fun main() {
    // LISTSA INMUTABLES
    val list: List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    println(list)
    println("Pos 3 de mi lista: ${list[3]}")
    println("Primer elemento de mi lista: ${list.first()}")
    println("Último elemento de mi lista: ${list.last()}")
    println("Tamaño de mi lista: ${list.size}")

    println("=======================")
    for(dia in list){
        println(dia)
    }

    println("======================")
    println("Filtrar la lista")
    println(list.filter{it == "Lunes" || it == "Jueves"})

    //LISTA MUTABLE
    println("======================")
    println("Lista mutable")
    val mutableList: MutableList<String> = mutableListOf("Lunes")
    mutableList.add("Martes")
    println(mutableList)

    //LISTA DE NUMS
    val numList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Mi lista $numList")
    println("Promedio ${numList.average()}")
    numList.add(0, 0)
    println(numList)
    val numMayorDe6 = numList.count {it > 6}
    println("Números mayores a 6: $numMayorDe6")

    println("Eliminar números mayores a 6")
    numList.removeAll {it > 6}
    println(numList)

    // EJERCICIOS
    println("EJERCICIOS")
    val randomNumList: MutableList<Int> = mutableListOf()
    for(i in 1 .. 20) {
        val randomNum = Random.nextInt(1, 7)
        randomNumList.add(randomNum)
    }
    println("Lista: $randomNumList")
    println("Total de nums 1: ${randomNumList.count { it == 1 }}")
    randomNumList.removeAll { it == 6 }
    println("Lista sin el num 6 $randomNumList")
}