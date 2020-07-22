package com.example.myfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.firebase.ui.database.ChangeEventListener
import com.firebase.ui.database.FirebaseRecyclerAdapter
import com.google.firebase.database.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mReference = FirebaseDatabase.getInstance().getReference("Users")

        val rcycl = findViewById(R.id.rcycl) as RecyclerView

        val layoutManager = LinearLayoutManager(this)
        layoutManager.reverseLayout = false
        rcycl.setHasFixedSize(true)
        rcycl.layoutManager = layoutManager

        val query = mReference!!.limitToLast(8)

       var mAdapter = object : FirebaseRecyclerAdapter<Model, ViewHolder>(
            Model::class.java, R.layout.item_list, ViewHolder::class.java, query) {

            override fun populateViewHolder(viewHolder: ViewHolder?, model: Model?, position: Int) {
                viewHolder!!.bindData(model)
            }

            override fun onChildChanged(type: ChangeEventListener.EventType, snapshot: DataSnapshot?, index: Int, oldIndex: Int) {
                super.onChildChanged(type, snapshot, index, oldIndex)

                rcycl.scrollToPosition(index)
            }
        }
        rcycl.adapter = mAdapter



    }
}
