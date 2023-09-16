package com.example.lessons1609

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_second)
        val textView_second = findViewById<TextView>(R.id.textView_second)

        val bundle: Bundle? = intent.extras
        val DATA = bundle?.getString("DATA")
        DATA?.let {
            textView_second.text = it.toString()
        }
    }
}