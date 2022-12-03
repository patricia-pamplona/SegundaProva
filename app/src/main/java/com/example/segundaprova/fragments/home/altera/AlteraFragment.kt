package com.example.segundaprova.fragments.home.altera

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.segundaprova.R
import com.example.segundaprova.databinding.FragmentAlteraBinding
import com.example.segundaprova.fragments.home.detalhes.DetalhesFragmentArgs
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AlteraFragment : Fragment() {

    private lateinit var viewModel: AlteraViewModel
    lateinit var binding: FragmentAlteraBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(AlteraViewModel::class.java)
        binding = FragmentAlteraBinding.inflate(inflater, container, false)
        val args = AlteraFragmentArgs.fromBundle(requireArguments())
        viewModel.carregarPersonagemFilme(args.id)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        binding.buttonAltera.setOnClickListener{
            viewModel.alterarButtonEvent()
            Navigation.findNavController(it).navigate(R.id.action_alteraFragment_to_homeFragment)
            Toast.makeText(requireContext(), "Personagem alterado com sucesso!", Toast.LENGTH_SHORT).show()
        }


        setHasOptionsMenu(true)
        // Inflate the layout for this fragment
        return binding.root
    }

}