package com.example.simplenavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)

        val btn = findViewById<Button>(R.id.button1)

        btn.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val fab : FloatingActionButton = findViewById(R.id.fab)

        fab.setOnClickListener{
            Toast.makeText(this,"Aaj Kuch Toofani Karte Hain", Toast.LENGTH_SHORT).show()
        }
    }
}