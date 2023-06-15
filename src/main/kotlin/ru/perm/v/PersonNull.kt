package ru.perm.v

class PersonNull {
//    var name: String // так требует инициализации
    // Типичная инициализация
    private var nameSimple: String = ""
    // Так ошибка
//    private var nameSimple: String = null

    // так НЕ требует инициализации. "lateinit" говорит,
    // что будет ПОЗЖЕ проинициализировано
    // Но можно получить NPE
    lateinit var nameLate: String

    // Err - потому-что не инициалицировано, а помечено lateinit
    fun getErrNameLate(): String {
        return nameLate
    }
}