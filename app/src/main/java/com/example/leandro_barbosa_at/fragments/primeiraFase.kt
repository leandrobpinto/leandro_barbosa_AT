package com.example.leandro_barbosa_at.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController

import com.example.leandro_barbosa_at.R
import com.example.leandro_barbosa_at.viewModel.FazeViewModel
import kotlinx.android.synthetic.main.fragment_primeira_fase.*

/**
 * A simple [Fragment] subclass.
 */
class primeiraFase : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_primeira_fase, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lateinit var fazeViewModel: FazeViewModel
        activity?.let {
            fazeViewModel = ViewModelProviders.of(it).get(FazeViewModel::class.java)

            fazeViewModel.faze.barraVida.apply { value = 50 }
        }

        btnAvançar.setOnClickListener {
            if (!RbEscolha1.isChecked && !RbEscolha2.isChecked ) {
                Toast.makeText(
                    activity!!.baseContext!!,
                    "Marque todas opções",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                if (RbEscolha1.isChecked){

                    fazeViewModel.faze!!.fazeEscolha = 1
                    findNavController().navigate(R.id.segundaFaze)
                }else{

                    fazeViewModel.faze!!.fazeEscolha = 2
                    findNavController().navigate(R.id.segundaFaze)
                    fazeViewModel.faze.vida(25)
                }
            }
        }
    }

}
