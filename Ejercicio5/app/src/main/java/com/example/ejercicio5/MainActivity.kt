package com.example.ejercicio5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val button = findViewById<Button>(R.id.button2)
        .setOnClickListener {
            Log.d("MainActivity", "Has pulsado el boton")
        }
}