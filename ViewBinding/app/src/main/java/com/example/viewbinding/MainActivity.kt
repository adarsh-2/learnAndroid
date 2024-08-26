package com.example.viewbinding

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if(binding.checkBox.isChecked){
                Toast.makeText(this, "CheckBox is checked", Toast.LENGTH_SHORT).show()
            }else{
                binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.RED)
                binding.checkBox.setTextColor(getResources().getColor(R.color.red))
                Toast.makeText(this, "Please accept TNC", Toast.LENGTH_SHORT).show()
            }


        }
    }
}