package com.bongsungchan.memo.UtilFolder.Database

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.bongsungchan.memo.UtilFolder.CustomTypeConverter
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "memo") @TypeConverters(CustomTypeConverter::class)
data class Memo(@PrimaryKey(autoGenerate = true) var id : Long = 0,
                @SerializedName("name") @Expose
                val name : String,
                @SerializedName("username") @Expose
                val username : String,
                @SerializedName("age") @Expose
                val age : String?,


                @SerializedName("kyc") @Expose
                val kyc : UserKycItem? = null
                )