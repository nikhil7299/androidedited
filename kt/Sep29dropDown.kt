package com.example.empty_activity

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Sep29dropDown : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sep29drop_down)
        val editName =findViewById<EditText>(R.id.editName)
        val editPass =findViewById<EditText>(R.id.editPass)
        val editEmail =findViewById<EditText>(R.id.editEmail)
        val editDate =findViewById<EditText>(R.id.editDate)
        val editPhone =findViewById<EditText>(R.id.editPhone)
        val btnSubmit =findViewById<Button>(R.id.btnSubmit)
        val res =findViewById<TextView>(R.id.res)
        val spinner =findViewById<Spinner>(R.id.dropDown)

        var course = arrayOf("B-Tech","BCA","B.Sc","MCA","M.Sc","M-Tech")

        var option=course[0]

        if(spinner!=null){
            val adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,course)
            spinner.adapter=adapter

            spinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(parent:AdapterView<*>, view: View,position: Int,id:Long) {
                    option=course[position]
                }
                override fun onNothingSelected(p0: AdapterView<*>?) {
                }
            }

        btnSubmit.setOnClickListener()
        {
            val t1 = editName.text.toString()
            val t2 = editPass.text.toString()
            val t3 = editEmail.text.toString()
            val t4 = editDate.text.toString()
            val t5 = editPhone.text.toString()

            if (t1.isEmpty() || t2.isEmpty() ||
                t3.isEmpty() || t4.isEmpty() || t5.isEmpty()
            ) {
                res.text = "Enter All The Values"
            } else {
                res.text = " Entered Values are : \n " +
                        "Name : ${t1} \n" +
                        "Password : ${t2} \n" +
                        "Email : ${t3} \n" +
                        "Date : ${t4} \n" +
                        "Phone No. : ${t5} \n " +
                        "Course : ${option}"
            }
        }
    }

    }
}