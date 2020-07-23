package com.example.myfirebase

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.itemview.view.*

class ViewHolderProduct(itemView: View) : RecyclerView.ViewHolder(itemView){

    fun bindproductData(m1: ModelProduct?) {
        with(m1!!) {
            itemView.txtpr.text = Name
            itemView.txtpr1.text = Mrp
            itemView.txtpr2.text = Mfg
            itemView.txtpr3.text = Exp
            itemView.txtpr4.text = Taxes
        }
    }
}