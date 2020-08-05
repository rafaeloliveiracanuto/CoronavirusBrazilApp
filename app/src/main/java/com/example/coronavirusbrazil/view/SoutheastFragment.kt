package com.example.coronavirusbrazil.view

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.coronavirusbrazil.R
import com.example.coronavirusbrazil.viewModel.SouthViewModel
import com.example.coronavirusbrazil.viewModel.SoutheastViewModel

class SoutheastFragment : Fragment() {

    private lateinit var slideshowViewModel: SoutheastViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel =
            ViewModelProviders.of(this).get(SoutheastViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_southeast, container, false)
        val textView: TextView = root.findViewById(R.id.text_southeast)
        slideshowViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

}