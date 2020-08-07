package com.example.coronavirusbrazil.service.repository

import android.content.Context
import com.example.coronavirusbrazil.R
import com.example.coronavirusbrazil.service.constants.Constants
import com.example.coronavirusbrazil.service.listener.APIListener
import com.example.coronavirusbrazil.service.model.CovidDataModel
import com.example.coronavirusbrazil.service.repository.remote.CovidDataService
import com.example.coronavirusbrazil.service.repository.remote.RetrofitClient
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CovidDataRepository(val context: Context) {

    private val mRemote = RetrofitClient.createService((CovidDataService::class.java))

    fun getData(call: Call<CovidDataModel>, listener: APIListener<CovidDataModel>) {

        call.enqueue(object : Callback<CovidDataModel> {
            override fun onFailure(call: Call<CovidDataModel>, t: Throwable) {
                listener.onFailure(context.getString(R.string.ERROR_UNEXPECTED))
            }

            override fun onResponse(call: Call<CovidDataModel>, response: Response<CovidDataModel>) {
                if (response.code() == Constants.HTTP.SUCCESS) {
                    response.body()?.let {
                        listener.onSuccess(it)
                    }
                } else {
                    val validation = Gson().fromJson(response.errorBody()!!.string(), String::class.java)
                    listener.onFailure(validation)
                }
            }

        })
    }

}