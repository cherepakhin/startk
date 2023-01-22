import ru.perm.v.Jhava

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

    // Знак ? означает, что м.б. null
    val x: Int? = 9

    // Константа. Нельзя изменять
    val y: Int = 1

//    val y: Int
//    y =1 // если не проинициализировать тут, то дальше будет красное

    //    y =3 т.к. "val" , то будет покраснеет ибо val это константа
    println(message = y)

    val yy: Int
    yy = 10
    println(message = yy)

    val jhava = Jhava()
    println(jhava.name)
    println(jhava.pubName)
    println(jhava.getPubName1())

    // methodReturnedNull() возвращает null
//    println(jhava.methodReturnedNull().toUpperCase()) // так будет Exception

    // a так НЕ!!! будет Exception. Выводится null.
    // Null будет получен после jhava.methodReturnedNull()?
    // .toUpperCase() не будет выполнен
    println(jhava.methodReturnedNull()?.toUpperCase())

    // a так НЕ!!! будет Exception. Выводится PRINT NULL (при null сработает ?: "PRINT NULL")
    println(jhava.methodReturnedNull()?.toUpperCase() ?: "PRINT NULL")
}

