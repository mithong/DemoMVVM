package com.example.demomvvm.data.repository.source.remote.api

import android.app.Application
import androidx.annotation.NonNull
import com.example.demomvvm.utils.Constant
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import java.io.IOException

class InterceptorImpl(private val application: Application): Interceptor {

    @Throws(IOException::class)
    override fun intercept(@NonNull chain: Interceptor.Chain) = chain.proceed(initializeHeader(chain).build())

    private fun initializeHeader(chain: Interceptor.Chain): Request.Builder {
        val originRequest = chain.request()
        val url = originRequest
            .url
            .newBuilder()
            .addQueryParameter(HEADER_AUTH_TOKEN, Constant.BASE_API_KEY)
            .addQueryParameter(QUERY, Constant.BASE_QUERY)
            .build()

        return originRequest.newBuilder()
            .url(url)
            .method(originRequest.method, originRequest.body)
    }
    companion object {
        private const val HEADER_AUTH_TOKEN = "client_id"
        private const val QUERY= "query"
    }
}
