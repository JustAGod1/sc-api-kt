package ru.justagod.scapi.models

import kotlinx.serialization.Serializable
import java.time.OffsetDateTime

@Serializable
data class EmissionInfo (
    @Serializable(OffsetDataTimeSerializer::class)
    val currentStart: OffsetDateTime? = null,

    @Serializable(OffsetDataTimeSerializer::class)
    val previousStart: OffsetDateTime? = null,

    @Serializable(OffsetDataTimeSerializer::class)
    val previousEnd: OffsetDateTime? = null
)

