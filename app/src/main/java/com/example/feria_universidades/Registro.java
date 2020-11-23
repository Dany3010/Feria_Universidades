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

public class Registro extends AppCompatActivity {
    EditText nom, ape_p,ape_m,tel,prepa,prom_final,correo,pass;
    ImageView btn2;
    Button btnRegistar;
    String a1,a2,a3,a4,a5,a6,a7,a8;
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
                    ejecutarServicio("http://feria-universitaria.tk/android/registrar_usuario.php");
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


    private void ejecutarServicio(String URL){
        StringRequest stringRequest= new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "USUARIO REGISTRADO", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
                finish();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> parametros= new HashMap<String, String>();
                parametros.put("nom",nom.getText().toString());
                parametros.put("ape_p",ape_p.getText().toString());
                parametros.put("ape_m",ape_m.getText().toString());
                parametros.put("tel",tel.getText().toString());
                parametros.put("prepa",prepa.getText().toString());
                parametros.put("prom_final",prom_final.getText().toString());
                parametros.put("correo",correo.getText().toString());
                parametros.put("pass",pass.getText().toString());
                return parametros;
            }


        };
         RequestQueue requestQueue= Volley.newRequestQueue(this);
         requestQueue.add(stringRequest);
    }








}