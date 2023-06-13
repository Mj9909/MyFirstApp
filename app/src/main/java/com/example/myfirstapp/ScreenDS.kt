package com.example.myfirstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ScreenDS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_ml)
        val btnSql = findViewById<Button>(R.id.buttonDS1)
        btnSql.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/sql-tutorial")
            startActivity(intent)
        }
        val btnMatlab = findViewById<Button>(R.id.buttonDS2)
        btnMatlab.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/matlab")
            startActivity(intent)
        }
        val btnPython = findViewById<Button>(R.id.buttonDS3)
        btnPython.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/best-python-libraries-for-machine-learning")
            startActivity(intent)
        }
        val btnMl = findViewById<Button>(R.id.buttonDS4)
        btnMl.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/machine-learning")
            startActivity(intent)
        }
        val btnFull = findViewById<Button>(R.id.buttonDS5)
        btnFull.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/data-science")
            startActivity(intent)
        }
    }

}