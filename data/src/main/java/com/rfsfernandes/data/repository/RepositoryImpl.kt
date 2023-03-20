package com.rfsfernandes.data.repository

import com.rfsfernandes.data.remote.PokeApi
import com.rfsfernandes.domain.model.Pokemon
import com.rfsfernandes.domain.repository.Repository
import com.rfsfernandes.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

/**
 * @author RodrigoFernandes
 * Created 20/03/2023 at 16:01
 */
class RepositoryImpl @Inject constructor(
    private val api: PokeApi
) : Repository {

    override fun getPokemons(): Flow<Resource<List<Pokemon>>> {
        return flow {
            emit(Resource.Loading(true))

            var remotePokemons = try {
                val response = api.getPokemonListPagination( 1)
                if (response.isSuccessful) {
                    response.body()?.let {
                        val allPokemonResponse = api.getPokemonListPagination(it.count)
                        if(allPokemonResponse.isSuccessful) {
                            allPokemonResponse.body()?.let {
                                
                            }
                        }
                    }

                } else {
                    throw IOException()
                }
            } catch (e: IOException) {
                e.printStackTrace()
                emit(Resource.Error("Couldn't load data"))
                null
            } catch (e: HttpException) {
                e.printStackTrace()
                emit(Resource.Error("Couldn't fetch from server."))
                null
            }

        }
    }

    override fun getPokemonById(id: Int): Flow<Nothing> {
        return flow {

        }
    }

    override fun getSpeciesById(id: Int): Flow<Nothing> {
        return flow {

        }
    }

    override fun getTypeById(id: Int): Flow<Nothing> {
        return flow {

        }
    }

    override fun getMoveById(id: Int): Flow<Nothing> {
        return flow {

        }
    }
}