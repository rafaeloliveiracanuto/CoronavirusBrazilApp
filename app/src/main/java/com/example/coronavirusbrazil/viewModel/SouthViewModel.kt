package com.example.coronavirusbrazil.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SouthViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Dados do coronavírus no Sul"
    }
    val text: LiveData<String> = _text
}