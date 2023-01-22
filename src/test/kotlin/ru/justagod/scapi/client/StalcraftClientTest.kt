package ru.justagod.scapi.client

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StalcraftClientTest {

    @Test
    fun `get regions`() = runBlocking {
        val response = StalcraftClient.getListOfRegions(StalcraftClient.DEMO_URL)

        println(response)
    }
}