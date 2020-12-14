package com.dwiyanstudio.retrofittutorial

import retrofit2.Call
import retrofit2.http.GET

interface NetworkInterface {
    @GET("characters?limit=10")
    fun getCharacter() : Call<List<Character>>
}