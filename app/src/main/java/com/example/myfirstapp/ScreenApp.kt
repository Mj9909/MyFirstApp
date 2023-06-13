package com.example.myfirstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ScreenApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)
        val btnJava = findViewById<Button>(R.id.buttonA1)
        btnJava.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/java-tutorial")
            startActivity(intent)
        }
        val btnKotlin = findViewById<Button>(R.id.buttonA2)
        btnKotlin.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/kotlin-tutorial")
            startActivity(intent)
        }
        val btnFlutter = findViewById<Button>(R.id.buttonA3)
        btnFlutter.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/flutter")
            startActivity(intent)
        }
        val btnFireBase = findViewById<Button>(R.id.buttonA4)
        btnFireBase.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/adding-firebase-to-app")
            startActivity(intent)
        }
        val btnFull = findViewById<Button>(R.id.buttonA5)
        btnFull.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/android-tutorial")
            startActivity(intent)
        }
    }
}