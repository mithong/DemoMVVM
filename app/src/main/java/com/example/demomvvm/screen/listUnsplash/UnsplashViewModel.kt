package com.example.demomvvm.screen.listUnsplash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.demomvvm.data.UnsplashRepository
import com.example.demomvvm.data.model.Unsplash
import com.example.demomvvm.utils.base.BaseViewModel

class UnsplashViewMode(private val repository: UnsplashRepository) : BaseViewModel(){
    private val _unsplash = MutableLiveData<MutableList<Unsplash>>()
    val unsplash: LiveData<MutableList<Unsplash>> get() = _unsplash

    init {
        getUnsplash()
    }

    private fun getUnsplash(){
        launchTaskSync(
            onRequest = {repository.getUnsplash()},
            onSuccess = {
                _unsplash.value = it
            },
            onError = {
                exception.value = it
            })
    }
}
