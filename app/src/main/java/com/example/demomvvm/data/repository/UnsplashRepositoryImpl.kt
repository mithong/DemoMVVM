package com.example.demomvvm.data.repository

import com.example.demomvvm.data.model.Unsplash
import com.example.demomvvm.data.repository.source.UnsplashDataSource
import com.example.demomvvm.utils.DataResult
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UnsplashRepositoryImpl(
    private val remote: UnsplashDataSource.Remote
) : UnsplashRepository {

    override suspend fun getUnsplash() = withContext(Dispatchers.Default) {
            var unsplashList: MutableList<Unsplash>
            try {
                remote.getUnsplash().also { unsplashList = it.results }
                return@withContext DataResult.Success(unsplashList)
            } catch (ex: Exception) {
                return@withContext DataResult.Error(ex)
            }
        }
}
