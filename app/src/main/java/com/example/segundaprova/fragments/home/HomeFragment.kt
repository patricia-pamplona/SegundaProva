package com.example.segundaprova.fragments.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.segundaprova.R
import com.example.segundaprova.databinding.FragmentHomeBinding
import com.example.segundaprova.fragments.home.adapter.PersonagemFilmeAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding
    lateinit var viewModel: HomeViewModel


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        val adapter = PersonagemFilmeAdapter()

        viewModel.personagens.observe(viewLifecycleOwner, {
            adapter.submitList(it)
        })

        binding.recyclerView.adapter = adapter
        binding.recyclerView.addOnItemTouchListener(
            RecyclerViewClickListener(binding.recyclerView, object : RecyclerViewClickListener.OnItemClickListener{
                override fun onItemClick(view: View, position: Int) {
                    Toast.makeText(requireContext(), "Toque simples", Toast.LENGTH_SHORT).show()
                }

                override fun onItemLongClick(view: View, position: Int) {
                    Toast.makeText(requireContext(), "Toque longo", Toast.LENGTH_SHORT).show()
                }

            }))

        return binding.root
    }
}