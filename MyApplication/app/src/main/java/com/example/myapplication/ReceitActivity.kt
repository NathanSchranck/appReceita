package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ReceitActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_receit)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val descButton1 = findViewById<Button>(R.id.descButton1)
        descButton1.setOnClickListener{
            val intent = Intent(this, DescActivity::class.java)
            startActivity(intent)
        }

        val descButton2 = findViewById<Button>(R.id.descButton2)
        descButton2.setOnClickListener{
            val intent = Intent(this, DescActivity::class.java)
            startActivity(intent)
        }

        val descButton3 = findViewById<Button>(R.id.descButton3)
        descButton3.setOnClickListener{
            val intent = Intent(this, DescActivity::class.java)
            startActivity(intent)
        }
    }
}