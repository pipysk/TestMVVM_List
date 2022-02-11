package com.example.testmvvm_list

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import java.util.ArrayList

interface ApiService {


    @GET("users")
    suspend fun getAllUsers(): Response<Users>

    companion object {

        private const val BASE_URL = "https://reqres.in/api/"

        operator fun invoke(): ApiService {

            val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return retrofit.create(ApiService::class.java)
        }
    }
}