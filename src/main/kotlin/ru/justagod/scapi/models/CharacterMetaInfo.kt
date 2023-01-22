package ru.justagod.scapi.models

import kotlinx.serialization.Serializable
@Serializable
data class CharacterMetaInfo (
    val id: String,
    val name: String,
    @Serializable(OffsetDataTimeSerializer::class)
    val creationTime: java.time.OffsetDateTime
)

