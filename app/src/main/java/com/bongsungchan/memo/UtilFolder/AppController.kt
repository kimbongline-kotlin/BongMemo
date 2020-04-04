package com.bongsungchan.memo.UtilFolder

import android.app.Application
import com.bongsungchan.memo.UtilFolder.Database.MemoDatabase
import com.bongsungchan.memo.UtilFolder.KoinFolder.koinModule
import org.koin.android.ext.android.startKoin

lateinit var db : MemoDatabase
class AppController : Application() {
    override fun onCreate() {
        super.onCreate()
        db = MemoDatabase.getInstance(this)
        startKoin(applicationContext, koinModule)
    }
}