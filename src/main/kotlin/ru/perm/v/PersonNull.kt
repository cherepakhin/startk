package ru.perm.v


class PersonNull {
    // Типичная инициализация
    private var nameSimple: String = ""

    // ERROR в idea
    // Требует инициализации
    // var name: String

    // ERROR в idea
    // private var nameSimple1: String = null

    // так НЕ требует инициализации. "lateinit" говорит,
    // что будет проинициализировано ПОЗЖЕ
    // Но можно получить Runtime Error NPE. См. PersonNullTest.uninitializedPropertyAccessException
    // lateinit var nameLate: String

    // хоть и NULL, но инициализировать все равно нужно
    var nameNull:String? = null

    lateinit var nameLate: String

    fun getErrNameLate(): String {
        // будет Runtime Error, если не инициалицировано, а помечено lateinit
        return nameLate
    }
}