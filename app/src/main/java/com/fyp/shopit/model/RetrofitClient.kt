package com.fyp.shopit.model

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

abstract class RetrofitClient {

    companion object {
        private const val BASE_URL = "http://10.0.2.2:5000/"
        private lateinit var retrofit: Retrofit

        fun getInstance(): Retrofit {
            return if (::retrofit.isInitialized) {
                retrofit
            } else {
                initClient()
            }
        }

        private fun initClient(): Retrofit {
            retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()

            return retrofit
        }
    }

}