package com.example.empty_activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Weekdays : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weekdays)

        val rbrg =findViewById<RadioGroup>(R.id.rbrg)
        var submit = findViewById<Button>(R.id.submit)
        var reset = findViewById<Button>(R.id.reset)

        submit.setOnClickListener(){
            var selectId = rbrg.checkedRadioButtonId
            var res:String =""
            if(selectId ==-1){
                Toast.makeText(this,"Select any one..", Toast.LENGTH_SHORT).show()
            }
            else {
                val rB = rbrg.findViewById<RadioButton>(selectId)
                res= rB.text.toString()
//                out.text = "Result : ${rB.text}"
//                if(rB.text=="Java"){
//                    out.text= "ITs JAVA"
//                }
//                else out.text="ITS Not Java"
                val intent = Intent(this,Weekdays2::class.java)
                intent.putExtra("result",res)
                startActivity(intent)
            }
        }
        reset.setOnClickListener(){
            rbrg.clearCheck()
        }
    }
}