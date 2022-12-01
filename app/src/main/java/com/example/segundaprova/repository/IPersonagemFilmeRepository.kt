package com.example.segundaprova.repository

import com.example.segundaprova.dominio.PersonagemFilme
import kotlinx.coroutines.flow.Flow

interface IPersonagemFilmeRepository {
    fun listAll(): Flow<List<PersonagemFilme>>
    fun create(r:PersonagemFilme)
    fun update(r:PersonagemFilme)
}