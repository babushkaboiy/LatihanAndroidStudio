package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    companion object{
        const val USERNAME = "username"
        const val PASSWORD = "password"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = intent.getStringExtra(USERNAME)
        val password = intent.getStringExtra(PASSWORD)

        val tvUsername = findViewById<TextView>(R.id.username)
        val tvPassworrd = findViewById<TextView>(R.id.password)

        tvUsername.text = username
        tvPassworrd.text = password
        }
}
