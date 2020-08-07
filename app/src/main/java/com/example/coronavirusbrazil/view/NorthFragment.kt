package com.example.coronavirusbrazil.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.coronavirusbrazil.R
import com.example.coronavirusbrazil.service.repository.remote.CovidDataService
import com.example.coronavirusbrazil.service.repository.remote.RetrofitClient
import com.example.coronavirusbrazil.viewModel.NorthViewModel
import kotlin.math.log

class NorthFragment : Fragment() {

    private lateinit var mViewModel: NorthViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        mViewModel = ViewModelProvider(this).get(NorthViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_north, container, false)

        val textViewUF: TextView = root.findViewById(R.id.text_uf)
        val textViewState: TextView = root.findViewById(R.id.text_state)
        val textViewCases: TextView = root.findViewById(R.id.text_cases)
        val textViewDeaths: TextView = root.findViewById(R.id.text_deaths)
        val textViewSuspects: TextView = root.findViewById(R.id.text_suspects)
        val textViewRefuses: TextView = root.findViewById(R.id.text_refuses)
        val textViewDateTime: TextView = root.findViewById(R.id.text_datetime)

        val textViewList = arrayListOf<TextView>(
            textViewUF, textViewState, textViewCases,
            textViewDeaths, textViewSuspects, textViewRefuses,
            textViewDateTime
        )

        mViewModel.getData()

        observe(textViewList)

        return root
    }

    private fun observe(textViewList: List<TextView>) {
        mViewModel.covidData.observe(viewLifecycleOwner, Observer {
            textViewList[0].text = "UF: ${it.uf}"
            textViewList[1].text = "Estado: ${it.state}"
            textViewList[2].text = "Casos: " + it.cases.toString()
            textViewList[3].text = "Mortes: " + it.deaths.toString()
            textViewList[4].text = "Suspeitos: " + it.suspects.toString()
            textViewList[5].text = "Descartados: " + it.refuses.toString()
            textViewList[6].text = "Última atualização: ${it.datetime}"
        })

        mViewModel.validation.observe(viewLifecycleOwner, Observer {
            if (it.success()) {
                //
            } else {
                Toast.makeText(context, it.failure(), Toast.LENGTH_SHORT).show()
            }
        })
    }
}