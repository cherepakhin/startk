package ru.perm.v

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows

class PersonNullTest {

    @Test
    fun getErrNameLate() {
        val person = PersonNull()
        person.nameLate="-"
        assertEquals("-", person.getErrNameLate())
    }

    @Test
    fun uninitializedPropertyAccessException() {
        val person = PersonNull()
//RUNTIME ERROR. kotlin.UninitializedPropertyAccessException:
//                  lateinit property nameLate has not been initialized
        assertThrows<UninitializedPropertyAccessException> { person.getErrNameLate() }
    }
}