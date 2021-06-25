package com.example.demomvvm.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Unsplash (
    @SerializedName("id")
    val id: String?,
    @SerializedName("alt_description")
    val alt_description: String?,
    @SerializedName("urls")
    val urls: Urls?,
    @SerializedName("user")
    val user: User?
) : Parcelable
