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
import com.example.coronavirusbrazil.viewModel.SouthViewModel

class SouthFragment : Fragment() {

    private lateinit var slideshowViewModel: SouthViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SouthViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_south, container, false)
        val textView: TextView = root.findViewById(R.id.text_south)
        slideshowViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}