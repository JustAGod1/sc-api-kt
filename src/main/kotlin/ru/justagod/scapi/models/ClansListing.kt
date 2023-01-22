package ru.justagod.scapi.models

import kotlinx.serialization.Serializable

@Serializable
data class ClansListing(
    val totalClans: Int,
    val `data`: List<ClanInfo>
)

