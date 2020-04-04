package com.bongsungchan.memo.UtilFolder.ViewModelFolder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.layout_toolbar.*


abstract class BmActivity<T : ViewDataBinding, R : BmViewModel> : AppCompatActivity() {

    lateinit var viewDataBinding: T
    abstract val resId : Int
    abstract val  viewModel : R

    abstract fun viewStart()

    var dis = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding = DataBindingUtil.setContentView(this,resId)
        viewStart()
    }

    fun setupToolbar(backbtn : Boolean) {

        setSupportActionBar(toolbar)
        supportActionBar?.let {
            it.setDisplayShowCustomEnabled(true)
            it.setDisplayShowTitleEnabled(false)
            it.setDisplayHomeAsUpEnabled(backbtn)
        }
    }

    override fun onStop() {
        super.onStop()
        if(isFinishing) {
            dis.clear()
        }
    }
}
