package com.example.oopdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val car = Car()
        // car.maxSpeed = 150
        // car.start()

        // val driver = Driver("Adarsh", 45)
        // driver.showDetails()

        val myCar = MyCar()
        myCar.maxSpeed = 250
        myCar.start()
    }
}