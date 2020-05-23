package com.bongsungchan.memo.UtilFolder

import androidx.room.TypeConverter
import com.bongsungchan.memo.UtilFolder.Database.UserKycArrayItem
import com.bongsungchan.memo.UtilFolder.Database.UserKycItem
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type
import java.util.*


class CustomTypeConverter  {

    @TypeConverter
    fun stringToList(data: String?): List<UserKycArrayItem?>? {
        val gson = Gson()
        if (data == null) {
            return Collections.emptyList()
        }
        val listType: Type = object : TypeToken<List<UserKycArrayItem?>?>() {}.getType()
        return gson.fromJson(data, listType)
    }

    @TypeConverter
    fun listToString(myObjects: List<UserKycArrayItem?>?): String? {
        val gson = Gson()
        return gson.toJson(myObjects)
    }


    @TypeConverter
    fun orderInfoToString(orderInfo: UserKycItem?): String? =
        Gson().toJson(orderInfo)

    @TypeConverter
    fun stringToOrderInfo(value: String): UserKycItem? =
       Gson().fromJson(value,UserKycItem::class.java)

}