package com.example.myapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView

class WebPage : AppCompatActivity() {
    lateinit var webView: WebView
    var url = "https://www.journaldev.com"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.web_view)
        webView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.loadUrl(url)

    }
}