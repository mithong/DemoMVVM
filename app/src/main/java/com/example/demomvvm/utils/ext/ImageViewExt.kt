package com.example.demomvvm.utils.ext

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.example.demomvvm.R

fun ImageView.loadImage(url: String) {
    Glide.with(this)
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade())
        .placeholder(R.drawable.ic_launcher_foreground)
        .into(this)
}
