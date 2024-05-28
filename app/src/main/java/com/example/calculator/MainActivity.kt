package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.example.calculator.R.*
import com.example.calculator.R.id.*
import com.example.calculator.madels.Calculator

class MainActivity : AppCompatActivity() {

    lateinit var edtNumber1: EditText
    lateinit var edtNumber2: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        val intent = Intent(this, MainActivity::class.java)
        val ans = 0.0
        intent.putExtra("answer", ans)
        startActivity(intent)
        finish()

        edtNumber1 = findViewById(id.edtNumber1)
        edtNumber2 = findViewById(id.edtNumber2)
    }

    fun buttonClick(v: View) {
        var ans = 0.0
        val calculator = Calculator(
            edtNumber1.text.toString().toDouble(),
            edtNumber2.text.toString().toDouble()
        )

        when (v.id) {
            btn_Plus -> ans = calculator.add()
            btn_Minus -> ans = calculator.subtract()
            btn_Multiply -> ans = calculator.multiply()
            btn_Divide -> ans = calculator.divide()
        }
        println(ans)
    }

}

