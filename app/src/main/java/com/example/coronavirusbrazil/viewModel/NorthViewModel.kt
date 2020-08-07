package com.example.coronavirusbrazil.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.coronavirusbrazil.service.listener.ValidationListener
import com.example.coronavirusbrazil.service.model.CovidDataModel
import com.example.coronavirusbrazil.service.repository.CovidDataRepository

class NorthViewModel(application: Application) : AndroidViewModel(application) {
    private val mCovidDataRepository = CovidDataRepository(application)

    private val mValidation = MutableLiveData<ValidationListener>()
    var validation: LiveData<ValidationListener> = mValidation

    private val mGetData = MutableLiveData<CovidDataModel>()
    var covidData: LiveData<CovidDataModel> = mGetData


}