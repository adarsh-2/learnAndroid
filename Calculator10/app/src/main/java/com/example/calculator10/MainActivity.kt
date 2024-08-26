package com.example.calculator10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1TextField = findViewById<EditText>(R.id.number1)
        val num2TextField = findViewById<EditText>(R.id.number2)
        val resultTextField = findViewById<TextView>(R.id.result)
        val addButton = findViewById<Button>(R.id.btnAdd)
        val subtractButton = findViewById<Button>(R.id.btnSubtract)
        val multiplyButton = findViewById<Button>(R.id.btnMultiply)
        val divideButton = findViewById<Button>(R.id.btnDivide)

        subtractButton.setOnClickListener{
            val input1 = num1TextField.text.toString()
            val input2 = num2TextField.text.toString()
            val n1 = input1.toInt()
            val n2 = input2.toInt()
            val ans = n1 - n2
            resultTextField.text = ans.toString()
//            resultTextField.text = "Hello World!"
        }

        addButton.setOnClickListener{
            val input1 = num1TextField.text.toString()
            val input2 = num2TextField.text.toString()
            val n1 = input1.toInt()
            val n2 = input2.toInt()
            val ans = n1 + n2
            resultTextField.text = ans.toString()
//            resultTextField.text = "Hello World!"
        }

        multiplyButton.setOnClickListener{
            val input1 = num1TextField.text.toString()
            val input2 = num2TextField.text.toString()
            val n1 = input1.toInt()
            val n2 = input2.toInt()
            val ans = n1 * n2
            resultTextField.text = ans.toString()
//            resultTextField.text = "Hello World!"
        }

        divideButton.setOnClickListener{
            val input1 = num1TextField.text.toString()
            val input2 = num2TextField.text.toString()
            val n1 = input1.toInt()
            val n2 = input2.toInt()
            val ans = n1 / n2
            resultTextField.text = ans.toString()
//            resultTextField.text = "Hello World!"
        }
    }
}