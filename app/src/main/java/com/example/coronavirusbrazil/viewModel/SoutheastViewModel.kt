package com.example.coronavirusbrazil.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SoutheastViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is southeast Fragment"
    }
    val text: LiveData<String> = _text
}
