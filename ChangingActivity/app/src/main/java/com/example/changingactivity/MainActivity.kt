package com.example.changingactivity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.RecognizerIntent
import android.view.WindowInsets.Side
import android.widget.Button
import java.util.Locale

class MainActivity : AppCompatActivity() {
    val REQUEST_RECORD_AUDIO_PERMISSION = 174

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnChange = findViewById<Button>(R.id.btn)

        btnChange.setOnClickListener{
            startVoiceRecognition()
        }
    }

    private fun startVoiceRecognition() {
        val intent = Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH)
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM)
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault())
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Listening")
        startActivityForResult(intent, REQUEST_RECORD_AUDIO_PERMISSION)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQUEST_RECORD_AUDIO_PERMISSION && resultCode == Activity.RESULT_OK){
            val result = data?.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS)
            val command : String = result?.get(0).toString()

            if(command.contains("go to side activity", ignoreCase = true)){
                intent = Intent(this, SideActivity::class.java)
                startActivity(intent)
            }
        }
    }
}