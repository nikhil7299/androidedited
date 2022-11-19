package com.example.empty_activity

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.CallLog
import android.provider.MediaStore
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class ImplicitIntent : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent)

        var urlTxt = findViewById<EditText>(R.id.urlTxt)
        val dialer = findViewById<Button>(R.id.dialer)
        val camera = findViewById<Button>(R.id.camera)
        val calllog = findViewById<Button>(R.id.calllog)
        val contacts = findViewById<Button>(R.id.contacts)
        val gallery = findViewById<Button>(R.id.gallery)
        val share = findViewById<Button>(R.id.share)
        val urlEditTxt = findViewById<EditText>(R.id.urlEditTxt)
        val search = findViewById<Button>(R.id.search)
        val snackBar = findViewById<Button>(R.id.snackBar)

        share.setOnClickListener{
            var url :String = urlEditTxt.text.toString()
            var urlEditTxtIntent = Intent(Intent.ACTION_SEND,Uri.parse("url:$url"))
//            urlEditTxtIntent.setType("text/plain")
            startActivity(urlEditTxtIntent)
        }
        search.setOnClickListener{
            var url :String = urlEditTxt.text.toString()
            var searchIntent = Intent(Intent.ACTION_VIEW,Uri.parse("https://$url"))
            startActivity(searchIntent)
        }

        dialer.setOnClickListener{
            var url :String = urlTxt.text.toString()
            val urlIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$url"))
            startActivity(urlIntent)
        }
        camera.setOnClickListener{
            val camIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(camIntent)
        }
        calllog.setOnClickListener{
            val callIntent = Intent(Intent.ACTION_VIEW)
            callIntent.setType(CallLog.Calls.CONTENT_TYPE)
            startActivity(callIntent)
        }
//        contacts.setOnClickListener{
//            val contactsIntent = Intent(Intent.ACTION_PICK,ContactsContract.Contacts.CONTENT_URI)
//            startActivity(contactsIntent)
//        }

        contacts.setOnClickListener{
            Log.i("info1","This is info1")
            Log.w("pwd","Enter password")
        }
        gallery.setOnClickListener{
            val galleryIntent = Intent()
            galleryIntent.action=Intent.ACTION_VIEW
            galleryIntent.type="image/*"
            startActivity(galleryIntent)
        }
        snackBar.setOnClickListener {
            val snackBar = Snackbar.make(it, "It is default Snackbar",Snackbar.LENGTH_LONG).show()
        }
    }
}