package com.bongsungchan.memo.UtilFolder.Database

import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.bongsungchan.memo.UtilFolder.CustomTypeConverter
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class UserKycItem(
    @SerializedName("deposit") @Expose
    val deposit : Boolean,
    @SerializedName("witdrawle") @Expose
    val witdrawle : Boolean,

    @TypeConverters(CustomTypeConverter::class)
    @SerializedName("is_account") @Expose
    val isAccount : List<UserKycArrayItem> = emptyList()
)

data class UserKycArrayItem(
    @SerializedName("allowed") @Expose val allowed : Boolean,
    @SerializedName("reason") @Expose val reason : String
)