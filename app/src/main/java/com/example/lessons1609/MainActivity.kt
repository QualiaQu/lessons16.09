package com.example.lessons1609

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pole_vvoda = findViewById<EditText>(R.id.pole_vvoda)
        val nav_butt = findViewById<Button>(R.id.navigation_bar)

        nav_butt.setOnClickListener{
            val textValue = pole_vvoda.text.toString()
            val intent = Intent(this, SecondActivity::class.java).apply {
                val bundle = Bundle().apply {
                    putString("DATA", textValue)
                }
                putExtras(bundle)
            }
            startActivity(intent)
        }
    }
}