package com.example.demomvvm.di

import android.app.Application
import com.example.demomvvm.data.di.dataSourceModule
import com.example.demomvvm.data.di.networkModule
import com.example.demomvvm.data.di.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        val modules = listOf(
            viewModelModule,
            repositoryModule,
            dataSourceModule,
            networkModule
            )
        startKoin {
            androidLogger(org.koin.core.logger.Level.NONE)
            androidContext(this@MainApplication)
            modules(modules)
        }
    }
}
