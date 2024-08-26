package com.example.someapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonHome = findViewById<Button>(R.id.btnHome)
        buttonHome.setOnClickListener{
            intent = Intent(this, TechStacks::class.java)
            startActivity(intent)
        }
    }
}