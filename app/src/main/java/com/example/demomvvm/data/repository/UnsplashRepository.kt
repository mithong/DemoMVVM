package com.example.demomvvm.data

import androidx.lifecycle.LiveData
import com.example.demomvvm.data.model.Unsplash
import com.example.demomvvm.utils.DataResult

interface UnsplashRepository {

    /**
     * Remote
     */
    suspend fun getUnsplash(): DataResult<MutableList<Unsplash>>
}
