package com.rfsfernandes.data.remote.dto

import com.squareup.moshi.Json

/**
 * @author RodrigoFernandes
 * Created 20/03/2023 at 16:13
 */
data class PokemonListResponse(
    @field:Json(name = "count")
    var count: Int = 0,
    @field:Json(name = "next")
    var nextPage: String? = null,
    @field:Json(name = "previous")
    var previousPage: String? = null,
    @field:Json(name = "results")
    var resultList: List<SimpleModelData>? = null

) {

    override fun toString(): String {
        return "PokemonListResponse{" +
                "count=" + count +
                ", nextPage='" + nextPage + '\'' +
                ", previousPage='" + previousPage + '\'' +
                ", resultList=" + resultList +
                '}'
    }
}
