package com.example.testintegration

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL



class MainActivity : AppCompatActivity() {
    lateinit var etText1 : EditText
    lateinit var etText2 : EditText
    lateinit var etText3 : EditText
    lateinit var btn : Button

    var client =  OkHttpClient()
    val url = "http://127.0.0.1:8000/add/12/20"

    val request = Request.Builder()
        .url(url)
        .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etText1 = findViewById(R.id.textView)
        etText2 = findViewById(R.id.textView2)
        etText3 = findViewById(R.id.textView3)
        btn = findViewById(R.id.btnDoSomething)

//        val num1 = etText1.text.toString().toInt()
//        val num2 = etText2.text.toString().toInt()


        btn.setOnClickListener(){
            val ans = main()
            etText3.setText(ans)
        }


    }

    fun main() : String {
        try {
            // Define the URL of the API endpoint you want to call
            val url = URL("http://127.0.0.1:8000/add/12/20")

            // Open a connection to the URL
            val connection = url.openConnection() as HttpURLConnection

            // Set the request method (GET, POST, PUT, DELETE, etc.)
            connection.requestMethod = "GET"

            // Read the response
            val inStream = BufferedReader(InputStreamReader(connection.inputStream))
            var inputLine: String?
            val response = StringBuffer()
            while (inStream.readLine().also { inputLine = it } != null) {
                response.append(inputLine)
            }
            inStream.close()

            // Print the response
            println(response.toString())

            // Close the connection
            connection.disconnect()
            return response.toString()
        } catch (e: Exception) {
            e.printStackTrace()
            return "adarsh"
        }
    }

}