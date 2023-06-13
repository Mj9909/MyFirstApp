package com.example.myfirstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ScreenAI : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_ai)
        val btnPython= findViewById<Button>(R.id.buttonAI1)
        btnPython.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/python-tutorial"    )
            startActivity(intent)
        }
        val btntnsrfl = findViewById<Button>(R.id.buttonAI3)
        btntnsrfl.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/tensorflow-introduction")
            startActivity(intent)
        }
        val btnml = findViewById<Button>(R.id.buttonAI2)
        btnml.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/machine-learning")
            startActivity(intent)
        }
        val btnkeras = findViewById<Button>(R.id.buttonAI4)
        btnkeras.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/keras")
            startActivity(intent)
        }
        val btnFull = findViewById<Button>(R.id.buttonAI5)
        btnFull.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/artificial-intelligence-ai")
            startActivity(intent)
        }

    }
}