package com.example.sasuke

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button to open FirstActivity
        val buttonFirst = findViewById<Button>(R.id.btn_second)
        buttonFirst.setOnClickListener {
            val intent = Intent(this, Secondary::class.java)
            intent.action = Intent.ACTION_SEND
            startActivity(intent)
        }
        // Button to open SecondActivity
        val buttonSecond = findViewById<Button>(R.id.btn_third)
        buttonSecond.setOnClickListener {
            val intent = Intent(this, Thirdty::class.java)
            intent.action = Intent.ACTION_SEND
              startActivity(intent)
        }
        }
    }