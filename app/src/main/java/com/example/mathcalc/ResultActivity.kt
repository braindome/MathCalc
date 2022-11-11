package com.example.mathcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {

    lateinit var resultView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        resultView = findViewById(R.id.resultTextView)
        val resultSquare = intent.getIntExtra("resultSquare", 666)

        resultView.text = resultSquare.toString()
    }
}