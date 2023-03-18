package com.rfsfernandes.data.di

import com.rfsfernandes.data.remote.PokeApi
import com.rfsfernandes.data.util.BASE_URL
import com.rfsfernandes.domain.repository.Repository
import com.rfsfernandes.domain.use_cases.*
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

/**
 * @author RodrigoFernandes
 * Created 18/03/2023 at 17:31
 */
@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Singleton
    @Provides
    fun provideMoshi() = Moshi.Builder().build()

    @Singleton
    @Provides
    fun provideRetrofit(moshi: Moshi): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .build()

    @Singleton
    @Provides
    fun providePokeApi(retrofit: Retrofit): PokeApi = retrofit.create(PokeApi::class.java)

    @Singleton
    @Provides
    fun provideGetPokemons(repository: Repository): GetPokemons {
        return GetPokemons(repository)
    }

    @Singleton
    @Provides
    fun provideGetPokemonById(repository: Repository): GetPokemonById {
        return GetPokemonById(repository)
    }

    @Singleton
    @Provides
    fun provideGetSpeciesById(repository: Repository): GetSpeciesById {
        return GetSpeciesById(repository)
    }

    @Singleton
    @Provides
    fun provideGetTypeById(repository: Repository): GetTypeInfoById {
        return GetTypeInfoById(repository)
    }

    @Singleton
    @Provides
    fun provideGetMoveById(repository: Repository): GetMoveByID {
        return GetMoveByID(repository)
    }

}