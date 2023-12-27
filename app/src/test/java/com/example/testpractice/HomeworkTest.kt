package com.example.testpractice

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class HomeworkTest {

    @Test
    fun `Checks if the braces are set correctly`() {
        val result = Homework.checkBraces("(a * b))")
        assertThat(result).isFalse()
    }
}