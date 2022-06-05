package com.example.myapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebView

class WebViewPage : AppCompatActivity() {
    var url = "https://www.journaldev.com"
    lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.web_screen)
        webView = findViewById(R.id.webPage)
        webView.settings.javaScriptEnabled = true
        webView.loadUrl(url)

    }
}