data class Person(
    val name: String,
    val age: Int? = null
)

fun main(args: Array<String>) {
    val i = 1
    val k: String?
    k = "kkk"
    println(message = k)
    println("i = $i")

    val persons = listOf(
        Person("name0"),
        Person("name1", 1),
        Person(age = 2, name ="name2")
    )
    println(persons.get(0))
    println(persons.get(1))
    println(persons.get(2))
    val oldest = persons.maxByOrNull { it.age ?: 0 }
    println("The oldest is: $oldest")


    val personsNull = listOf(
        Person("name0", age = 1),
        Person("name1", age = 1),
    )
    val oldestNull = personsNull.maxByOrNull { it.age ?: 0 }
    println("The oldest from array with NULL is: $oldestNull")

    val nameToAge = listOf("Alice" to 42, "Bob" to 28, "Carol" to 51)

}
