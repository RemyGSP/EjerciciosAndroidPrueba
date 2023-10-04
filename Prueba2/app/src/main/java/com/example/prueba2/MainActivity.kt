package com.example.prueba2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button2)
            .setOnClickListener {
                Log.d("MainActivity", "Has pulsado el boton")
            }

        val text = "Hello toast!"
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(this, text, duration) // in Activity
        val buttonToast = findViewById<Button>(R.id.buttonToast)
            .setOnClickListener {
                toast.show()
            }
    }

    fun prueba(view: View){
        println("Has pulsado el boton");
    }
}