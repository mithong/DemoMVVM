package com.example.demomvvm.data.repository.source.remote

import com.example.demomvvm.data.repository.source.UnsplashDataSource
import com.example.demomvvm.data.repository.source.remote.api.ApiService
import com.example.demomvvm.utils.Constant

class UnsplashRemoteImpl(private val apiService: ApiService) : UnsplashDataSource.Remote {

    override suspend fun getUnsplash() = apiService.getPhoto()
}
