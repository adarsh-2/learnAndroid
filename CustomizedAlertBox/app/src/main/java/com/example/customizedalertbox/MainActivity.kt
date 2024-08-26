package com.example.customizedalertbox

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources

class MainActivity : AppCompatActivity() {

    // create a variable to type dialog
    lateinit var dialog : Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myButton : Button = findViewById(R.id.btnClick)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.custom_dialogue)
        dialog.window?.setBackgroundDrawable(AppCompatResources.getDrawable(this, R.drawable.bg_alert_box))

        // creating variables for the custom_dialogue.xml design
        var buttonGood : Button = dialog.findViewById<Button>(R.id.btnGood)
        var buttonFeedback : Button = dialog.findViewById<Button>(R.id.btnFeedback)

        myButton.setOnClickListener {
            dialog.show()
        }

        buttonGood.setOnClickListener {
            dialog.dismiss()
        }

        buttonFeedback.setOnClickListener {
            Toast.makeText(this,"Feedback sent", Toast.LENGTH_SHORT).show()
        }
    }
}