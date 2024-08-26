package com.example.listview2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var champions: ArrayList<Country>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf(
            "Brazil",
            "Germany",
            "Italy",
            "Argentina",
            "France",
            "Uruguay",
            "England",
            "Spain"
        )
        val num = arrayOf(5, 4, 4, 3, 2, 2, 1, 1)
        val imageId = intArrayOf(
            R.drawable.brazil,
            R.drawable.germany,
            R.drawable.italy,
            R.drawable.argentina,
            R.drawable.france,
            R.drawable.uruguay,
            R.drawable.england,
            R.drawable.spain
        )

        champions = ArrayList()

        for(index in name.indices){
            val country = Country(name[index], num[index], imageId[index])

            champions.add(country)
        }

        val listView = findViewById<ListView>(R.id.list_view)
        listView.isClickable = true
        listView.adapter = MyAdapter(this, champions)
    }
}