package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var same = findViewById<Button>(R.id.button2)
        same.setOnClickListener(){
            var mysa = Intent(this,MainActivity::class.java)
            startActivity(mysa)
        }
    }
}