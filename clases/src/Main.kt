import kotlin.math.pow

class Person(
    name: String = "",
    age: Int = 0,
    dni: String = "",
    sex: String = "M",
    weight: Double,
    height: Double
) {
    private val name: String = name
    private val age: Int = age
    private val dni: String = dni
    private val sex: String = sex
    private val weight: Double = weight
    private val height: Double = height

    fun calculateIMC(): Int {
        val imc = this.weight / this.height.pow(2.0)
        println(imc)

        if(imc > 25)
            return 1
        else if(imc >= 20)
            return 0
        else
            return -1
    }
}

fun main() {
    val person1 = Person("Hanzeel", 21, "1234567890","M", 56.0, 1.75)
    val person2 = Person("Dari", 20, "0987654321", "F",60.0, 1.80)

    val person1Imc: Int = person1.calculateIMC()
    val persona2Imc: Int = person2.calculateIMC()

    println("IMC person1: $person1Imc")
    println("IMC person2: $persona2Imc")

}