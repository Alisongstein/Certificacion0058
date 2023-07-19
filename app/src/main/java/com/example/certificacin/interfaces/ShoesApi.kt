package com.example.certificacin

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Path


interface ShoesApi {

    @GET("shoes")
    fun getShoes(): Call<List<Shoes>>






}