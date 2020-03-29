package com.example.leandro_barbosa_at.viewModel

import androidx.lifecycle.ViewModel
import com.example.leandro_barbosa_at.model.Faze
import java.io.Serializable

class FazeViewModel : ViewModel(), Serializable {
    var faze : Faze = Faze()
}