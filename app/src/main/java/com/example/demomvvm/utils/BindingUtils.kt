package com.example.demomvvm.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.demomvvm.utils.ext.loadImage

object BindingUtils {

    @JvmStatic
    @BindingAdapter("app:imageUrl")
    fun setImageUrl(imageView: ImageView, url: String?) {
        url?.let {
            imageView.loadImage(it)
        }
    }

    @JvmStatic
    @BindingAdapter("app:setAdapter")
    fun RecyclerView.setAdapter(adapter: RecyclerView.Adapter<*>) {
        this.adapter = adapter
    }
}
