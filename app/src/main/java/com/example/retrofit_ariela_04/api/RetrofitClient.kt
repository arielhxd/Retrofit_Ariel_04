package com.example.retrofit_ariela_04.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://learn-retrofit-data.netlify.app"

    val instance: Api by lazy {
        val retrtofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        retrtofit.create(Api::class.java )
    }
}