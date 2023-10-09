package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val btnToLogin = findViewById<Button>(R.id.btnToLogin)
        val btnToRegister = findViewById<Button>(R.id.btnToRegister)

        val fragmentManager = supportFragmentManager
        val registerFragment = FragmentRegister()
        val loginFragment = LoginFragment()

        btnToLogin.setOnClickListener {
            fragmentManager.beginTransaction()
                .replace(R.id.welcomeActivity, loginFragment, LoginFragment::class.java.simpleName)
                .commit()
        }

        btnToRegister.setOnClickListener {
            fragmentManager.beginTransaction()
                .replace(R.id.welcomeActivity, registerFragment, FragmentRegister::class.java.simpleName)
                .commit()
        }
    }
}