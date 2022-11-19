package com.example.empty_activity

import android.graphics.Color
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class Oct6listview : AppCompatActivity() {

    lateinit var listView: ListView
    lateinit var layoutMain : ConstraintLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oct6listview)

//        val arrayAdapter: ArrayAdapter<*>
        listView = findViewById(R.id.listView)
        layoutMain=findViewById(R.id.layoutMain)

        val a = arrayOf(Color.RED,Color.BLUE,Color.GRAY,Color.CYAN,Color.YELLOW)
        val b = arrayOf("RED","BLUE","GRAY","CYAN","YELLOW")

        val arrayAdapter =ArrayAdapter(this,android.R.layout.simple_list_item_1,b)
        listView.adapter=arrayAdapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            layoutMain.setBackgroundColor(a[i])
        }
    }
}
