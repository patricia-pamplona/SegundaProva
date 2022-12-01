package com.example.segundaprova.fragments.home.detalhes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.segundaprova.dominio.PersonagemFilme
import com.example.segundaprova.repository.PersonagemFilmeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class DetalhesViewModel @Inject constructor(
    private val repository: PersonagemFilmeRepository
) : ViewModel() {

    val personagemFilme = MutableLiveData<PersonagemFilme>()

}