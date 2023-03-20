package com.rfsfernandes.data.remote.dto.pokemon.sprites

import com.squareup.moshi.Json

/**
 * Class OfficialArtWork created at 1/16/21 15:30 for the project PoketDex
 * By: rodrigofernandes
 */
data class OfficialArtWorkDto(@field:Json(name = "front_default") var frontDefault: String) {
    override fun toString(): String {
        return "OfficialArtWork{" +
                "frontDefault='" + frontDefault + '\'' +
                '}'
    }
}