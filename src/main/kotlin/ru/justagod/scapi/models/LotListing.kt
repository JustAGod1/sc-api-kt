package ru.justagod.scapi.models

import kotlinx.serialization.Serializable
import ru.justagod.scapi.models.Lot

@Serializable
data class LotListing (
    val total: kotlin.Long,
    val lots: kotlin.collections.List<Lot>
)

