package com.example.ner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import edu.stanford.nlp.coref.data.CorefChain
import edu.stanford.nlp.ling.*
import edu.stanford.nlp.ie.util.*
import edu.stanford.nlp.pipeline.*
import edu.stanford.nlp.semgraph.*
import edu.stanford.nlp.trees.*
import edu.stanford.nlp.simple.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.button)
        var input = findViewById<EditText>(R.id.editText)
        var display = findViewById<TextView>(R.id.textView)

        btn.setOnClickListener{
            var text = input.text.toString()
            var text2 = Sentence(text)
            var nerTags = text2.nerTags()
            var firstPosTag = text2.posTag(0)
            display.text = firstPosTag.toString()

        }
    }
}