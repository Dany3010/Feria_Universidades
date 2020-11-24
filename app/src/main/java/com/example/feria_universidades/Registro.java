package com.example.feria_universidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Registro extends AppCompatActivity {
    EditText nom, ape_p,ape_m,tel,prepa,prom_final,correo,pass;
    ImageView btn2;
    Button btnRegistar;
    String a1,a2,a3,a4,a5,a6,a7,a8,codigo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        nom=findViewById(R.id.username2);
        ape_p=findViewById(R.id.username3);
        ape_m=findViewById(R.id.username4);
        tel=findViewById(R.id.username5);
        prepa=findViewById(R.id.username6);
        prom_final=findViewById(R.id.username7);
        correo=findViewById(R.id.username);
        pass=findViewById(R.id.password);
        btnRegistar=findViewById(R.id.btn_registro);
        Random random= new Random();
        int numRandom= random.nextInt(9999) ;
        codigo=String.valueOf(numRandom);
        btnRegistar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a1=nom.getText().toString();
                a2=ape_p.getText().toString();
                a3=ape_m.getText().toString();
                a4=tel.getText().toString();
                a5=prepa.getText().toString();
                a6=prom_final.getText().toString();
                a7=correo.getText().toString();
                a8=pass.getText().toString();

                if (!a1.isEmpty() && !a2.isEmpty() && !a3.isEmpty() && !a4.isEmpty() && !a5.isEmpty() && !a6.isEmpty() && !a7.isEmpty() && !a8.isEmpty() ){
                    Intent intent = new Intent(getApplicationContext(),VerificationActivity_1.class);
                    intent.putExtra("nom",a1);
                    intent.putExtra("ape_p",a2);
                    intent.putExtra("ape_m",a3);
                    intent.putExtra("tel",a4);
                    intent.putExtra("prepa",a5);
                    intent.putExtra("prom_final",a6);
                    intent.putExtra("correo",a7);
                    intent.putExtra("pass",a8);
                    intent.putExtra("codigo",codigo);
                    startActivity(intent);

                }else{Toast.makeText(Registro.this, "No se permiten campos vacios",Toast.LENGTH_SHORT).show();}

            }
        });
        btn2=(ImageView)findViewById(R.id.imageView3);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
                finish();
            }
        });
    }











}