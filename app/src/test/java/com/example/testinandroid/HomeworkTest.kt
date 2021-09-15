package com.example.testinandroid

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class HomeworkTest {

    @Test
    fun `fib function returns 0 when input is 0 will returns true`() {
        val result = Homework.fib(0)
        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `expected 1 when input is 1 will returns true`() {
        val result = Homework.fib(1)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `expected 1 when input is 2 will returns true`() {
        val result = Homework.fib(2)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `expected 3 when input is 3 will returns true`() {
        val result = Homework.fib(3)
        assertThat(result).isEqualTo(3)
    }

    @Test
    fun `expected 5 when input is 4 will returns true`() {
        val result = Homework.fib(4)
        assertThat(result).isEqualTo(5)
    }

    @Test
    fun `expected 7 when input is 5 will returns true`() {
        val result = Homework.fib(5)
        assertThat(result).isEqualTo(7)
    }

    @Test
    fun `count of '(' and ')' not match returns false`() {
        val result = Homework.checkBraces("(a * b))")
        assertThat(result).isFalse()
    }

    @Test
    fun `if ')' in front of '(' returns false`() {
        val result = Homework.checkBraces(")(a * b))")
        assertThat(result).isFalse()
    }
}