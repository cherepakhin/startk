fun main(args: Array<String>) {
    var a: String?
    var b: String = "Hello"


    a = null
    if (a != null) {
        a.get(1)
    }
    b = "World"

    println(a == b)
    println(a)
    println(a == null)


    val x: Int? = 9
    val y: Int = 1
    println(message = y)
}

