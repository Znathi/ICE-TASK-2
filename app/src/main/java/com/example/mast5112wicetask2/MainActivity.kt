package com.example.mast5112wicetask2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            val etName = findViewById<EditText>(R.id.editTextText2)
            val etCourse = findViewById<EditText>(R.id.editTextText)
            val btnDisplay = findViewById<Button>(R.id.button)
            val tvResult = findViewById<TextView>(R.id.textView)

            btnDisplay.setOnClickListener {
                val name = etName.text.toString()
                val course = etCourse.text.toString()

                tvResult.text = "Name: $name\nCourse: $course"

        }
    }
}