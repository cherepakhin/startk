package ru.perm.v

class PersonNull {
//    var name: String // Так ERROR. Требует инициализации
    // Типичная инициализация
    private var nameSimple: String = ""
    // Так ошибка
//    private var nameSimple: String = null

    // так НЕ требует инициализации. "lateinit" говорит,
    // что будет ПОЗЖЕ проинициализировано
    // Но можно получить Runtime Error NPE. См. PersonNullTest.uninitializedPropertyAccessException
    lateinit var nameLate: String

    // будет Runtime Error, если не инициалицировано, а помечено lateinit
    fun getErrNameLate(): String {
        return nameLate
    }
}