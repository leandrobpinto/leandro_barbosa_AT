package com.example.leandro_barbosa_at.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.leandro_barbosa_at.model.Faze
import java.io.Serializable

class HomeViewModel : ViewModel(), Serializable {
    var faze : Faze = Faze()

}
