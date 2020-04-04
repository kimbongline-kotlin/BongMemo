package com.bongsungchan.memo.UtilFolder.KoinFolder

import com.bongsungchan.memo.MainFolder.Adapter.MemoAdapter
import com.bongsungchan.memo.MainFolder.ViewModel.MainViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

var mainViewModel = module {
    viewModel {
        MainViewModel()
    }
}

var memoAdapter = module {
    factory {
        MemoAdapter()
    }
}
var koinModule = listOf(
    mainViewModel,
    memoAdapter
)