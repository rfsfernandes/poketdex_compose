package com.rfsfernandes.domain.use_cases

import com.rfsfernandes.domain.repository.Repository
import kotlinx.coroutines.flow.Flow

/**
 * @author RodrigoFernandes
 * Created 18/03/2023 at 17:39
 */
class GetTypeInfoById(private val repository: Repository) {

    operator fun invoke(id: Int): Flow<Nothing> {
        return repository.getTypeById(id)
    }

}