package com.example.feria_universidades.ui.profile;

import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.feria_universidades.Feria_universitaria;
import com.example.feria_universidades.Login;
import com.example.feria_universidades.PresentacionActivity;
import com.example.feria_universidades.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;


public class profile extends Fragment {
Button btnCerrar;
    EditText edtUsuario, edtPassword,promedio,numero,escuela;
    TextView nombre;

    private ProfileViewModel mViewModel;


    public static profile newInstance() {
        return new profile();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.profile_fragment, container, false);
        edtUsuario=root.findViewById(R.id.correo);
        edtPassword=root.findViewById(R.id.password);
promedio=(EditText) root.findViewById(R.id.promedio);
        nombre=(TextView)root.findViewById(R.id.nombre);
        numero=(EditText) root.findViewById(R.id.numero);
        escuela=(EditText) root.findViewById(R.id.escuela);
btnCerrar=root.findViewById(R.id.button);
        recuperarPreferencias();



btnCerrar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        SharedPreferences preferences = getActivity().getSharedPreferences("preferenciasLogin", Context.MODE_PRIVATE);
        preferences.edit().clear().commit();
        Intent intent =new Intent(getActivity().getApplicationContext(), PresentacionActivity.class);
        startActivity(intent);
       getActivity().finish();
    }
});


        return root;
    }




    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ProfileViewModel.class);

    }

    private void recuperarPreferencias(){

        SharedPreferences preferences = getActivity().getSharedPreferences("preferenciasLogin", Context.MODE_PRIVATE);
        edtUsuario.setText(preferences.getString("usuario",""));
        edtPassword.setText(preferences.getString("password",""));
        nombre.setText(preferences.getString("nombre",""));
        numero.setText(preferences.getString("numero",""));
        escuela.setText(preferences.getString("escuela",""));
        promedio.setText(preferences.getString("promedio",""));
    }


}