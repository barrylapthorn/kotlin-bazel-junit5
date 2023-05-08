package com.example

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HelloWorldTests {
    @Test
    fun `say hello`() {
        val obj = HelloWorld()
        assertEquals(obj.hello(), "hello world")
    }
}
