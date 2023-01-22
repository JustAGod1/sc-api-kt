package ru.justagod.scapi.models

import kotlinx.serialization.Serializable

@Serializable
data class RegionInfo(
    val id: kotlin.String,
    val name: kotlin.String
)

