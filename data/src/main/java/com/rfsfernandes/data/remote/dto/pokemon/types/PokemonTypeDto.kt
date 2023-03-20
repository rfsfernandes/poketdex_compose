package com.rfsfernandes.data.remote.dto.pokemon.types

import com.rfsfernandes.data.remote.dto.SimpleModelData
import com.squareup.moshi.Json

/**
 * Class PokemonType created at 1/16/21 15:34 for the project PoketDex
 * By: rodrigofernandes
 */
class PokemonTypeDto(
    @field:Json(name = "slot")
    var slot: Int,

    @field:Json(name = "type")
    var type: SimpleModelData
) {

    override fun toString(): String {
        return "PokemonType{" +
                "slot=" + slot +
                ", type=" + type +
                '}'
    }
}