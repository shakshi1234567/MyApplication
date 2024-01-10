package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mysento=findViewById<Button>(R.id.button3)
        mysento.setOnClickListener(){
            var mys = Intent(this,login::class.java)
            startActivity(mys)
        }
        var abc=findViewById<Button>(R.id.button5)
        abc.setOnClickListener(){
            var ab = Intent(this,signupscreen::class.java)
            startActivity(ab)


        }
    }
}