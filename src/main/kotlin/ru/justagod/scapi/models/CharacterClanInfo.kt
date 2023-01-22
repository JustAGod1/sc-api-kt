package ru.justagod.scapi.models

import kotlinx.serialization.Serializable
import ru.justagod.scapi.models.ClanInfo
import ru.justagod.scapi.models.ClanMember

@Serializable
data class CharacterClanInfo (
    val info: ClanInfo,
    val member: ClanMember
)

