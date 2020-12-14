package com.dwiyanstudio.retrofittutorial

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkConfig {
    val BASE_URL = "https://www.breakingbadapi.com/api/"
    fun retrofitClient() : Retrofit {
            return Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
    }
    fun getNetwrokInterface() : NetworkInterface = retrofitClient().create(NetworkInterface::class.java)
}