package com.example.demomvvm.screen.detailUnsplash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.demomvvm.data.model.Unsplash

class DetailViewModel : ViewModel() {

    private val _unsplash = MutableLiveData<Unsplash>()
    val unsplash: LiveData<Unsplash>
        get() = _unsplash

    fun setUnsplash(data: Unsplash?) {
        data?.let { _unsplash.value = it }
    }
}
