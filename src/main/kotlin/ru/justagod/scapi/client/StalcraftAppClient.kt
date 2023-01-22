package ru.justagod.scapi.client

import ru.justagod.scapi.models.*

open class StalcraftAppClient(baseUrl: String, appToken: String) : StalcraftClient(baseUrl, appToken) {

    suspend fun getAuctionPriceHistory(
        region: String, item: String, limit: Int?, offset: Long?
    ): PricesListing {
        val url = "%s/auction/%s/history".format(region, item)
        val args = hashMapOf<String, String>()
        if (limit != null)
            args["limit"] = limit.toString()
        if (offset != null)
            args["offset"] = offset.toString()

        return request(url, args)
    }

    suspend fun getAuctionLots(
        region: String, item: String, limit: Int?, offset: Long?, sort: Sort?, order: Order?
    ): LotListing {
        val url = "%s/auction/%s/lots".format(region, item)
        val args = hashMapOf<String, String>()
        if (limit != null)
            args["limit"] = limit.toString()
        if (offset != null)
            args["offset"] = offset.toString()
        if (sort != null)
            args["sort"] = sort.toString()
        if (order != null)
            args["order"] = order.toString()

        return request(url, args)
    }

    suspend fun getClanInformation(
        region: String, clan: String
    ): ClanInfo {
        val url = "%s/clan/%s/info".format(region, clan)
        val args = hashMapOf<String, String>()

        return request(url, args)
    }

    suspend fun getClansList(
        region: String, limit: Int?, offset: Long?
    ): ClansListing {
        val url = "%s/clans".format(region)
        val args = hashMapOf<String, String>()
        if (limit != null)
            args["limit"] = limit.toString()
        if (offset != null)
            args["offset"] = offset.toString()

        return request(url, args)
    }

    suspend fun getEmissionInformation(
        region: String
    ): EmissionInfo {
        val url = "%s/emission".format(region)
        val args = hashMapOf<String, String>()

        return request(url, args)
    }

    companion object {
        fun makeDemo() = StalcraftAppClient(DEMO_URL, APP_DEMO_TOKEN)
    }

}