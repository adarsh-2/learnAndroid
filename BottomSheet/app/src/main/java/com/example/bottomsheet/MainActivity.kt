package com.example.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bottomSheet = setContentView(R.layout.bottom_sheet_layout)

        var btn : Button = findViewById(R.id.btnBottomSheet)

        btn.setOnClickListener {

        }
    }
}