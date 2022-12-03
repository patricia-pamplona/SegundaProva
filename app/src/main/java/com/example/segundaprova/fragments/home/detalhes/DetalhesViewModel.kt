package com.example.segundaprova.fragments.home.detalhes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.segundaprova.dominio.PersonagemFilme
import com.example.segundaprova.repository.PersonagemFilmeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
class DetalhesViewModel @Inject constructor(
    private val repository: PersonagemFilmeRepository
) : ViewModel() {

    val personagemFilme = MutableLiveData<PersonagemFilme?>()

    fun carregarPersonagemFilme(id: Long) {
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                personagemFilme.postValue(repository.findById(id))

            }
        }

    }

}