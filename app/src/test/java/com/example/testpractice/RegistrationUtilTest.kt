package com.example.testpractice

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {


    @Test
    fun `empty username return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password and confirmPassword return true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "mahmoud",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exist return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "abc123",
            "abc123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password is empty return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "carl",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password and conformPassword not match return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "carl",
            "123",
            "456"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than two digits return false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "carl",
            "abcdef1",
            "abcdef1"
        )
        assertThat(result).isFalse()
    }

}