package com.example.feria_universidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.net.URL;

public class fotos_detalles extends AppCompatActivity {
    Context context;
    TextView recibidor,recibidor2;
    ImageView imagen_f1,imagen_f2,imagen_f3,imagen_f4,imagen_f5,imagen_uni;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotos_detalles);

        Bundle bundle = getIntent().getExtras();
        String valor =bundle.getString("universidad2");
        imagen_uni = (ImageView)findViewById(R.id.imagenUni_F);
        recibidor= (TextView) findViewById(R.id.tituloUni);
        recibidor2= (TextView) findViewById(R.id.subtituloUni);


        imagen_f1 = (ImageView)findViewById(R.id.imagen_uni_F);
        imagen_f2 = (ImageView)findViewById(R.id.imagen_uni_F2);
        imagen_f3 = (ImageView)findViewById(R.id.imagen_uni_F3);
        imagen_f4 = (ImageView)findViewById(R.id.imagen_uni_F4);
        imagen_f5 = (ImageView)findViewById(R.id.imagen_uni_F5);


        if (valor.equals("uni_itzm_fotos")){
            recibidor.setText("Instituto Tecnológico de la Zona Maya");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.itzm);

            imagen_f1.setImageResource(R.drawable.uni_1);
            imagen_f2.setImageResource(R.drawable.uni_2);
            imagen_f3.setImageResource(R.drawable.uni_3);
            imagen_f4.setImageResource(R.drawable.uni_4);
            imagen_f5.setImageResource(R.drawable.uni_5);

        }

        if (valor.equals("uni_cudv_fotos")){
            recibidor.setText("Centro Universitario de Desarrollo Vanguardista");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.itzm);

            imagen_f1.setImageResource(R.drawable.uni_6);
            imagen_f2.setImageResource(R.drawable.uni_7);
            imagen_f3.setImageResource(R.drawable.uni_8);
            imagen_f4.setImageResource(R.drawable.uni_9);
            imagen_f5.setImageResource(R.drawable.uni_10);

        }

        if (valor.equals("unid_chetumal_fotos")){
            recibidor.setText("Universidad Interamericana para el  Desarrollo Campus Chetumal");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.itzm);

            imagen_f1.setImageResource(R.drawable.uni_11);
            imagen_f2.setImageResource(R.drawable.uni_12);
            imagen_f3.setImageResource(R.drawable.uni_13);
            imagen_f4.setImageResource(R.drawable.uni_14);
            imagen_f5.setImageResource(R.drawable.uni_15);

        }
        if (valor.equals("modelo_chetumal_fotos")){
            recibidor.setText("Universidad Modelo");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.itzm);

            imagen_f1.setImageResource(R.drawable.uni_16);
            imagen_f2.setImageResource(R.drawable.uni_17);
            imagen_f3.setImageResource(R.drawable.uni_18);
            imagen_f4.setImageResource(R.drawable.uni_19);
            imagen_f5.setImageResource(R.drawable.uni_20);

        }
        if (valor.equals("uni_wozniak_fotos")){
            recibidor.setText("Instituto de Estudios Superiores Wozniak");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.itzm);

            imagen_f1.setImageResource(R.drawable.uni_21);
            imagen_f2.setImageResource(R.drawable.uni_22);
            imagen_f3.setImageResource(R.drawable.uni_23);
            imagen_f4.setImageResource(R.drawable.uni_24);
            imagen_f5.setImageResource(R.drawable.uni_25);

        }
        if (valor.equals("uqroo_chetumal_fotos")){
            recibidor.setText("Universidad de Quintana Roo Campo Chetumal");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.itzm);

            imagen_f1.setImageResource(R.drawable.uni_26);
            imagen_f2.setImageResource(R.drawable.uni_27);
            imagen_f3.setImageResource(R.drawable.uni_28);
            imagen_f4.setImageResource(R.drawable.uni_29);
            imagen_f5.setImageResource(R.drawable.uni_30);

        }
        if (valor.equals("ut_chetumal")){
            recibidor.setText("Universidad Tecnológica de Chetumal");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.itzm);

            imagen_f1.setImageResource(R.drawable.uni_31);
            imagen_f2.setImageResource(R.drawable.uni_32);
            imagen_f3.setImageResource(R.drawable.uni_33);
            imagen_f4.setImageResource(R.drawable.uni_34);
            imagen_f5.setImageResource(R.drawable.uni_35);

        }

    }

}
