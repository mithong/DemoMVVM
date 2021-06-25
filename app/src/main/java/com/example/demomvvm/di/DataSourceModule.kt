package com.example.demomvvm.data.di

import com.example.demomvvm.data.repository.source.UnsplashDataSource
import com.example.demomvvm.data.repository.source.remote.UnsplashRemoteImpl
import org.koin.dsl.module

val dataSourceModule = module {

    single<UnsplashDataSource.Remote> {
        UnsplashRemoteImpl(get())
    }
}
