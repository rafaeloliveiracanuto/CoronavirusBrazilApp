package com.example.coronavirusbrazil.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NortheastViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Dados do coronavírus no Nordeste"
    }
    val text: LiveData<String> = _text
}