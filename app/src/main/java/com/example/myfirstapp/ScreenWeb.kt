package com.example.myfirstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ScreenWeb : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_web)
        val btnHtml = findViewById<Button>(R.id.buttonW1)
        btnHtml.setOnClickListener {
            val intent=Intent (Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.javatpoint.com/html-with-css")
            startActivity(intent)
        }
        val btnReact = findViewById<Button>(R.id.buttonW2)
        btnReact.setOnClickListener {
            val intent=Intent (Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.javatpoint.com/react-bootstrap")
            startActivity(intent)
        }
        val btnJS = findViewById<Button>(R.id.buttonW3)
        btnJS.setOnClickListener {
            val intent=Intent (Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.javatpoint.com/javascript-tutorial")
            startActivity(intent)
        }
        val btnNode = findViewById<Button>(R.id.buttonW4)
        btnNode.setOnClickListener {
            val intent=Intent (Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.javatpoint.com/django-vs-node-js")
            startActivity(intent)
        }
        val btnFull = findViewById<Button>(R.id.buttonW5)
        btnFull.setOnClickListener {
            val intent=Intent (Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.javatpoint.com/java-web-development")
            startActivity(intent)
        }
    }
}