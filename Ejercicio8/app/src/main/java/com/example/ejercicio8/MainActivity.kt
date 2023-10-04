package com.example.ejercicio8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editTextHello = findViewById<EditText>(R.id.editTextText) as EditText;
        var textViewShow =findViewById<TextView>(R.id.textView) as TextView;
        val button = findViewById<Button>(R.id.button)
            .setOnClickListener {
                textViewShow.text = editTextHello.text;
            }
    }
}