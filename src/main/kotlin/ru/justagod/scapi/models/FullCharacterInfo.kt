package ru.justagod.scapi.models

import kotlinx.serialization.Serializable
import ru.justagod.scapi.models.CharacterClanInfo
import ru.justagod.scapi.models.CharacterMetaInfo
@Serializable
data class FullCharacterInfo (

    
    val information: CharacterMetaInfo,

    
    val clan: CharacterClanInfo? = null

)

