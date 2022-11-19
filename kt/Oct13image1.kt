package com.example.empty_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Oct13image1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oct13image1)

        val showImgBtn = findViewById<Button>(R.id.showImgBtn)

        showImgBtn.setOnClickListener() {
            val intent = Intent(this, Oct13image2::class.java)
            startActivity(intent)
        }

    }
}