// Вы можете объявлять глобальные переменные.
val PI = 3.14
var x = 0

data class Person(
    val name: String,
    val age: Int? = null
)

/**
 *  TODO: fun main(args: Array<String>) {
 */
fun main(args: Array<String>) {
    x = 2
    // Неизменяемые (только для чтения) локальные переменные. Присвоить им значение можно только один раз.
    val i = 1
    // Знак ? означает, что м.б. null
    val k: String?
    k = "kkk"
    println(message = k)
    println("i = $i")

    // Изменяемые переменные объявляются с помощью ключевого слова var.
    var x = 5 // Тип `Int` определен автоматически
    x += 1

    /** TODO: listOf
     */
    val persons = listOf(
        Person("name0"),
        Person("name1", 1),
        Person(age = 2, name = "name2")
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
    //TODO: println("The $oldestNull")
    // println("The oldest from array with NULL is: $oldestNull")

    val nameToAge = listOf("Alice" to 42, "Bob" to 28, "Carol" to 51)

    println(nameToAge.get(0))
    println(nameToAge.get(0).first)
    println(nameToAge.get(0).second)

    //Pair
    val cat = "Барсик"
    val catpair = cat.to(10)
    // println(catpair)
    // println(catpair.first)
    // println(catpair.second)


}

