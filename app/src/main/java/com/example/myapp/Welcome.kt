package com.example.myapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class Welcome :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_screen)
    }
}