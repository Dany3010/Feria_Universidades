package com.example.feria_universidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.app.Fragment;
import android.app.FragmentTransaction;

import com.example.feria_universidades.ui.home.HomeFragment;

public class MainActivity2 extends AppCompatActivity {
    private Button home;
    private Button uni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        WebView myWebView = (WebView) findViewById(R.id.test);
        myWebView.loadUrl("https://www.elegircarrera.net/test-vocacional.aspx");


    }


}