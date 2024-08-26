package com.example.alertdialogue

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialogue.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Alert!")
            builder1.setMessage("Do you want to exit?")
            builder1.setIcon(R.drawable.ic_exit)
            builder1.setPositiveButton("YES", DialogInterface.OnClickListener { dialog, which ->
                // What action should we perform when yes is clicked
                finish()
            })

            builder1.setNegativeButton("NO", DialogInterface.OnClickListener { dialog, which ->
                // What action should we perform when no is clicked
            })

            builder1.show()
        }

        binding.btn2.setOnClickListener {
            val options = arrayOf("ABC", "DEF", "GHI")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("This is Title")
            builder2.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->
                // what action should be performed when user clicks on any object
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder2.setPositiveButton("Done", DialogInterface.OnClickListener { dialog, which ->
                // What action should we perform when yes is clicked
            })

            builder2.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which ->
                // What action should we perform when no is clicked
            })

            builder2.show()
        }

        binding.btn3.setOnClickListener {
            val options = arrayOf("ABC", "DEF", "GHI", "JKL", "MNO")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Jay Shree Ram!")
            builder3.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                // what action should be performed when user clicks on any object
                Toast.makeText(this, "You clicked on ${options[which]}", Toast.LENGTH_SHORT).show()
            })

            builder3.setPositiveButton("Done", DialogInterface.OnClickListener { dialog, which ->
                // What action should we perform when yes is clicked
            })

            builder3.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, which ->
                // What action should we perform when no is clicked
            })

            builder3.show()
        }
    }
}