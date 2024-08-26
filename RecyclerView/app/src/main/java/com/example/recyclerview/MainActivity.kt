package com.example.recyclerview

import android.icu.lang.UCharacter.VerticalOrientation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView: RecyclerView
    lateinit var newsArrayList: ArrayList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        myRecyclerView = findViewById(R.id.recyclerView)

        var imageArray = intArrayOf(
            R.drawable.ai,
            R.drawable.euro,
            R.drawable.copa_america,
            R.drawable.lewandowski,
            R.drawable.wimbeldon,
            R.drawable.t_twenty_world_cup,
            R.drawable.messi
        )

        var heading = arrayOf(
            "Figma disables AI design feature after it copied Apple’s Weather UI multiple times",
            "EURO enters quarter final stage, starts on July 5",
            "Brazil V Uruguay in Copa America Quarter Final",
            "Robert Lewandowski missed Poland EURO opener because of injury",
            "Novak Djokovic is playing in Round of 64 at Wimbeldon 2024",
            "India wins T20 World Cup after 17 years",
            "Messi missed a penalty in Copa America QF Penalty Shootout"
        )

        // to set behaviour of items inside recycler view, vertically scrolling, horizontally, uniform grid
        myRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        newsArrayList = arrayListOf()

        for(index in imageArray.indices){
            val news = News(heading[index], imageArray[index])
            newsArrayList.add(news)
        }

        myRecyclerView.adapter = MyAdapter(this, newsArrayList)
    }
}

