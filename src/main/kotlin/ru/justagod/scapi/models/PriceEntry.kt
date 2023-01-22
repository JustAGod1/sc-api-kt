package ru.justagod.scapi.models

import kotlinx.serialization.Serializable
@Serializable
data class PriceEntry (
    val amount: Int,
    val price: Long,
    @Serializable(OffsetDataTimeSerializer::class)
    val time: java.time.OffsetDateTime
)

