package com.example.segundaprova.fragments.home


import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.segundaprova.repository.PersonagemFilmeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(private var repository: PersonagemFilmeRepository) : ViewModel() {
    var personagens = repository.listAll().asLiveData()
}
