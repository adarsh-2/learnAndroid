package com.example.audio

import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.io.IOException

class MainActivity : AppCompatActivity() {

    private lateinit var btnPlay : Button
    private lateinit var btnPause : Button
    var mediaPlayer : MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlay = findViewById(R.id.btnPlay)
        btnPause = findViewById(R.id.btnPause)

        btnPlay.setOnClickListener{
            playAudio()
        }

        btnPause.setOnClickListener {
            pauseAudio()
        }
    }

    private fun playAudio() {

        mediaPlayer = MediaPlayer.create(this, R.raw.short_beep_tone)
        mediaPlayer!!.start()

        Toast.makeText(this, "Audio started playing", Toast.LENGTH_SHORT).show()
    }

    private fun pauseAudio() {
        if (mediaPlayer!!.isPlaying){
            mediaPlayer!!.stop()
            mediaPlayer!!.reset()
            mediaPlayer!!.release()
        }else{
            Toast.makeText(this, "Audio has not played", Toast.LENGTH_SHORT).show()
        }
    }
}