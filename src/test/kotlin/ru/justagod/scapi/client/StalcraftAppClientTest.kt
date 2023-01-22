package ru.justagod.scapi.client

import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StalcraftAppClientTest {

    val client = StalcraftAppClient.makeDemo()

    @Test
    fun `get auction price history`() = runBlocking {
        val regions = client.getAuctionPriceHistory("RU", "BnNl", null, null)
        println(regions)
        assertTrue(regions.prices.isNotEmpty())
    }

    @Test
    fun `get auction lots`() = runBlocking {
        val lots = client.getAuctionLots("RU", "BnNl", null, null, null, null)
        println(lots)
    }

    @Test
    fun `get clan information`() = runBlocking {
        val info = client.getClanInformation("RU", "647d6c53-b3d7-4d30-8d08-de874eb1d845")
        println(info)
    }

    @Test
    fun `get clans list`() = runBlocking {
        val list = client.getClansList("RU", null, null)
        println(list)
    }

    @Test
    fun `get emission information`() = runBlocking {
        val info = client.getEmissionInformation("RU")
        println(info)
    }
}