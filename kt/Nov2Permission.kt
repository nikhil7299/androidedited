package com.example.empty_activity

import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class Nov2Permission : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nov2_permission)

        var cameraBtn = findViewById<Button>(R.id.cameraBtn)
        var requestCamera = registerForActivityResult(ActivityResultContracts.RequestPermission())
        {
            if(it){
                Toast.makeText(this,"Permission Granted",Toast.LENGTH_LONG).show()
                val intentCamera= Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivity(intentCamera)
                finish()
            }
            else{
                Toast.makeText(this,"Permission Denied",Toast.LENGTH_LONG).show()
            }
        }
        cameraBtn.setOnClickListener {
            requestCamera.launch(android.Manifest.permission.CAMERA)
        }
    }
}