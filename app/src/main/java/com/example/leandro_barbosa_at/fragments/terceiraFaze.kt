package com.example.leandro_barbosa_at.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.leandro_barbosa_at.R

/**
 * A simple [Fragment] subclass.
 */
class terceiraFaze : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_terceira_faze, container, false)
    }

}
