package com.example.empty_activity

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class z1checkboxIntent2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_z1checkbox_intent2)

        var resultTxt = findViewById<TextView>(R.id.resultTxt)
        var result = intent.getStringExtra("result")
        resultTxt.text= result
        Toast.makeText(this, result, Toast.LENGTH_LONG).show()
    }
}