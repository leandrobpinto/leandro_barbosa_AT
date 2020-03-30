package com.example.leandro_barbosa_at.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.leandro_barbosa_at.R
import com.example.leandro_barbosa_at.Adapter.StatusAdapter
import com.example.leandro_barbosa_at.model.Status
import kotlinx.android.synthetic.main.fragment_gallery.*

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)


        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var status = mutableListOf(
            Status("Força", "10"),
            Status("Destreza", "20"),
            Status("Inteligencia", "15")


        )
        var statusAdapter = StatusAdapter(status)
        rcyStatus.adapter = statusAdapter
        rcyStatus.layoutManager = LinearLayoutManager(context)

    }


}
