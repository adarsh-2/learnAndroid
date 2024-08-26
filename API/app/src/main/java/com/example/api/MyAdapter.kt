package com.example.api

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.squareup.picasso.Picasso
import org.w3c.dom.Text

class MyAdapter(val context: Activity, val productArrayList: List<Product>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(context).inflate(R.layout.each_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return productArrayList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var currentItem = productArrayList[position]
        holder.itemTitle.text = currentItem.title
        holder.itemPrice.text = "$" + currentItem.price.toString()
        holder.itemRating.text = currentItem.rating.toString() + "/5"
        // how to show image in image view if the image is in the form of url : 3rd party library Picasso
        Picasso.get().load(currentItem.thumbnail).into(holder.itemImage);
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemTitle = itemView.findViewById<TextView>(R.id.tvItem)
        val itemPrice = itemView.findViewById<TextView>(R.id.tvPrice)
        val itemRating = itemView.findViewById<TextView>(R.id.tvRating)
        val itemImage = itemView.findViewById<ShapeableImageView>(R.id.image)
    }
}