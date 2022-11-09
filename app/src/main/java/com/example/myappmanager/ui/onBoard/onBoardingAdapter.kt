package com.example.myappmanager.ui.onBoard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myappmanager.R
import com.example.myappmanager.databinding.ItemBoardBinding

class onBoardingAdapter: RecyclerView.Adapter<onBoardingAdapter.onBoardingViewHolder>() {
val lotti = arrayListOf(R.raw.lotti1,R.raw.lotti2,R.raw.lotti2)
    var title = arrayListOf("hello,privet,salam")
    var description = arrayListOf("hello,privet,salam")
    inner class onBoardingViewHolder(private val binding: ItemBoardBinding):
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.title.text  =title[position]
            binding.description.text  =description[position]
            binding.lotti.setAnimation(lotti[position])
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): onBoardingViewHolder {
return onBoardingViewHolder(ItemBoardBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: onBoardingViewHolder, position: Int) {
holder.bind(position)    }

    override fun getItemCount() = 3
}

