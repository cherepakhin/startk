package ru.perm.v

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows

class PersonNullTest {

    @Test
    fun getErrNameLate() {
        val person = PersonNull()
//kotlin.UninitializedPropertyAccessException: lateinit property nameLate has not been initialized
//        assertEquals(1, person.getErrNameLate())
        person.nameLate="-"
        assertEquals("-", person.getErrNameLate())
    }

    @Test
    internal fun nullExcpt() {
        val person = PersonNull()
//kotlin.UninitializedPropertyAccessException: lateinit property nameLate has not been initialized
        assertThrows<UninitializedPropertyAccessException> { person.getErrNameLate() }
    }
}