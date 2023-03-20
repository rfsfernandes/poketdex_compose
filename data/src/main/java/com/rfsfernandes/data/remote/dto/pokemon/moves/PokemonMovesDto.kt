package com.rfsfernandes.data.remote.dto.pokemon.moves

import com.rfsfernandes.data.remote.dto.SimpleModelData
import com.squareup.moshi.Json

data class PokemonMovesDto(

    @field:Json(name = "move") var move: SimpleModelData
) {

    override fun toString(): String {
        return "Moves{" +
                "move=" + move +
                '}'
    }
}