package com.example.listview2

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<Country>) :
    ArrayAdapter<Country>(context, R.layout.each_item, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.each_item, null)

        val image = view.findViewById<CircleImageView>(R.id.country_flag)
        val name = view.findViewById<TextView>(R.id.country_name)
        val num = view.findViewById<TextView>(R.id.num)

        name.text = arrayList[position].name
        num.text = arrayList[position].num.toString()
        image.setImageResource(arrayList[position].imageId)

        return view
    }

}