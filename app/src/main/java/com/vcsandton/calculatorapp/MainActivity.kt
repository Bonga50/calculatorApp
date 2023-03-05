package com.vcsandton.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Addition = findViewById<Button>(R.id.btnAddition);
        val Subtraction = findViewById<Button>(R.id.btnSubtract);
        val Division = findViewById<Button>(R.id.btnDivide);
        val Multiplication = findViewById<Button>(R.id.btnMultiply);
        var textAnswer: TextView = findViewById<TextView>(R.id.txtanswer);
        var Num1 = findViewById<EditText>(R.id.txtnum1);
        var Num2 = findViewById<EditText>(R.id.txtnum2);



        Addition.setOnClickListener{
            var tempAnswer =  Num1.text.toString().toInt() + Num2.text.toString().toInt()


            textAnswer.text = tempAnswer.toString()
        }
        Subtraction.setOnClickListener{

            var tempAnswer =  Num1.text.toString().toInt() - Num2.text.toString().toInt()


            textAnswer.text = tempAnswer.toString()
        }
        Multiplication.setOnClickListener{

            var tempAnswer =  Num1.text.toString().toInt() * Num2.text.toString().toInt()


            textAnswer.text = tempAnswer.toString()
        }
        Division.setOnClickListener{

            var tempAnswer =  Num1.text.toString().toInt() / Num2.text.toString().toInt()


            textAnswer.text = tempAnswer.toString()
        }

    }
}