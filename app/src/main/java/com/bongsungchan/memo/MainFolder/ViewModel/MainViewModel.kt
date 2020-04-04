package com.bongsungchan.memo.MainFolder.ViewModel

import com.bongsungchan.memo.UtilFolder.Database.Memo
import com.bongsungchan.memo.UtilFolder.ViewModelFolder.BmViewModel

class MainViewModel : BmViewModel() {

    var getMessage = repository.getMemo()


    fun writeMemo(memo : Memo) {
        repository.writeMemo(memo)
    }
}