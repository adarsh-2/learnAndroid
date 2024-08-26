package com.example.recyclerview

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(val context: Activity, val arrayList: ArrayList<News>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private lateinit var myListener: onItemClickListener

    interface onItemClickListener {
        fun onItemClick(position: Int)
    }

    fun setItemClickListener(listener: onItemClickListener) {
        myListener = listener
    }

    // If layout manager fails to load view it will come to this method for help, to create view
    // to create new view instance
    // when layout manager fails to find suitable view for each item
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.each_item, parent, false)
        return MyViewHolder(itemView)
    }

    // populate items with data
    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
        var currentItem = arrayList[position]
        holder.hImage.setImageResource(currentItem.newsImage)
        holder.hTitle.text = currentItem.newsHeading
    }

    // how many list items are present in your array
    override fun getItemCount(): Int {
        return arrayList.size
    }

    // it holds the view so views are not created everytime, so memory can be saved
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val hTitle = itemView.findViewById<TextView>(R.id.tvHeading)
        val hImage = itemView.findViewById<ShapeableImageView>(R.id.newsImage)
    }

}

// Video 29 33 Minutes