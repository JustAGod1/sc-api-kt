package ru.justagod.scapi.models

import kotlinx.serialization.Serializable
@Serializable
data class Lot (
    val itemId: String,
    val startPrice: Long,
    val buyoutPrice: Long,
    @Serializable(OffsetDataTimeSerializer::class)
    val startTime: java.time.OffsetDateTime,
    @Serializable(OffsetDataTimeSerializer::class)
    val endTime: java.time.OffsetDateTime,
    val additional: Map<String, String>,
    val currentPrice: Long? = null
)

