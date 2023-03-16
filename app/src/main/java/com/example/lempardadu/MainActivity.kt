package com.example.lempardadu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Dadu Terlempar!", Toast.LENGTH_SHORT)
            toast.show()
            val resultTextView: TextView = findViewById(R.id.textView)
            val numSides = 6
            resultTextView.text = (1..numSides).random().toString()
        }

    }
}