package com.example.retrofitcoba

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
  private const val BASEURL = "https://jsonplaceholder.typicode.com/"

  val instance: Api by lazy {
    val retrofit = Retrofit.Builder()
      .baseUrl(BASEURL)
      .addConverterFactory(GsonConverterFactory.create())
      .build()

    retrofit.create(Api::class.java)
  }
}