package com.example.empty_activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Oct10FormApp2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oct10_form_app2)

        val res = findViewById<TextView>(R.id.res)

        val t1 = intent.getStringExtra("name")
        val t2 = intent.getStringExtra("pass")
        val t3 = intent.getStringExtra("email")
        val t4 = intent.getStringExtra("date")
        val t5 = intent.getStringExtra("phone")
        val option = intent.getStringExtra("course")

        res.text = " Entered Values are : \n " +
                "Name : ${t1} \n" +
                "Password : ${t2} \n" +
                "Email : ${t3} \n" +
                "Date : ${t4} \n" +
                "Phone No. : ${t5} \n " +
                "Course : ${option}"
    }
}