package com.example.coronavirusbrazil.service

import com.example.coronavirusbrazil.service.constants.Constants
import retrofit2.Retrofit

class RetrofitClient private constructor() {
    companion object {
        private lateinit var retrofit: Retrofit
        private val BASE_URL = Constants.RETROFIT.BASE_URL

        private fun getRetrofitInstance(): Retrofit {
            
        }
    }
}