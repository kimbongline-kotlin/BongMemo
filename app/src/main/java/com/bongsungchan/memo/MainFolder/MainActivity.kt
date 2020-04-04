package com.bongsungchan.memo.MainFolder

import android.util.Log
import android.widget.LinearLayout
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bongsungchan.memo.MainFolder.Adapter.MemoAdapter
import com.bongsungchan.memo.MainFolder.ViewModel.MainViewModel
import com.bongsungchan.memo.R
import com.bongsungchan.memo.UtilFolder.Database.Memo
import com.bongsungchan.memo.UtilFolder.ViewModelFolder.BmActivity
import com.bongsungchan.memo.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BmActivity<ActivityMainBinding, MainViewModel>() {

    override val resId: Int
        get() = R.layout.activity_main
    override val viewModel: MainViewModel by viewModel()
    val memoAdapter : MemoAdapter by inject()

    override fun viewStart() {

        recycler.run {
            adapter = memoAdapter
            layoutManager = LinearLayoutManager(applicationContext,RecyclerView.VERTICAL,false)
        }

        viewModel.getMessage.observe(this, Observer {

            it.forEach {
                memoAdapter.addItem(it)
            }
            memoAdapter.notifyDataSetChanged()

        })





    }


}
