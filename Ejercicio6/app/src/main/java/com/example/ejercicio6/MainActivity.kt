package com.example.ejercicio6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val text = "Hello toast!"
        val duration = LENGTH_SHORT
        val toast = makeText(this, text, duration)
        val buttonToast = findViewById<Button>(R.id.buttonToast)
            .setOnClickListener {
                toast.show()
            }
    }
}