package ru.perm.v

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PersonTest {

    @Test
    fun getName() {
        val person = Person("a", 1)
        assertEquals(1, person.age)
    }

    @Test
    fun getNameFalse() {
        val person = Person("a", 1)
        assertNotEquals(2, person.age)
    }

    @Test
    internal fun maxBy() {
        val persons =  listOf<Person>(Person("name2", 2),Person("name1", 1))
        assertEquals(2, persons.size)
    }
}