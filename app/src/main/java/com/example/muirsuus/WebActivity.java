package com.example.muirsuus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView reg = (WebView)findViewById(R.id.web);
        reg.setWebViewClient(new WebViewClient());
        reg.loadUrl("http://www.google.com");
    }
}
