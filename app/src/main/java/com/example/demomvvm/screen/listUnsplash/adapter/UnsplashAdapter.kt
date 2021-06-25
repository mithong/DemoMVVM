package com.example.demomvvm.screen.listUnsplash.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.demomvvm.R
import com.example.demomvvm.data.model.Unsplash
import com.example.demomvvm.databinding.ItemUnsplashBinding

class UnsplashAdapter(
    private var onClickListener: (Unsplash) -> Unit
) : ListAdapter<Unsplash, UnsplashAdapter.ViewHolder>(UnsplashDiffUtil()) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding =
            DataBindingUtil.inflate<ItemUnsplashBinding>(
                LayoutInflater.from(parent.context),
                R.layout.item_unsplash,
                parent,
                false)
        return ViewHolder(binding, onClickListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(getItem(position))

    class ViewHolder(
        private val binding: ItemUnsplashBinding,
        private val onItemClicked: (Unsplash) -> Unit
    ) : RecyclerView.ViewHolder(binding.root) {

        init {
            binding.unsplashViewModel = ItemUnsplashViewModel()
        }

        fun bind(unsplash: Unsplash) {
            binding.apply {
                unsplashViewModel?.unsplash = unsplash
                executePendingBindings()
                imageUnsplash.setOnClickListener {
                    onItemClicked(unsplash)
                }
            }
        }
    }
}
