package com.example.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainActivityViewModel
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        val countDisplay = findViewById<TextView>(R.id.tvCount)
        val countButton = findViewById<Button>(R.id.btnCount)

//        countDisplay.text = viewModel.count.toString()
        viewModel.count.observe(this, Observer {
            countDisplay.text = it.toString()
        })

        countButton.setOnClickListener{
//            count++
//            countDisplay.text = count.toString()
            viewModel.updateCount()
//            countDisplay.text = viewModel.count.toString()
        }
    }
}