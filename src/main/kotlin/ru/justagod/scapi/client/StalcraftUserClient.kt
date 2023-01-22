package ru.justagod.scapi.client

import ru.justagod.scapi.models.ClanMember
import ru.justagod.scapi.models.FullCharacterInfo

class StalcraftUserClient(baseUrl: String, appToken: String) : StalcraftAppClient(baseUrl, appToken) {
    suspend fun getCharactersList(
        region: String
    ): List<FullCharacterInfo> {
        val url = "%s/characters".format(region)
        val args = mapOf<String, String>()
        return request(url, args)
    }
    suspend fun getClanMembers(
        region: String, clan: String
    ): List<ClanMember> {
        val url = "%s/clan/%s/members".format(region, clan)
        val args = mapOf<String, String>()
        return request(url, args)
    }
    suspend fun getFriendsList(
        region: String, character: String
    ): List<String> {
        val url = "%s/friends/%s".format(region, character)
        val args = mapOf<String, String>()
        return request(url, args)
    }


    companion object {
        fun makeDemo() = StalcraftUserClient(DEMO_URL, USER_DEMO_TOKEN)
    }
}