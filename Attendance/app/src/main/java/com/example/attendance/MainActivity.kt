package com.example.attendance

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox

class MainActivity : AppCompatActivity() {

    lateinit var cb1 : CheckBox
    lateinit var cb2 : CheckBox
    lateinit var cb3 : CheckBox
    lateinit var cb4 : CheckBox
    lateinit var cb5 : CheckBox
    lateinit var cb6 : CheckBox
    lateinit var cb7 : CheckBox
    lateinit var cb8 : CheckBox
    lateinit var cb9 : CheckBox
    lateinit var cb10 : CheckBox
    lateinit var cb11 : CheckBox
    lateinit var cb12 : CheckBox
    lateinit var cb13 : CheckBox
    lateinit var cb14 : CheckBox
    lateinit var cb15 : CheckBox
    lateinit var cb16 : CheckBox
    lateinit var cb17 : CheckBox
    lateinit var cb18 : CheckBox
    lateinit var cb19 : CheckBox
    lateinit var cb20 : CheckBox
    lateinit var cb21 : CheckBox
    lateinit var cb22 : CheckBox
    lateinit var cb23 : CheckBox
    lateinit var cb24 : CheckBox
    lateinit var cb25 : CheckBox
    lateinit var cb26 : CheckBox
    lateinit var cb27 : CheckBox
    lateinit var cb28 : CheckBox
    lateinit var cb29 : CheckBox
    lateinit var cb30 : CheckBox
    lateinit var cb31 : CheckBox
    lateinit var cb32 : CheckBox
    lateinit var cb33 : CheckBox
    lateinit var cb34 : CheckBox
    lateinit var cb35 : CheckBox
    lateinit var cb36 : CheckBox
    lateinit var cb37 : CheckBox
    lateinit var cb38 : CheckBox
    lateinit var cb39 : CheckBox
    lateinit var cb40 : CheckBox
    lateinit var cb41 : CheckBox
    lateinit var cb42 : CheckBox
    lateinit var cb43 : CheckBox
    lateinit var cb44 : CheckBox
    lateinit var cb45 : CheckBox
    lateinit var cb46 : CheckBox
    lateinit var cb47 : CheckBox
    lateinit var cb48 : CheckBox
    lateinit var cb49 : CheckBox
    lateinit var cb50 : CheckBox
    lateinit var cb51 : CheckBox
    lateinit var cb52 : CheckBox
    lateinit var cb53 : CheckBox
    lateinit var cb54 : CheckBox
    lateinit var cb55 : CheckBox

    private lateinit var sf : SharedPreferences
    private lateinit var editor : SharedPreferences.Editor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         cb1 = findViewById<CheckBox>(R.id.cb1)
         cb2 = findViewById<CheckBox>(R.id.cb2)
         cb3 = findViewById<CheckBox>(R.id.cb3)
         cb4 = findViewById<CheckBox>(R.id.cb4)
         cb5 = findViewById<CheckBox>(R.id.cb5)
         cb6 = findViewById<CheckBox>(R.id.cb6)
         cb7 = findViewById<CheckBox>(R.id.cb7)
         cb8 = findViewById<CheckBox>(R.id.cb8)
         cb9 = findViewById<CheckBox>(R.id.cb9)
         cb10 = findViewById<CheckBox>(R.id.cb10)
         cb11 = findViewById<CheckBox>(R.id.cb11)
         cb12 = findViewById<CheckBox>(R.id.cb12)
         cb13 = findViewById<CheckBox>(R.id.cb13)
         cb14 = findViewById<CheckBox>(R.id.cb14)
         cb15 = findViewById<CheckBox>(R.id.cb15)
         cb16 = findViewById<CheckBox>(R.id.cb16)
         cb17 = findViewById<CheckBox>(R.id.cb17)
         cb18 = findViewById<CheckBox>(R.id.cb18)
         cb19 = findViewById<CheckBox>(R.id.cb19)
         cb20 = findViewById<CheckBox>(R.id.cb20)
         cb21 = findViewById<CheckBox>(R.id.cb21)
         cb22 = findViewById<CheckBox>(R.id.cb22)
         cb23 = findViewById<CheckBox>(R.id.cb23)
         cb24 = findViewById<CheckBox>(R.id.cb24)
         cb25 = findViewById<CheckBox>(R.id.cb25)
         cb26 = findViewById<CheckBox>(R.id.cb26)
         cb27 = findViewById<CheckBox>(R.id.cb27)
         cb28 = findViewById<CheckBox>(R.id.cb28)
         cb29 = findViewById<CheckBox>(R.id.cb29)
         cb30 = findViewById<CheckBox>(R.id.cb30)
         cb31 = findViewById<CheckBox>(R.id.cb31)
         cb32 = findViewById<CheckBox>(R.id.cb32)
         cb33 = findViewById<CheckBox>(R.id.cb33)
         cb34 = findViewById<CheckBox>(R.id.cb34)
         cb35 = findViewById<CheckBox>(R.id.cb35)
         cb36 = findViewById<CheckBox>(R.id.cb36)
         cb37 = findViewById<CheckBox>(R.id.cb37)
         cb38 = findViewById<CheckBox>(R.id.cb38)
         cb39 = findViewById<CheckBox>(R.id.cb39)
         cb40 = findViewById<CheckBox>(R.id.cb40)
         cb41 = findViewById<CheckBox>(R.id.cb41)
         cb42 = findViewById<CheckBox>(R.id.cb42)
         cb43 = findViewById<CheckBox>(R.id.cb43)
         cb44 = findViewById<CheckBox>(R.id.cb44)
         cb45 = findViewById<CheckBox>(R.id.cb45)
         cb46 = findViewById<CheckBox>(R.id.cb46)
         cb47 = findViewById<CheckBox>(R.id.cb47)
         cb48 = findViewById<CheckBox>(R.id.cb48)
         cb49 = findViewById<CheckBox>(R.id.cb49)
         cb50 = findViewById<CheckBox>(R.id.cb50)
         cb51 = findViewById<CheckBox>(R.id.cb51)
         cb52 = findViewById<CheckBox>(R.id.cb52)
         cb53 = findViewById<CheckBox>(R.id.cb53)
         cb54 = findViewById<CheckBox>(R.id.cb54)
         cb55 = findViewById<CheckBox>(R.id.cb55)

        sf = getSharedPreferences("my_sf", MODE_PRIVATE)
        editor = sf.edit()

    }

    override fun onPause() {
        super.onPause()

         val check1 = cb1.isChecked
         val check2 = cb2.isChecked
         val check3 = cb3.isChecked
         val check4 = cb4.isChecked
         val check5 = cb5.isChecked
         val check6 = cb6.isChecked
         val check7 = cb7.isChecked
         val check8 = cb8.isChecked
         val check9 = cb9.isChecked
         val check10 = cb10.isChecked
         val check11 = cb11.isChecked
         val check12 = cb12.isChecked
         val check13 = cb13.isChecked
         val check14 = cb14.isChecked
         val check15 = cb15.isChecked
         val check16 = cb16.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked
         val check1 = cb1.isChecked

        for(i in 1..55){
            val check${i} = cb${i}.isChecked
        }

        editor.apply(){
            putBoolean("check1", check1)
            commit()
        }
    }

    override fun onResume() {
        super.onResume()

        val check1 = sf.getBoolean("check1", false)

        cb1.isChecked = check1
    }
}