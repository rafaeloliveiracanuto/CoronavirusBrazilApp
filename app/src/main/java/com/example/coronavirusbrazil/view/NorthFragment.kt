package com.example.coronavirusbrazil.view

import android.os.Bundle
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
import com.example.coronavirusbrazil.viewModel.NorthViewModel

class NorthFragment : Fragment() {

    private lateinit var mViewModel: NorthViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        mViewModel = ViewModelProvider(this).get(NorthViewModel::class.java)

        val root = inflater.inflate(R.layout.fragment_north, container, false)
        val textView: TextView = root.findViewById(R.id.text_north)

        observe()

        return root
    }

    private fun observe() {
        mViewModel.covidData.observe(viewLifecycleOwner, Observer {

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