package com.example.empty_activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Weekdays2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weekdays2)

        var resultTxt = findViewById<TextView>(R.id.resultTxt)

        var result = intent.getStringExtra("result")

        if(result.equals("Saturday") || result.equals("Sunday")) {
            resultTxt.text = "On $result\n University is Closed\n (Non Working Day)"
        }
        else resultTxt.text = "On $result\n University is Opened\n from 9:00 AM to 5:00 PM"
    }
}