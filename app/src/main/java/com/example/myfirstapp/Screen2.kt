package com.example.myfirstapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Screen2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
        val btnApp = findViewById<Button>(R.id.button21)
        btnApp.setOnClickListener {
            //open the App dev page
            intent = Intent(applicationContext, ScreenApp::class.java)
            startActivity(intent)
        }
        val btnWeb = findViewById<Button>(R.id.button22)
        btnWeb.setOnClickListener {
            //open the Web dev page
            intent = Intent(applicationContext, ScreenWeb::class.java)
            startActivity(intent)
        }
        val btnDevOps = findViewById<Button>(R.id.button23)
        btnDevOps.setOnClickListener {
            //open the devops page
            intent = Intent(applicationContext, ScreenDevOps::class.java)
            startActivity(intent)
        }
        val btnDS = findViewById<Button>(R.id.button24)
        btnDS.setOnClickListener {
            //open the Data Science page
            intent = Intent(applicationContext, ScreenDS::class.java)
            startActivity(intent)
        }
        val btnAI = findViewById<Button>(R.id.button25)
        btnAI.setOnClickListener {
            //open the AI page
            intent = Intent(applicationContext, ScreenAI::class.java)
            startActivity(intent)
        }
        val btnIOS = findViewById<Button>(R.id.button26)
        btnIOS.setOnClickListener {
            //open the IOS page
            intent = Intent(applicationContext, ScreenIOS::class.java)
            startActivity(intent)
        }
        val btnSupport = findViewById<Button>(R.id.button2)
        btnSupport.setOnClickListener {
            // makes the support call
            val phoneNumber = "7080205878" // Replace with the desired phone number
            val callIntent = Intent(Intent.ACTION_CALL)
            callIntent.data = Uri.parse("tel:$phoneNumber")
            startActivity(callIntent)

        }


    }
}