package com.example.mvvm_pratice

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mvvm_pratice.Model.DataEntity
import com.example.mvvm_pratice.databinding.ItemBinding

class Adapter(val arr : ArrayList<DataEntity>) : RecyclerView.Adapter<Adapter.ViewHolder>() {


    class ViewHolder(private val binding: ItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(dataEntity: DataEntity){
            binding.number.text = dataEntity.number.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        val view = ItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        holder.bind(arr[position])
    }

    override fun getItemCount(): Int {

        return arr.size
    }


}