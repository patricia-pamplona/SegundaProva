package com.example.segundaprova.fragments.home.detalhes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.segundaprova.R
import com.example.segundaprova.databinding.FragmentDetalhesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetalhesFragment : Fragment() {

    lateinit var binding: FragmentDetalhesBinding
    lateinit var viewModel: DetalhesViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        viewModel = ViewModelProvider(this).get(DetalhesViewModel::class.java)
        binding = FragmentDetalhesBinding.inflate(inflater, container, false)
        val args = DetalhesFragmentArgs.fromBundle(requireArguments())
        viewModel.carregarPersonagemFilme(args.id)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this





        return binding.root

        // Inflate the layout for this fragment
    }
}