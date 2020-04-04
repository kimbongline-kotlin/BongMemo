package com.bongsungchan.memo.UtilFolder.ViewModelFolder

import androidx.lifecycle.ViewModel
import com.bongsungchan.memo.UtilFolder.RepositoryFolder.Repository
import com.bongsungchan.memo.UtilFolder.RepositoryFolder.RepositoryImpl

open class BmViewModel : ViewModel() {

    val repository: Repository = RepositoryImpl()

}