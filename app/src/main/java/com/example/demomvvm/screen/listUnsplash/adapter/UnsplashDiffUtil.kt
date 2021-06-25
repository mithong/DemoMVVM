package com.example.demomvvm.screen.listUnsplash.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.demomvvm.data.model.Unsplash

class UnsplashDiffUtil : DiffUtil.ItemCallback<Unsplash>() {

    override fun areItemsTheSame(oldItem: Unsplash, newItem: Unsplash) = oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Unsplash, newItem: Unsplash) = oldItem == newItem
}
