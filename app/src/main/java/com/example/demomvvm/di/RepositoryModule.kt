package com.example.demomvvm.data.di

import com.example.demomvvm.data.repository.UnsplashRepository
import com.example.demomvvm.data.repository.UnsplashRepositoryImpl
import org.koin.dsl.module

val repositoryModule = module {

    single<UnsplashRepository> {
        UnsplashRepositoryImpl(get())
    }
}
