package com.example.demomvvm.screen.listUnsplash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.demomvvm.data.repository.UnsplashRepository
import com.example.demomvvm.data.model.Unsplash
import com.example.demomvvm.utils.DataResult
import kotlinx.coroutines.launch

class UnsplashViewModel(private val repository: UnsplashRepository) : ViewModel(){

    private val _unsplash = MutableLiveData<MutableList<Unsplash>>()
    val unsplash: LiveData<MutableList<Unsplash>> get() = _unsplash
    
    private val _exception = MutableLiveData<Exception>()
    val exception: MutableLiveData<Exception> get() = _exception

    init {
        getUnsplash()
    }

    private fun getUnsplash() {
        viewModelScope.launch {
            when (val response = repository.getUnsplash()) {
                is DataResult.Success -> _unsplash.value = response.data
                is DataResult.Error -> _exception.value = response.exception
            }
        }
    }
}
