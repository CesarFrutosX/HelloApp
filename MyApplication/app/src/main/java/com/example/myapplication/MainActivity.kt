package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var text1: TextView
    private lateinit var text2: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text1 = findViewById<TextView>(R.id.textViewUno)
        text2 = findViewById<TextView>(R.id.textViewDos)
        var a: Int = 0

    }
}