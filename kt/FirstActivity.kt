package com.example.empty_activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        var et1=findViewById<EditText>(R.id.et1)
        var et2= findViewById<TextView>(R.id.et2)
        var tv1= findViewById<TextView>(R.id.tv1)
        var addBtn=findViewById<Button>(R.id.addBtn)
        var subBtn=findViewById<Button>(R.id.subBtn)
        var mulBtn=findViewById<Button>(R.id.mulBtn)
        var divBtn=findViewById<Button>(R.id.divBtn)
        var modBtn=findViewById<Button>(R.id.modBtn)


        addBtn.setOnClickListener{
            if(et1.text.toString().isEmpty() && et2.text.toString().isEmpty())
                tv1.text="Please fill the inputs"
            else if (et1.text.toString().isEmpty() || et2.text.toString().isEmpty()){
                tv1.text="Please fill both the inputs"
            }
            else{
                var x:Int=et1.text.toString().toInt()
                var y:Int=et2.text.toString().toInt()
                var z:Int=x+y
                tv1.text=z.toString()
            }
        }
        subBtn.setOnClickListener{
            if(et1.text.toString().isEmpty() && et2.text.toString().isEmpty())
                tv1.text="Please fill the inputs"
            else if (et1.text.toString().isEmpty() || et2.text.toString().isEmpty()){
                tv1.text="Please fill both the inputs"
            }
            else{
                var x:Int=et1.text.toString().toInt()
                var y:Int=et2.text.toString().toInt()
                var z:Int=x-y
                tv1.text=z.toString()
            }
        }
        mulBtn.setOnClickListener{
            if(et1.text.toString().isEmpty() && et2.text.toString().isEmpty())
                tv1.text="Please fill the inputs"
            else if (et1.text.toString().isEmpty() || et2.text.toString().isEmpty()){
                tv1.text="Please fill both the inputs"
            }
            else{
                var x:Int=et1.text.toString().toInt()
                var y:Int=et2.text.toString().toInt()
                var z:Int=x*y
                tv1.text=z.toString()
            }
        }
        divBtn.setOnClickListener{
            if(et1.text.toString().isEmpty() && et2.text.toString().isEmpty())
                tv1.text="Please fill the inputs"
            else if (et1.text.toString().isEmpty() || et2.text.toString().isEmpty()){
                tv1.text="Please fill both the inputs"
            }
            else{
                var x:Int=et1.text.toString().toInt()
                var y:Int=et2.text.toString().toInt()
                var z:Int=x/y
                tv1.text=z.toString()
            }
        }
        modBtn.setOnClickListener{
            if(et1.text.toString().isEmpty() && et2.text.toString().isEmpty())
                tv1.text="Please fill the inputs"
            else if (et1.text.toString().isEmpty() || et2.text.toString().isEmpty()){
                tv1.text="Please fill both the inputs"
            }
            else{
                var x:Int=et1.text.toString().toInt()
                var y:Int=et2.text.toString().toInt()
                var z:Int=x%y
                tv1.text=z.toString()
            }
        }
    }



}