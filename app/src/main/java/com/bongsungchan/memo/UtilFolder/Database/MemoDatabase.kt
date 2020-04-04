package com.bongsungchan.memo.UtilFolder.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Memo::class), version = 1, exportSchema = true)
abstract class MemoDatabase : RoomDatabase() {
    abstract fun memoDao() : MemoDao

    companion object {

        private var INSTANCE : MemoDatabase? = null

        fun getInstance(context: Context) : MemoDatabase {
            synchronized(MemoDatabase::class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context,MemoDatabase::class.java,"BoogMemo.db").fallbackToDestructiveMigration().allowMainThreadQueries().build()
                }
            }
            return INSTANCE!!
        }
    }
}