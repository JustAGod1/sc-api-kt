package ru.justagod.scapi.models

import kotlinx.serialization.Serializable
import ru.justagod.scapi.models.PriceEntry
@Serializable
data class PricesListing (
    val total: Long,
    val prices: List<PriceEntry>
)

