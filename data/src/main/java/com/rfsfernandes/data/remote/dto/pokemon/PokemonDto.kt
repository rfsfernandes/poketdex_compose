package com.rfsfernandes.data.remote.dto.pokemon

import com.rfsfernandes.data.remote.dto.SimpleModelData
import com.rfsfernandes.data.remote.dto.pokemon.moves.PokemonMovesDto
import com.rfsfernandes.data.remote.dto.pokemon.sprites.PokemonSpritesDto
import com.rfsfernandes.data.remote.dto.pokemon.stats.StatsDto
import com.rfsfernandes.data.remote.dto.pokemon.types.PokemonTypeDto
import com.squareup.moshi.Json

/**
 * Class Pokemon created at 1/16/21 14:45 for the project PoketDex
 * By: rodrigofernandes
 */
data class PokemonDto(
    @field:Json(name = "base_experience")
    var baseExperience: Int,
    @field:Json(name = "height")
    var height: Int,
    @field:Json(name = "weight")
    var weight: Int,
    @field:Json(name = "moves")
    var moveslist: List<PokemonMovesDto>,
    @field:Json(name = "name")
    var name: String,
    @field:Json(name = "id")
    var id: Int,
    @field:Json(name = "species")
    var speciesInfo: SimpleModelData,
    @field:Json(name = "stats")
    var statsList: List<StatsDto>,
    @field:Json(name = "types")
    var typeList: List<PokemonTypeDto>,
    @field:Json(name = "sprites")
    var sprites: PokemonSpritesDto
) {

    override fun toString(): String {
        return "Pokemon{" +
                "baseExperience=" + baseExperience +
                ", height=" + height +
                ", weight=" + weight +
                ", moveslist=" + moveslist +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", speciesInfo=" + speciesInfo +
                ", statsList=" + statsList +
                ", typeList=" + typeList +
                ", sprites=" + sprites +
                '}'
    }
}