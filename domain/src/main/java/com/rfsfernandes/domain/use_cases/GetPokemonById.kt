package com.rfsfernandes.domain.use_cases

import com.rfsfernandes.domain.repository.Repository
import kotlinx.coroutines.flow.Flow

/**
 * @author RodrigoFernandes
 * Created 18/03/2023 at 17:38
 */
class GetPokemonById(private val repository: Repository) {

    operator fun invoke(id: Int): Flow<Nothing> {
        return repository.getPokemonById(id)
    }

}