package com.example.myfirstapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ScreenDevOps : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_dev_ops)
        val btnVcs = findViewById<Button>(R.id.buttonD1)
        btnVcs.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/git-version-control-system")
            startActivity(intent)
        }
        val btnCicd = findViewById<Button>(R.id.buttonD2)
        btnCicd.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/jenkins")
            startActivity(intent)
        }
        val btnCmt = findViewById<Button>(R.id.buttonD3)
        btnCmt.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/puppet-configuration-management")
            startActivity(intent)
        }
        val btnCt = findViewById<Button>(R.id.buttonD4)
        btnCt.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/docker-tutorial")
            startActivity(intent)
        }
        val btnCloud = findViewById<Button>(R.id.buttonD5)
        btnCloud.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/aws-tutorial")
            startActivity(intent)
        }
        val btnKbrnt = findViewById<Button>(R.id.buttonD6)
        btnKbrnt.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/kubernetes")
            startActivity(intent)
        }
        val btnFull = findViewById<Button>(R.id.buttonD7)
        btnFull.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.javatpoint.com/devops")
            startActivity(intent)
        }


    }
}