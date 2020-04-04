package com.bongsungchan.memo.UtilFolder.RepositoryFolder

import androidx.lifecycle.LiveData
import com.bongsungchan.memo.UtilFolder.Database.Memo

interface Repository {
    fun getMemo() : LiveData<List<Memo>>

    fun writeMemo(memo : Memo)

    fun clearMemo()

    fun updateMemo(id : Long, message : String, date : String)

    fun deleteMemo(id : Long)
}