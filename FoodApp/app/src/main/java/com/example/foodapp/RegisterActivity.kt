package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var tvLogin = findViewById<TextView>(R.id.tvLogin)

        tvLogin.setOnClickListener{
            intent = Intent(this, LogInActivity::class.java)
            startActivity(intent)
        }
    }
}