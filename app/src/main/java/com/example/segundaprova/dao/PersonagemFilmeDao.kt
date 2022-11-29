package com.example.segundaprova.dao

import androidx.room.*
import com.example.segundaprova.dominio.PersonagemFilme
import kotlinx.coroutines.flow.Flow
@Dao
interface PersonagemFilmeDao {
    @Query("SELECT * FROM personagemfilme")
    fun listAll(): Flow<List<PersonagemFilme>>
    @Query("SELECT * FROM personagemfilme where id=:id")
    fun findById(id:Long):PersonagemFilme?
    @Delete
    fun delete(r:PersonagemFilme)
    @Query("DELETE FROM personagemfilme where id=:id")
    fun deleteById(id:Long)
    @Query("DELETE FROM personagemfilme")
    fun deleteAll()
    @Update
    fun update(r:PersonagemFilme)
    @Insert
    fun create(r:PersonagemFilme)
}