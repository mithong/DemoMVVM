package com.example.demomvvm.data.repository.source.remote.api.response

import com.google.gson.annotations.SerializedName

class BaseResponse<T> (
    @SerializedName("results")
    val results: T
)
