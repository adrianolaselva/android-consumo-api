package br.com.adrianolaselva.consumoapi.api

import br.com.adrianolaselva.consumoapi.model.Pokemon
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface PokemonAPI {

    @GET("api/v2/pokemon/{number}")
    fun search(@Path("number") number: String): Call<Pokemon>

}