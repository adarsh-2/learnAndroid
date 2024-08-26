package com.example.someapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class TechStacks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tech_stacks)

        val webDevButton = findViewById<CardView>(R.id.cardWebDev)
        webDevButton.setOnClickListener{
//            intent = Intent(this, )
        }
    }
}