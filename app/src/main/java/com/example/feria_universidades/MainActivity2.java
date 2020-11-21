package com.example.feria_universidades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button home;
    private Button uni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_vocacional);
        WebView myWebView = (WebView) findViewById(R.id.test);
        myWebView.loadUrl("https://www.elegircarrera.net/test-vocacional.aspx");


    }


}