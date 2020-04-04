package com.bongsungchan.memo.UtilFolder.RepositoryFolder

import androidx.lifecycle.LiveData
import com.bongsungchan.memo.UtilFolder.Database.Memo
import com.bongsungchan.memo.UtilFolder.Database.MemoDao
import com.bongsungchan.memo.UtilFolder.db

class RepositoryImpl : Repository {
    private val memoDao : MemoDao = db.memoDao()
    override fun getMemo(): LiveData<List<Memo>> {
        return memoDao.getMemo()
    }

    override fun writeMemo(memo: Memo) {
        memoDao.insert(memo = memo)

    }

    override fun clearMemo() {
    }

    override fun updateMemo(id: Long, message: String, date: String) {
    }

    override fun deleteMemo(id: Long) {
    }


}
