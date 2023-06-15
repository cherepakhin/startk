package ru.perm.v

data class Person( // data класс данных
    val name: String,
    val age: Int? = null // ? означает , что м.б. Null
)
