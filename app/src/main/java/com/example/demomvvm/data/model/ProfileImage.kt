package com.example.demomvvm.data.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProfileImage(
    @SerializedName("small")
    val small: String?
) : Parcelable
