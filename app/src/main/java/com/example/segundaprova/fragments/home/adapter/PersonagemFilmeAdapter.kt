package com.example.segundaprova.fragments.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.segundaprova.databinding.PersonagemViewBinding
import com.example.segundaprova.dominio.PersonagemFilme

class PersonagemFilmeAdapter : ListAdapter<PersonagemFilme, PersonagemFilmeAdapter.PersonagemFilmeViewHolder>(RemedioDiffUtilCallback()){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonagemFilmeViewHolder {
        return PersonagemFilmeViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: PersonagemFilmeViewHolder, position: Int) {
        val remedio = getItem(position)
        holder.bind(remedio)
    }

    class PersonagemFilmeViewHolder private constructor(var binding:PersonagemViewBinding ) : RecyclerView.ViewHolder(binding.root){

        fun bind(personagemFilme: PersonagemFilme) {
            binding.nomePersonagem.text = personagemFilme.nome

            binding.nomePersonagem.setOnClickListener {
                Toast.makeText(binding.root.context, "CLicou no texto", Toast.LENGTH_SHORT).show()
            }
        }

        companion object {
            fun from(parent: ViewGroup): PersonagemFilmeViewHolder {

                val inflater = LayoutInflater.from(parent.context)
                val binding = PersonagemViewBinding.inflate(inflater, parent, false)
                return PersonagemFilmeViewHolder(binding)
            }
        }
    }

    class RemedioDiffUtilCallback : DiffUtil.ItemCallback<PersonagemFilme>(){
        override fun areItemsTheSame(oldItem: PersonagemFilme, newItem: PersonagemFilme): Boolean {
            return oldItem.id.equals(newItem.id)
        }

        override fun areContentsTheSame(oldItem: PersonagemFilme, newItem: PersonagemFilme): Boolean {
            return oldItem.equals(newItem)
        }

    }
}