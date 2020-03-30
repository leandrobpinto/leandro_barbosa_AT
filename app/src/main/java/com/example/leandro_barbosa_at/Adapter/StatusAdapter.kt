package com.example.leandro_barbosa_at.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.leandro_barbosa_at.R
import com.example.leandro_barbosa_at.model.Status
import kotlinx.android.synthetic.main.status_recycle.view.*


class StatusAdapter (
    val status : List<Status>


)
    :RecyclerView.Adapter<StatusAdapter.StatusViewHolder>() {
     class StatusViewHolder (view: View)
         : RecyclerView.ViewHolder(view){
         val txtViewStatus = view.textViewStatus
         val textViewValorStatus = view.textViewValorStatus

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            : StatusViewHolder {
        val view = LayoutInflater
            .from(parent.context)
            .inflate(
                R.layout.status_recycle,
                parent,
                false
            )
        val statusViewHolder =
            StatusViewHolder(
                view
            )
        statusViewHolder.itemView.setOnClickListener{
            val status = status[statusViewHolder.adapterPosition]

        }

        return statusViewHolder
    }

    override fun getItemCount(): Int = status.size


    override fun onBindViewHolder(holder: StatusViewHolder, position: Int) {
         val status = status[position]
        holder.txtViewStatus.text = status.Status
        holder.textViewValorStatus.text = status.valorStatus
    }
}