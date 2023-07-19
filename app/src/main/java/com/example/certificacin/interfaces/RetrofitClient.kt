package com.example.certificacin

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class RetrofitClient {


 companion object {
     private const val BASE_URL = "https://api.zapateriaunica.com/"

  lateinit var retrofitInstance : Retrofit
     fun retrofitInstance():ShoesApi{

         val retrofit = Retrofit.Builder()
             .baseUrl(BASE_URL)
             .addConverterFactory(GsonConverterFactory.create())
             .build()

         return retrofit.create(ShoesApi::class.java)

     }

 }
}