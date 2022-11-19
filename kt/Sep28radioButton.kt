package com.example.empty_activity

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Sep28radioButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sep28radio_button)
        val rbrg =findViewById<RadioGroup>(R.id.rbrg)
        var submit = findViewById<Button>(R.id.submit)
        var reset = findViewById<Button>(R.id.reset)
        var out = findViewById<TextView>(R.id.out)

        submit.setOnClickListener(){
            var selectId = rbrg.checkedRadioButtonId
            if(selectId ==-1){
                Toast.makeText(this,"Select any one..",Toast.LENGTH_SHORT).show()
            }
            else {
                val rB = rbrg.findViewById<RadioButton>(selectId)
                out.text = "Result : ${rB.text}"
//                if(rB.text=="Java"){
//                    out.text= "ITs JAVA"
//                }
//                else out.text="ITS Not Java"
            }
        }
        reset.setOnClickListener(){
            rbrg.clearCheck()
            out.text=""
        }
    }
}