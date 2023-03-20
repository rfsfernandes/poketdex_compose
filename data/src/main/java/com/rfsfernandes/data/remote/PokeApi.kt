package com.rfsfernandes.data.remote

import com.rfsfernandes.data.remote.dto.PokemonListResponse
import com.rfsfernandes.data.remote.dto.pokemon.PokemonDto
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * @author Rodrigo Fernandes
 * Created 18/03/2023 at 17:20
 */
interface PokeApi {
    @GET("pokemon?offset=0")
    suspend fun getPokemonListPagination(
        @Query("limit") limit: Int
    ): Response<PokemonListResponse>

    @GET("pokemon/{pokemonId}")
    suspend fun getPokemonById(@Path("pokemonId") pokemonId: Int): Response<PokemonDto>

    @GET("pokemon-species/{pokemonId}")
    suspend fun getPokemonSpeciesById(@Path("pokemonId") pokemonId: Int): ResponseBody

    @GET("move/{moveId}")
    suspend fun getMoveById(@Path("moveId") moveId: Int): ResponseBody

    @GET("type/{typeId}")
    suspend fun getTypeInfoById(@Path("typeId") typeId: Int): ResponseBody
}