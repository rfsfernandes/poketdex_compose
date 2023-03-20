package com.rfsfernandes.data.remote.dto.pokemon.stats

import com.rfsfernandes.data.remote.dto.SimpleModelData
import com.squareup.moshi.Json

/**
 * Class Stats created at 1/16/21 15:31 for the project PoketDex
 * By: rodrigofernandes
 */
data class StatsDto(
    @field:Json(name = "base_stat")
    var baseStat: Int,

    @field:Json(name = "stat")
    var stat: SimpleModelData
) {

    override fun toString(): String {
        return "Stats{" +
                "baseStat=" + baseStat +
                ", stat=" + stat +
                '}'
    }
}