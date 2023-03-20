package com.rfsfernandes.data.remote.dto.pokemon.sprites

import com.squareup.moshi.Json

/**
 * Class PokemonSprites created at 1/16/21 15:21 for the project PoketDex
 * By: rodrigofernandes
 */
data class PokemonSpritesDto(
    @field:Json(name = "front_default")
    var frontDefault: String,
    @field:Json(name = "front_shiny")
    var frontShiny: String,

    @field:Json(name = "other")
    var otherInfo: OtherSpriteInfoDto
) {

    override fun toString(): String {
        return "PokemonSprites{" +
                "frontDefault='" + frontDefault + '\'' +
                ", frontShiny='" + frontShiny + '\'' +
                ", otherInfo=" + otherInfo +
                '}'
    }
}