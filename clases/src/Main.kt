class Person(
    name: String, age:
    Int, dni: String,
    sex: String,
    weight: Double,
    height: Double
) {
    private val name: String = name
    private val age: Int = age
    private val dni: String = dni
    private val sex: String = sex
    private val weight: Double = weight
    private val height: Double = height
}

fun main() {
    val person1 = Person("Hanzeel", 21, "1234567890","M", 56.0, 1.75)
    val person2 = Person("Dari", 20, "0987654321", "F",56.0, 1.80)
}