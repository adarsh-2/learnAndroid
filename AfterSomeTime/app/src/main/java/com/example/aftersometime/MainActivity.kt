package com.example.aftersometime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.myButton)
        val display: TextView = findViewById(R.id.textView1)

        myButton.setOnClickListener {
            // Delayed message display after 5 seconds
            Handler(Looper.getMainLooper()).postDelayed({
                display.text = "Adarsh Kumar Prasad"
            }, 5000) // 5000 milliseconds = 5 seconds
        }
    }
}