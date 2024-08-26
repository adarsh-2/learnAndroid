package com.example.texttospeech

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.Button
import android.widget.EditText
import java.util.Locale

class MainActivity : AppCompatActivity() {
    lateinit var btnGenerateSpeech : Button
    lateinit var etText : EditText
    lateinit var t1 : TextToSpeech

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        t1 = TextToSpeech(this, TextToSpeech.OnInitListener {
            status -> if(status != TextToSpeech.ERROR){
                t1.language = Locale.ENGLISH
            }
        })

        btnGenerateSpeech = findViewById(R.id.btnGenerateSpeech)
        etText = findViewById(R.id.etText)

        btnGenerateSpeech.setOnClickListener {
            val text = etText.text.toString()
            t1.speak(text, TextToSpeech.QUEUE_FLUSH, null, null)
        }

    }
}