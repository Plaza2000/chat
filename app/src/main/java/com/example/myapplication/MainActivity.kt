package com.example.myapplication
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View) {
        val messageEditText: EditText = findViewById(R.id.editTextMessage)
        val message = messageEditText.text.toString()

        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("MESSAGE", message)
        startActivity(intent)

        // Limpiar el campo de entrada después de enviar el mensaje
        messageEditText.text.clear()
    }
}
