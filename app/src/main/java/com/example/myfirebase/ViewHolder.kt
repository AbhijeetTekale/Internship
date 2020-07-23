package com.example.myfirebase


import android.content.Intent
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*


class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bindData(m: Model?) {
        with(m!!) {
            itemView.txtList.text = Name
            itemView.txtList1.text = Email
        }
    }
    init {
        itemView.setOnClickListener { v: View ->
            val i = Intent(v.context,ProductActivity::class.java)
            itemView.context.startActivity(i)
        }
    }


}
