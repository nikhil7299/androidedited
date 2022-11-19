package com.example.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tv1 = findViewById<TextView>(R.id.textView1)
        registerForContextMenu(tv1)

        var popupMenuBtn:Button= findViewById(R.id.popupMenu)
        val btnAlert:Button= findViewById(R.id.alertDialog)
        val customAlertBtn:Button=findViewById(R.id.customAlertDialog)
        val alertItem:Button=findViewById(R.id.alertItem)
        //popUpMenu
        popupMenuBtn.setOnClickListener {
            val popupMenu = PopupMenu(this,popupMenuBtn)
            popupMenu.menuInflater.inflate(R.menu.popupmenu,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener {
                Toast.makeText(this,"You have selected ${it.title}",Toast.LENGTH_LONG).show()
                true
            }
            popupMenu.show()
        }


        //Alert Dialog
        btnAlert.setOnClickListener{
            val builder = AlertDialog.Builder(this)
            builder.setTitle("My Alert Dialog")
                .setMessage("Do you want to exit?")
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setCancelable(true)
            builder.setNeutralButton("Cancel"){dialogInterface,which->
                Toast.makeText(this,"Cancel Clicked",Toast.LENGTH_LONG).show()

            }

            builder.setNegativeButton("No"){dialogInterface,which->
                Toast.makeText(this,"No Clicked",Toast.LENGTH_LONG).show()
            }
            builder.setPositiveButton("Yes"){dialogInterface,which->
                Toast.makeText(this,"Yes Clicked",Toast.LENGTH_LONG).show()
            }

            val alertDialog:AlertDialog=builder.create()
            alertDialog.show()
        }

        //Custom Alert Dialog
        customAlertBtn.setOnClickListener{
            val builder=AlertDialog.Builder(this)
            builder.setTitle("Simple Alert")
                .setMessage("It is Simple Alert Message")
                .setPositiveButton("OK"){dialog,which->
                    Toast.makeText(this,"OK Clicked",Toast.LENGTH_LONG).show()
                }
                .setNegativeButton("Not Now"){dialog,which->
                    Toast.makeText(this,"Not Now Clicked",Toast.LENGTH_LONG).show()

                }
                .setCancelable(true)
                    //if false cannot cancel by clicking outside the alert box
                .show()
        }

        //Alert with show Item when button clicked
        alertItem.setOnClickListener{
            val item = arrayOf("CSE","ECE","EEE","Civil","Other")
            val builder = AlertDialog.Builder(this)
            builder.setTitle("List of Item")
                .setItems(item){dialog,which->
                    Toast.makeText(this,"${item[which]} Clicked",Toast.LENGTH_LONG).show()

                }
                .setPositiveButton("OK",null)
                .setNegativeButton("Not Now",null)
                .setNeutralButton("Cancel",null)
                .setCancelable(true)

                val alertItemBuilder=builder.create()
                alertItemBuilder.show()

        }

    }
    //Context Menu
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu?.setHeaderTitle("Choose Options")
        menuInflater.inflate(R.menu.context,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.option1->{
                Toast.makeText(this,"You have selected option1",Toast.LENGTH_SHORT).show()
            }
            R.id.option2->{
                Toast.makeText(this,"You have selected option2",Toast.LENGTH_SHORT).show()
            }

        }
        return super.onContextItemSelected(item)
    }
    //Options Menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.optionmenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id=item.itemId
        when(id){
            R.id.setting->{
                Toast.makeText(this,"You have selected settings",Toast.LENGTH_SHORT).show()
            }
            R.id.notification->{
                Toast.makeText(this,"You have selected payments",Toast.LENGTH_SHORT).show()
            }
            R.id.share->{
                Toast.makeText(this,"You have selected newgroup",Toast.LENGTH_SHORT).show()
            }
            R.id.delete->{
                Toast.makeText(this,"You have selected exit",Toast.LENGTH_SHORT).show()
                finish()

            }
        else->{
            Toast.makeText(this,"You have selected other option",Toast.LENGTH_SHORT).show()

        }

        }
        return super.onOptionsItemSelected(item)
    }
}