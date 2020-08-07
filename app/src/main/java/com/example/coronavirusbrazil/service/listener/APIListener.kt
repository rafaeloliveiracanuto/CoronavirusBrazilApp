package com.example.coronavirusbrazil.service.listener

interface APIListener<T> {
    fun onSuccess(model: T)
    fun onFailure(str: String)
}