package com.bongsungchan.memo.UtilFolder.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
@Dao
interface MemoDao  {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(memo : Memo)

    @Query("select * from memo")
    fun getMemo() : LiveData<List<Memo>>

    @Query("delete from memo")
    fun allDeleteMemo()

    @Query("delete from memo where id = :id")
    fun deleteById(id : Long)

    @Query("update memo set message =:message, date =:date where id = :id")
    fun updateMemo(id : Long, message : String, date : String)

}