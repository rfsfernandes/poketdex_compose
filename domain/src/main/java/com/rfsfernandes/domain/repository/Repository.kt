package com.rfsfernandes.domain.repository

import com.rfsfernandes.domain.model.Pokemon
import com.rfsfernandes.util.Resource
import kotlinx.coroutines.flow.Flow

/**
 * @author RodrigoFernandes
 * Created 18/03/2023 at 17:43
 */
interface Repository {

    fun getPokemons(): Flow<Resource<List<Pokemon>>>
    fun getPokemonById(id: Int): Flow<Nothing>
    fun getSpeciesById(id: Int): Flow<Nothing>
    fun getTypeById(id: Int): Flow<Nothing>
    fun getMoveById(id: Int): Flow<Nothing>

}