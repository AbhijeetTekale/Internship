package com.example.myfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.database.ChangeEventListener
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.FirebaseDatabase

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val mReference1 = FirebaseDatabase.getInstance().getReference("Products")
        val rcycl1 = findViewById(R.id.rcycl1) as RecyclerView

        val layoutManager = LinearLayoutManager(this)
        layoutManager.reverseLayout = false
        rcycl1.setHasFixedSize(true)
        rcycl1.layoutManager = layoutManager

        val query = mReference1!!.limitToLast(20)

        var mAdapter1 = object : FirebaseRecyclerAdapter<ModelProduct, ViewHolderProduct>(
            ModelProduct::class.java, R.layout.itemview, ViewHolderProduct::class.java, query) {

            override fun populateViewHolder(viewHolder: ViewHolderProduct?, model: ModelProduct?, position: Int) {
                viewHolder!!.bindproductData(model)
            }
        }
        rcycl1.adapter = mAdapter1
    }
}
