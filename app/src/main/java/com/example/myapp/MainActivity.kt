package com.example.myapp

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var newScreen: Button
    lateinit var openWebPage: Button
    lateinit var webView: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        newScreen = findViewById(R.id.startActivity) as Button
        newScreen.setOnClickListener {
            var screen = Intent(this, Welcome::class.java)
            startActivity(screen)
        }

        openWebPage = findViewById(R.id.openWebPage) as Button
        openWebPage.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.sydney.com/things-to-do/fashion-and-shopping"))
            startActivity(intent)
        }
        webView = findViewById(R.id.webView)
        webView.setOnClickListener {
            var intent = Intent(this, WebPage::class.java)
            startActivity(intent)
        }
    }
}