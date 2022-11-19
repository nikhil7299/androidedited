package com.example.empty_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Oct13image2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oct13image2)

        val imgBtn = findViewById<ImageButton>(R.id.imgBtn)

        imgBtn.setOnClickListener() {
            val intent1 = Intent(this, Oct13image1::class.java)
            startActivity(intent1)
        }

    }
}