import kotlin.math.pow
import kotlin.random.Random

enum class Sex {
    MALE,
    FEMALE
}

interface PersonData {
    val name: String
    val age: Int
    val sex: Sex
    val weight: Double
    val height: Double

    val minDNI: Int
    val maxDNI: Int

    val dni: Int

    fun calculateIMC(): Int
    fun isAdult(): Boolean
}

class Person (
    override val name: String = "",
    override val age: Int = 0,
    override val sex: Sex = Sex.MALE,
    override val weight: Double,
    override val height: Double,

): PersonData {

    override val minDNI: Int = 1000000
    override val maxDNI: Int = 99999999

    override val dni: Int = generateDNI()
    override fun calculateIMC(): Int {
        val imc = weight / height.pow(2.0)
        println(imc)

        if(imc > 25)
            return 1
        else if(imc >= 20)
            return 0
        else
            return -1
    }

    override fun isAdult(): Boolean {
        return this.age >= 18
    }

    private fun generateDNI(): Int {
        val dniNumber = Random.nextInt(minDNI, maxDNI + 1)
        return dniNumber
    }
}

fun main() {
    val person1 = Person("Hanzeel", 21, Sex.MALE, 56.0, 1.75)
    val person2 = Person("Dari", 20, Sex.FEMALE,60.0, 1.80)

    val person1IMC: Int = person1.calculateIMC()
    val isPerson1Adult: Boolean = person1.isAdult()
    val person1DNI: Int = person1.dni

    val persona2IMC: Int = person2.calculateIMC()
    val isPerson2Adult: Boolean = person2.isAdult()
    val person2DNI: Int = person2.dni

    println("IMC person1: $person1IMC")
    println("Is person1 adult? $isPerson1Adult")
    println("Person1 DNI: $person1DNI")
    println("========================")
    println("IMC person2: $persona2IMC")
    println("Is person2 adult? $isPerson2Adult")
    println("Person2 DNI: $person2DNI")


}