package com.example.feria_universidades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
     Button home , fin;
    Button uni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_vocacional);
        WebView myWebView = (WebView) findViewById(R.id.test);
        myWebView.loadUrl("https://www.elegircarrera.net/test-vocacional.aspx");
        fin=findViewById(R.id.button2);

        fin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myWebView.loadUrl("https://www.elegircarrera.net/Test/ResultadoPrueba.aspx");
            }
        });

    }


}