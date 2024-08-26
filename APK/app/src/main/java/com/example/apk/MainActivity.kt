// to generate apk go to build > Build Bundles/APK > Build APK

package com.example.apk

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)

        btn1.setOnClickListener{
            Toast.makeText(this, "Uploading...", Toast.LENGTH_SHORT).show()
        }
        btn2.setOnClickListener{
            Toast.makeText(this, "Downloading...", Toast.LENGTH_SHORT).show()
        }
    }
}