package com.example.oopdemo

import android.util.Log

class MyCar : Car(), SpeedController {
    override fun start(){
        Log.i("MYTAG", "This is start function of MyCar class. Brand id is ${getBrandId()}")
    }

    override fun accelerate() {
    }

    override fun decelerate() {
    }
}