package com.example.testinandroid


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `valid username correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Martin",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Martin",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `username already exist returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `confirmed password not match password returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Martin",
            "1234",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password has length less than 2 digits returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            "Martin",
            "martin1",
            "martin1"
        )
        assertThat(result).isFalse()
    }

}