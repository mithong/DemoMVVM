package com.example.demomvvm.data.repository.source.remote.api

import com.example.demomvvm.data.model.Unsplash
import com.example.demomvvm.data.repository.source.remote.api.response.BaseResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("search/photos?")
    suspend fun getPhoto(): BaseResponse<MutableList<Unsplash>>
}
