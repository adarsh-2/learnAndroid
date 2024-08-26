package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listView = findViewById<ListView>(R.id.listView)

        val taskList = arrayListOf<String>()
        taskList.add("Brazil 5")
        taskList.add("Germany 4")
        taskList.add("Italy 4")
        taskList.add("Argentina 3")
        taskList.add("France 2")
        taskList.add("Uruguay 2")
        taskList.add("England 1")
        taskList.add("Spain 1")

//        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, taskList)
        val adapter = ArrayAdapter(this, R.layout.custom, taskList)

        listView.adapter = adapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val text = "Clicked on item : " + (view as TextView).text.toString()
            Toast.makeText(this, text ,Toast.LENGTH_SHORT).show()
        }
    }
}