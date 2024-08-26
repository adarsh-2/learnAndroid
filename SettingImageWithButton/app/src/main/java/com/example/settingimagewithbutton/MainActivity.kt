package com.example.settingimagewithbutton

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageView = findViewById<ImageView>(R.id.imgView)
        val btn = findViewById<Button>(R.id.btn)

        imageView.setImageResource(R.drawable.football)

//        btn.setOnClickListener{
//            imageView.setImageResource(R.drawable.football)
//        }
    }
}