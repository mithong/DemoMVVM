package com.example.demomvvm.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    @SerializedName("name")
    val name: String?,
    @SerializedName("profile_image")
    val profile_image: ProfileImage?
) : Parcelable
