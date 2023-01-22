package ru.justagod.scapi.client

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StalcraftUserClientTest {
    val client = StalcraftUserClient.makeDemo()

    @Test
    fun `get characters list`() = runBlocking {
        val list = client.getCharactersList("RU")
        println(list)
    }

    @Test
    fun `get clan members`() = runBlocking {
        val list = client.getClanMembers("RU", "647d6c53-b3d7-4d30-8d08-de874eb1d845")
        println(list)
    }

    @Test
    fun `get friends list`() = runBlocking {
        val list = client.getFriendsList("RU", "Test-1")
        println(list)
    }
}