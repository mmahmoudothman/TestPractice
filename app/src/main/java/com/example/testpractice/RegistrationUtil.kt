package com.example.testpractice

import android.text.TextUtils

object RegistrationUtil {
    private val existingUsers = listOf("Perter", "Carl")

    /**
     * the input is not valid if ...
     * .... the username and password is empty
     * .... the username is already taken
     * ... the confirmPassword is not the same as the real password
     * ... the password contains less than 2 digits
     * */
    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty())
            return false
        else if (username in existingUsers)
            return false
        else if (password != confirmPassword)
            return false
        else if (password.count { it.isDigit() } < 2)
            return false
        return true
    }
}