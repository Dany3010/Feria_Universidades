package com.example.feria_universidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
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

public class VerificationActivity_1 extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    String t1,t2,t3,t4,txtcodigo;
Button finalizar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verification_1);
        enviasms("http://feria-universitaria.tk/android/testAltiriaSms.php");
        e1=findViewById(R.id.n1);
        e2=findViewById(R.id.n2);
        e3=findViewById(R.id.n3);
        e4=findViewById(R.id.n4);
        finalizar=findViewById(R.id.btn_confirmar);
finalizar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        t1=e1.getText().toString();
        t2=e2.getText().toString();
        t3=e3.getText().toString();
        t4=e4.getText().toString();
        txtcodigo=t1+t2+t3+t4;
        String a=getIntent().getStringExtra("codigo");
        if (a.equals(txtcodigo)){
            ejecutarServicio("http://feria-universitaria.tk/android/registrar_usuario.php");
        }else{
            Toast.makeText(VerificationActivity_1.this, "Error",Toast.LENGTH_SHORT).show();}
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
                parametros.put("nom",getIntent().getStringExtra("nom"));
                parametros.put("ape_p",getIntent().getStringExtra("ape_p"));
                parametros.put("ape_m",getIntent().getStringExtra("ape_m"));
                parametros.put("tel",getIntent().getStringExtra("tel"));
                parametros.put("prepa",getIntent().getStringExtra("prepa"));
                parametros.put("prom_final",getIntent().getStringExtra("prom_final"));
                parametros.put("correo",getIntent().getStringExtra("correo"));
                parametros.put("pass",getIntent().getStringExtra("pass"));
                return parametros;
            }


        };
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }


    private void enviasms(String URL){
        StringRequest stringRequest= new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "Codigo enviado", Toast.LENGTH_SHORT).show();
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
                parametros.put("codigo",getIntent().getStringExtra("codigo"));
                parametros.put("numero",getIntent().getStringExtra("tel"));
                return parametros;
            }


        };
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}
