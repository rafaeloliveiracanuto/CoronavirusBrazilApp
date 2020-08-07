package com.example.coronavirusbrazil.service.repository

import android.content.Context
import com.example.coronavirusbrazil.service.model.CovidDataModel
import com.example.coronavirusbrazil.service.repository.remote.CovidDataService
import com.example.coronavirusbrazil.service.repository.remote.RetrofitClient
import retrofit2.Call

class CovidDataRepository(val context: Context) {

    private val mRemote = RetrofitClient.createService((CovidDataService::class.java))

    fun getData(call: Call<CovidDataModel>) {
        
    }

}