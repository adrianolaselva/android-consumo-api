package br.com.adrianolaselva.consumoapi.model

import com.google.gson.annotations.SerializedName

data class Sprites(

    @SerializedName("front_default")
    val frontDefault: String,

    @SerializedName("back_default")
    val backDefault: String
)