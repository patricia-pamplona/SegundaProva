package com.example.segundaprova.fragments.home.cadastro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.segundaprova.R
import com.example.segundaprova.databinding.FragmentCadastraBinding
import com.example.segundaprova.fragments.home.HomeFragment

class CadastraFragment : Fragment() {

    lateinit var viewModel: CadastraViewModel
    lateinit var binding: FragmentCadastraBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.buttonCadastra.setOnClickListener{
            viewModel.cadastrarButtonEvent()
            Navigation.findNavController(it).navigate(R.id.action_cadastraFragment_to_homeFragment2)
            Toast.makeText(requireContext(), "Personagem cadastrado com sucesso!", Toast.LENGTH_SHORT).show()
        }

        viewModel = ViewModelProvider(this).get(CadastraViewModel::class.java)
        binding = FragmentCadastraBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }
}