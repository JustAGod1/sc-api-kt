package ru.justagod.scapi.models

import kotlinx.serialization.Serializable
import ru.justagod.scapi.models.ClanRank

@Serializable
data class ClanMember (
    val name: kotlin.String,
    val rank: ClanRank,
    @Serializable(OffsetDataTimeSerializer::class)
    val joinTime: java.time.OffsetDateTime
)

