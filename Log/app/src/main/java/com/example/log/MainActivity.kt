package com.example.log

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonInfo = findViewById<Button>(R.id.buttonInfo)
        val buttonWarn = findViewById<Button>(R.id.buttonWarn)
        val buttonError = findViewById<Button>(R.id.buttonError)
        val buttonVerbose = findViewById<Button>(R.id.buttonVerbose)
        val buttonDebug = findViewById<Button>(R.id.buttonDebug)

        buttonInfo.setOnClickListener {
            createLogInfo()
        }

        buttonWarn.setOnClickListener {
            createLogWarn()
        }

        buttonError.setOnClickListener {
            createLogError()
        }

        buttonDebug.setOnClickListener {
            createLogDebug()
        }

        buttonVerbose.setOnClickListener {
            createLogVerbose()
        }
    }

    fun createLogInfo(){
        Log.i("MYTAG", "My name is Adarsh Kumar Prasad Info")
    }

    fun createLogWarn(){
        Log.w("MYTAG", "My name is Adarsh Kumar Prasad Warn")
    }

    fun createLogError(){
        Log.e("MYTAG", "My name is Adarsh Kumar Prasad Error")
    }

    fun createLogDebug(){
        Log.d("MYTAG", "My name is Adarsh Kumar Prasad Debug")
    }

    fun createLogVerbose(){
        Log.v("MYTAG", "My name is Adarsh Kumar Prasad Verbose")
    }
}