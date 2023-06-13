package com.example.myfirstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ScreenIOS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_ios)
        val btnSwift = findViewById<Button>(R.id.buttonI1)
        btnSwift.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.javatpoint.com/swift-tutorial")
            startActivity(intent)

        }
        val btnFlutter = findViewById<Button>(R.id.buttonI3)
        btnFlutter.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.javatpoint.com/flutter")
            startActivity(intent)

        }
        val btnInterface = findViewById<Button>(R.id.buttonI2)
        btnInterface.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.javatpoint.com/ios-storyboard-and-interface-builder")
            startActivity(intent)

        }
        val btnDb= findViewById<Button>(R.id.buttonI4)
        btnDb.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.javatpoint.com/using-realm-database-in-ios-app")
            startActivity(intent)

        }
        val btnIos = findViewById<Button>(R.id.buttonI5)
        btnIos.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.javatpoint.com/ios-development-using-swift")
            startActivity(intent)

        }
    }
}