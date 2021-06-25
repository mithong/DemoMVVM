package com.example.demomvvm.di

import com.example.demomvvm.screen.detailUnsplash.DetailViewModel
import com.example.demomvvm.screen.listUnsplash.UnsplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel { DetailViewModel() }

    viewModel { UnsplashViewModel(get()) }
}
