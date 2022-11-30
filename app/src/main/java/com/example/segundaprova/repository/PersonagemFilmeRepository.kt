package com.example.segundaprova.repository

import com.example.segundaprova.dao.PersonagemFilmeDao
import com.example.segundaprova.dominio.PersonagemFilme
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class PersonagemFilmeRepository @Inject constructor(private var dao: PersonagemFilmeDao) : IPersonagemFilmeRepository {
    override fun listAll(): Flow<List<PersonagemFilme>> {
        return dao.listAll()
    }

    override fun create(r: PersonagemFilme) {
        dao.create(r)
    }

}
