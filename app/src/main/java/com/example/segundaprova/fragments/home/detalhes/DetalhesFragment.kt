package com.example.segundaprova.fragments.home.detalhes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.segundaprova.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetalhesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detalhes, container, false)
    }
}