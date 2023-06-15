package ru.perm.v


class PersonNull {
    // Типичная инициализация
    private var nameSimple: String = ""

    // ERROR в idea
    // Требует инициализации
    // var name: String

    // private var nameSimple1: String = null

    // "lateinit" НЕ требует инициализации. И говорит, что будет проинициализировано ПОЗЖЕ
    // Но можно получить Runtime Error NPE. См. PersonNullTest.uninitializedPropertyAccessException
    // lateinit var nameLate: String // ERROR в idea
//     lateinit var nameLate: String = null // ERROR в idea

    // хоть "?" говорит, что можно NULL, но инициализировать все равно нужно
    var nameNull:String? = null

    lateinit var nameLate: String

    fun getErrNameLate(): String {
        // При выполнении будет Runtime Error, если не инициалицировано, а помечено lateinit
        return nameLate
    }
}