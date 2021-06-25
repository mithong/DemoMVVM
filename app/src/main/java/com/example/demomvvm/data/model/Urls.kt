package com.example.demomvvm.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Urls(
    @SerializedName("full")
    val full: String?
) : Parcelable
