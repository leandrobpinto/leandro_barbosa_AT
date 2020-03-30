package com.example.leandro_barbosa_at.model

import androidx.lifecycle.MutableLiveData
import java.io.Serializable

class Faze : Serializable {
    var fazeEscolha = 0
    var fazeEscolhaVolta = 0
    var barraVida =  MutableLiveData<Int>().apply { value = 50 }

    var vida = 50

    fun vida(dano: Int){
        vida -= dano

        barraVida.value = vida
    }

    fun adicionaVida(){
        vida += 20

        barraVida.value = vida
    }
}