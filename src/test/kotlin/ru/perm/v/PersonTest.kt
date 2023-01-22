package ru.perm.v

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class PersonTest {

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
}