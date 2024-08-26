package com.example.dailystandup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cb1 = findViewById<CheckBox>(R.id.checkBox1)
        val cb2 = findViewById<CheckBox>(R.id.checkBox2)
        val cb3 = findViewById<CheckBox>(R.id.checkBox3)
        val cb4 = findViewById<CheckBox>(R.id.checkBox4)
        val cb5 = findViewById<CheckBox>(R.id.checkBox5)
        val cb6 = findViewById<CheckBox>(R.id.checkBox6)
        val cb7 = findViewById<CheckBox>(R.id.checkBox7)
        val cb8 = findViewById<CheckBox>(R.id.checkBox8)
        val cb9 = findViewById<CheckBox>(R.id.checkBox9)
        val cb10 = findViewById<CheckBox>(R.id.checkBox10)
        val cb11 = findViewById<CheckBox>(R.id.checkBox11)

        val btn = findViewById<Button>(R.id.btnClear)

        btn.setOnClickListener {
            cb1.isChecked = false
            cb2.isChecked = false
            cb3.isChecked = false
            cb4.isChecked = false
            cb5.isChecked = false
            cb6.isChecked = false
            cb7.isChecked = false
            cb8.isChecked = false
            cb9.isChecked = false
            cb10.isChecked = false
            cb11.isChecked = false
        }
    }
}