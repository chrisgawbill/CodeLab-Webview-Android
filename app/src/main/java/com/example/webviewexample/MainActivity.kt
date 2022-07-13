package com.example.webviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    lateinit var webView:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.webView)
        var webSettings:WebSettings = webView.settings
        webSettings.javaScriptEnabled = true

        webView.webViewClient = WebViewClient()

        webView.loadUrl("https://www.google.com")

    }
}