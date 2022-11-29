package com.example.segundaprova.dominio

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PersonagemFilme( var nome:String, var genero:String, var caracteristicasFisicas:String, var filme:String,var ano:Int  ) {
    @PrimaryKey(autoGenerate = true)
    var id:Long = 0

}