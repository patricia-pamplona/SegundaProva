package com.example.segundaprova.di

import android.app.Application
import com.example.segundaprova.dao.PersonagemFilmeDao
import com.example.segundaprova.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun getDatabase(applicationContext: Application):AppDatabase{
        return AppDatabase.invoke(applicationContext)
    }

    @Singleton
    @Provides
    fun getDao(database: AppDatabase):PersonagemFilmeDao{
        return database.personagemFilmeDao()
    }
}