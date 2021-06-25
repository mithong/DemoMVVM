package com.example.demomvvm.data.repository.source

import androidx.lifecycle.LiveData
import com.example.demomvvm.data.model.Unsplash
import com.example.demomvvm.data.repository.source.remote.api.response.BaseResponse

interface UnsplashDataSource {

    interface Remote {
        suspend fun getUnsplash(): BaseResponse<MutableList<Unsplash>>
    }
}
