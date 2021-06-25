package com.example.demomvvm.data.di

import com.example.demomvvm.data.repository.source.remote.api.ApiService
import com.example.demomvvm.data.repository.source.remote.api.InterceptorImpl
import com.example.demomvvm.data.repository.source.remote.api.ServiceGenerator
import com.example.demomvvm.utils.Constant
import okhttp3.Interceptor
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module

private fun buildHttpLog() = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

val networkModule = module {

    single<Interceptor> {
        InterceptorImpl(get())
    }

    single {
        ServiceGenerator.generate(
            baseUrl = Constant.BASE_URL,
            serviceClass = ApiService::class.java ,
            interceptors = listOf(buildHttpLog(), get())
        )
    }
}
