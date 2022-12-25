package com.example.random

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonRandom = findViewById<Button>(R.id.botonRandom)
        val botonCoin = findViewById<Button>(R.id.botonCoin)


        botonRandom.setOnClickListener {
            val intent = Intent(this, RandomNumber::class.java)
            startActivity(intent)
        }

        botonCoin.setOnClickListener {
            val intent = Intent(this, FlipACoin::class.java)
            startActivity(intent)
        }

    }

    
}