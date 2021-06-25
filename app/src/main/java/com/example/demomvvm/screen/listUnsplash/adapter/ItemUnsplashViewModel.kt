package com.example.demomvvm.screen.listUnsplash.adapter

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.demomvvm.data.model.Unsplash

class ItemUnsplashViewModel() : BaseObservable() {

    @Bindable
    var unsplash: Unsplash? = null
        set(value) {
            field = value
        }
}
