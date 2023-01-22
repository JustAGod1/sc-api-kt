package ru.justagod.scapi.models

import kotlinx.serialization.Serializable



@Serializable
data class ClanInfo (
    val id: String,
    val name: String,
    val tag: String,
    val level: Int,
    val levelPoints: Int,
    @Serializable(OffsetDataTimeSerializer::class)
    val registrationTime: java.time.OffsetDateTime,
    val description: String,
    val leader: String,
    val memberCount: Int,
    val alliance: String? = null
)

