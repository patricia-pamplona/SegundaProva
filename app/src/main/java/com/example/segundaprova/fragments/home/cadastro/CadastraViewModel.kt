package com.example.segundaprova.fragments.home.cadastro

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
class CadastraViewModel @Inject constructor(private var repository: PersonagemFilmeRepository) : ViewModel() {
    var personagemFilme = MutableLiveData<PersonagemFilme>()

    init {
        personagemFilme.value = PersonagemFilme("","","","",0)
    }

    fun cadastrarButtonEvent(){
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                personagemFilme.value?.let { repository.create(it) }
            }
        }
    }
}