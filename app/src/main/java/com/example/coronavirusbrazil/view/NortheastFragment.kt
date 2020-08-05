package com.example.coronavirusbrazil.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.coronavirusbrazil.R
import com.example.coronavirusbrazil.viewModel.NortheastViewModel

class NortheastFragment : Fragment() {

    private lateinit var galleryViewModel: NortheastViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
                ViewModelProviders.of(this).get(NortheastViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_northeast, container, false)
        val textView: TextView = root.findViewById(R.id.text_northeast)
        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}