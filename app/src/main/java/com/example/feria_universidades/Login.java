package com.example.feria_universidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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

import static com.android.volley.Request.*;

public class Login extends AppCompatActivity {


    EditText edtUsuario, edtPassword;
    Button btnLogin;
    String usuario, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtUsuario=findViewById(R.id.username);
        edtPassword=findViewById(R.id.password);
        btnLogin=findViewById(R.id.btn_login);
recuperarPreferencias();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario=edtUsuario.getText().toString();
                password=edtPassword.getText().toString();
                if (!usuario.isEmpty() && !password.isEmpty()){
                validarUsuario("https://feria-universidades2020.000webhostapp.com/android/validar_usuario.php");
            }else{Toast.makeText(Login.this, "No se permiten campos vacios",Toast.LENGTH_SHORT).show();}
            }
        });
    }

    private void validarUsuario(String URL){
        StringRequest stringRequest = new StringRequest(Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
               if (!response.isEmpty()){
                   guardarPreferencias();
                   Intent intent = new Intent(getApplicationContext(),Feria_universitaria.class);
                   startActivity(intent);
                   finish();
            }else {
                   Toast.makeText(Login.this, "Usuario o contraseña incorrecta",Toast.LENGTH_SHORT).show();
               }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(Login.this, error.toString(),Toast.LENGTH_SHORT).show();
            }
        }
        ){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> parametros= new HashMap<String, String>();
                parametros.put("usuario",usuario);
                parametros.put("password",password);
                return parametros;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
    private void guardarPreferencias(){
        SharedPreferences preferences=getSharedPreferences("preferenciasLogin", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferences.edit();
        editor.putString("usuario",usuario);
        editor.putString("password",password);
        editor.putBoolean("sesion",true);
        editor.commit();
    }
    private void recuperarPreferencias(){
        SharedPreferences preferences=getSharedPreferences("preferenciasLogin", Context.MODE_PRIVATE);
        edtUsuario.setText(preferences.getString("usuario",""));
        edtPassword.setText(preferences.getString("password",""));
    }
}