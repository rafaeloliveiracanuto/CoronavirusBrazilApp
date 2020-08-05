package com.example.coronavirusbrazil.view

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.coronavirusbrazil.R
import com.example.coronavirusbrazil.viewModel.SoutheastViewModel

class SoutheastFragment : Fragment() {

    companion object {
        fun newInstance() = SoutheastFragment()
    }

    private lateinit var viewModel: SoutheastViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.southeast_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SoutheastViewModel::class.java)
        // TODO: Use the ViewModel
    }

}