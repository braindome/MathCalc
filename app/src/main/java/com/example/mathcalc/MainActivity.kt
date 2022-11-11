package com.example.mathcalc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var firstNumEditText : EditText
    lateinit var secondNumEditText : EditText

    var firstNumber = 0
    var secondNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumEditText = findViewById(R.id.firstNumEditText)
        secondNumEditText = findViewById(R.id.secondNumEditText)



        val sumButton = findViewById<Button>(R.id.sumBtnView)
        val subtractionButton = findViewById<Button>(R.id.subtractionBtnView)
        val multiplicationButton = findViewById<Button>(R.id.multiplicationBtnView)
        val divisionButton = findViewById<Button>(R.id.divisionBtnView)





        sumButton.setOnClickListener() {
            firstNumber = firstNumEditText.text.toString().toInt()
            secondNumber = secondNumEditText.text.toString().toInt()
            val result = firstNumber + secondNumber
            Log.d("!!!", result.toString())
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("resultSquare", result)
            startActivity(intent)
        }

        subtractionButton.setOnClickListener() {
            firstNumber = firstNumEditText.text.toString().toInt()
            secondNumber = secondNumEditText.text.toString().toInt()
            val result = firstNumber - secondNumber
            Log.d("!!!", result.toString())
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("resultSquare", result)
            startActivity(intent)
        }

        multiplicationButton.setOnClickListener() {
            firstNumber = firstNumEditText.text.toString().toInt()
            secondNumber = secondNumEditText.text.toString().toInt()
            val result = firstNumber * secondNumber
            Log.d("!!!", result.toString())
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("resultSquare", result)
            startActivity(intent)
        }

        divisionButton.setOnClickListener() {
            firstNumber = firstNumEditText.text.toString().toInt()
            secondNumber = secondNumEditText.text.toString().toInt()
            val result = firstNumber / secondNumber
            Log.d("!!!", result.toString())
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("resultSquare", result)
            startActivity(intent)
        }
    }
}