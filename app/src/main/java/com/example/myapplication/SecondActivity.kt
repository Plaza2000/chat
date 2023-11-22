package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val messageTextView: TextView = findViewById(R.id.textViewMessage)

        // Obtener el mensaje del Intent
        val message = intent.getStringExtra("MESSAGE")

        // Mostrar el mensaje en el TextView
        messageTextView.text = message
    }
}
