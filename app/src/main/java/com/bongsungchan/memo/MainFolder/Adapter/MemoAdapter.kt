package com.bongsungchan.memo.MainFolder.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bongsungchan.memo.R
import com.bongsungchan.memo.UtilFolder.Database.Memo


class MemoAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    class ItemHolder(parent : ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.layout_memo_list,parent,false)
    ) {
        fun onBind(item : Memo) {

            itemView.run {


            }

        }
    }

    private val getData = ArrayList<Memo>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ItemHolder(parent)
    override fun getItemCount() = getData.size
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as? ItemHolder)?.onBind(getData[position])
    }
    fun addItem(item : Memo) {
        getData.add(item)
        //  getData.add()
    }

    fun clear() {
        getData.clear()
        notifyDataSetChanged()
    }
}