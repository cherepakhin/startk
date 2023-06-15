package ru.perm.v

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class PersonNullTest {

    @Test
    fun getErrNameLate() {
        val person = PersonNull()
        assertEquals(1, person.getErrNameLate())
    }
}