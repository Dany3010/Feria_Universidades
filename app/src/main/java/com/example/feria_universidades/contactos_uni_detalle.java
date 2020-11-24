package com.example.feria_universidades;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class contactos_uni_detalle extends AppCompatActivity {
    ImageView imagen_uni;
    TextView recibidor,recibidor2;
    Button face,twit,b_web,mail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos_uni_detalle);
        Bundle bundle = getIntent().getExtras();
        String valor =bundle.getString("universidad3");
        recibidor= (TextView) findViewById(R.id.tituloUni_contactos);
        recibidor2= (TextView) findViewById(R.id.subtituloUni_contact_map);
        imagen_uni = (ImageView)findViewById(R.id.imagenUni_contacto);

        face= (Button)findViewById(R.id.facebook);
        twit= (Button)findViewById(R.id.twitter);
        b_web= (Button)findViewById(R.id.buscador_web);
        mail= (Button)findViewById(R.id.correo);


        if (valor.equals("uni_itzm_contac")){
            recibidor.setText("Instituto Tecnológico de la Zona Maya");
            imagen_uni.setImageResource(R.drawable.itzm);
            recibidor2.setText("Carretera Chetumal – Escárcega Km. 21.5 Ejido Juan Sarabia, Quintana Roo, C.P. 77965");


        }
    }
}