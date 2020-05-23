package com.bongsungchan.memo.MainFolder

import android.util.Log
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bongsungchan.memo.MainFolder.Adapter.MemoAdapter
import com.bongsungchan.memo.MainFolder.ViewModel.MainViewModel
import com.bongsungchan.memo.R
import com.bongsungchan.memo.UtilFolder.Database.Memo
import com.bongsungchan.memo.UtilFolder.ViewModelFolder.BmActivity
import com.bongsungchan.memo.databinding.ActivityMainBinding
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import org.json.JSONObject
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel



class MainActivity : BmActivity<ActivityMainBinding, MainViewModel>() {

    override val resId: Int
        get() = R.layout.activity_main
    override val viewModel: MainViewModel by viewModel()
    private val memoAdapter : MemoAdapter by inject()

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


        val json = JSONObject()
        val manJson = JSONObject()
        manJson.put("name", "emil")
        manJson.put("username", "emil111")
        manJson.put("age", "111")

        val testJson = JSONObject()
        testJson.put("deposit",false)
        testJson.put("witdrawle",true)

        val kycArray = JSONArray()

        val kycArrayObject = JSONObject()
        kycArrayObject.put("allowed" ,false)
        kycArrayObject.put("reason","aaa")

        val kycArrayObjecta = JSONObject()
        kycArrayObjecta.put("allowed" ,false)
        kycArrayObjecta.put("reason","aaa")

        kycArray.put(kycArrayObject)
        kycArray.put(kycArrayObjecta)

        testJson.put("is_account",kycArray)

        manJson.put("kyc",testJson)
        json.put("user", manJson)

        val testGson = Gson().fromJson<Memo>(json.getJSONObject("user").toString(),Memo::class.java)
        Log.d("object","${testGson}")


    }


}
