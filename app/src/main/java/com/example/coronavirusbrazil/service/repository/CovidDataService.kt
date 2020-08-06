package com.example.coronavirusbrazil.service.repository

import com.example.coronavirusbrazil.service.model.CovidDataModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CovidDataService {

    @GET("/api/report/v1/brazil/uf/{uf}")
    fun getData(@Path(value = "uf", encoded = true) uf: Int): Call<CovidDataModel>
}