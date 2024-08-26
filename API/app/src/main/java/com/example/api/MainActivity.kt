package com.example.api

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView: RecyclerView
    lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myRecyclerView = findViewById(R.id.recyclerView)

        val retrofitBuilder = Retrofit.Builder()
            .baseUrl("https://dummyjson.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiInterface::class.java)

        val retrofitData = retrofitBuilder.getProductData()

        retrofitData.enqueue(object : Callback<MyData?> { // ctrl+shift+space

            override fun onResponse(call: Call<MyData?>, response: Response<MyData?>) {
                // if api call is success, then use the data of API and show in your app
                var responseBody = response.body()
                val productList = responseBody?.products

                val collectDataInStringBuilder = StringBuilder()

                for(myData in productList!!){
                    collectDataInStringBuilder.append(myData.title + "\n")
                }

                myAdapter = MyAdapter(this@MainActivity, productList)
                myRecyclerView.adapter = myAdapter
                myRecyclerView.layoutManager = LinearLayoutManager(this@MainActivity)


            }

            override fun onFailure(call: Call<MyData?>, t: Throwable) {
                // if api call fails
                Log.e("AKP", "onFailure: " + t.message)
            }
        })
    }
}

// video 30 1 h 20 m