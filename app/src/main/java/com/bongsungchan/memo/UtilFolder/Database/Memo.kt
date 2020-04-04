package com.bongsungchan.memo.UtilFolder.Database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "memo")
data class Memo(@PrimaryKey(autoGenerate = true) var id : Long = 0 , val message : String?, val date : String?, val secret : Boolean?)
