package com.rfsfernandes.data.remote.dto.pokemon.sprites

import com.squareup.moshi.Json

/**
 * Class OtherSpriteInfo created at 1/16/21 15:28 for the project PoketDex
 * By: rodrigofernandes
 */
data class OtherSpriteInfoDto(

    @field:Json(name = "official-artwork")
    var officialArtWorkDto: OfficialArtWorkDto
) {
    override fun toString(): String {
        return "OtherSpriteInfo{" +
                "officialArtWork=" + officialArtWorkDto +
                '}'
    }
}