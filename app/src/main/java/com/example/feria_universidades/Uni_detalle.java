package com.example.feria_universidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Uni_detalle extends AppCompatActivity {
  ImageView imagen_uni;
  TextView recibidor;
  Context context;
  Button videos,fotos,becas,admision,ofertas,contactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni_detalle);
        context=this;
        Bundle bundle = getIntent().getExtras();
        String valor =bundle.getString("uni");
        imagen_uni = (ImageView)findViewById(R.id.imagenUni);
        recibidor= (TextView) findViewById(R.id.titulo_uni);


        videos =(Button)findViewById(R.id.videos_uni);
        fotos =(Button)findViewById(R.id.fotos_uni);
        becas =(Button)findViewById(R.id.becas_uni);
        admision =(Button)findViewById(R.id.proceso);
        ofertas =(Button)findViewById(R.id.ofertas_uni);
        contactos =(Button)findViewById(R.id.contactos_uni);


        /////OTHON P. BLANCO////////
        if (valor.equals("uni_itzm")){
            recibidor.setText("Instituto Tecnológico de la Zona Maya");
            imagen_uni.setImageResource(R.drawable.itzm);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","uni_itzm_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","uni_itzm_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","uni_itzm_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","uni_itzm_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","uni_itzm_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","uni_itzm_ofertas");
                    startActivity(univerisdad);
                }
            });
        }
        if (valor.equals("uni_cudv")){
            recibidor.setText("Centro Universitario de Desarrollo Vanguardista");
            imagen_uni.setImageResource(R.drawable.cudv_1);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","uni_cudv_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","uni_cudv_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","uni_cudv_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","uni_cudv_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","uni_cudv_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","uni_cudv_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("unid_chetumal")){
            recibidor.setText("Universidad Interamericana para el  Desarrollo Campus Chetumal");
            imagen_uni.setImageResource(R.drawable.unid_chetumal);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","unid_chetumal_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","unid_chetumal_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","unid_chetumal_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","unid_chetumal_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","unid_chetumal_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","unid_chetumal_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("modelo_chetumal")){
            recibidor.setText("Universidad Modelo");
            imagen_uni.setImageResource(R.drawable.uni_modelo_chetumal);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","modelo_chetumal_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","modelo_chetumal_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","modelo_chetumal_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","modelo_chetumal_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","modelo_chetumal_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","modelo_chetumal_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("uni_wozniak")){
            recibidor.setText("Instituto de Estudios Superiores Wozniak");
            imagen_uni.setImageResource(R.drawable.wozniak);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","uni_wozniak_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","uni_wozniak_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","uni_wozniak_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","uni_wozniak_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","uni_wozniak_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","uni_wozniak_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("uqroo_chetumal")){
            recibidor.setText("Universidad de Quintana Roo Campo Chetumal");
            imagen_uni.setImageResource(R.drawable.uqroo);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","uqroo_chetumal_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","uqroo_chetumal_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","uqroo_chetumal_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","uqroo_chetumal_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","uqroo_chetumal_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","uqroo_chetumal_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("ut_chetumal")){
            recibidor.setText("Universidad Tecnológica de Chetumal");
            imagen_uni.setImageResource(R.drawable.ut_chetumal);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","ut_chetumal_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","ut_chetumal_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","ut_chetumal_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","ut_chetumal_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","ut_chetumal_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","ut_chetumal_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        ///////BACALAR/////////
        if (valor.equals("politec_bacalar")){
            recibidor.setText("Universidad Politécnica de Bacalar");
            imagen_uni.setImageResource(R.drawable.uni_poli_bacalar);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","politec_bacalar_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","politec_bacalar_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","politec_bacalar_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","politec_bacalar_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","politec_bacalar_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","politec_bacalar_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("centro_edu_bacalar")){
            recibidor.setText("Centro Regional de Educación Normal Lic. Javier Rojo Gómez");
            imagen_uni.setImageResource(R.drawable.centro_regio_edu_bacalar);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","edu_bacalar_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","edu_bacalar_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","edu_bacalar_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","edu_bacalar_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","edu_bacalar_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","edu_bacalar_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        /////FELIPE CARRILLO PUERTO////////
        if (valor.equals("upp")){
            recibidor.setText("Universidad Privada de la Península");
            imagen_uni.setImageResource(R.drawable.upp);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","upp_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","upp_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","upp_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","upp_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","upp_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","upp_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("inst_tec_felipe_c")){
            recibidor.setText("Instituto Tecnológico Superior de Felipe Carrillo Puerto");
            imagen_uni.setImageResource(R.drawable.inst_tec_felipe_c);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","inst_tec_felipe_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","inst_tec_felipe_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","inst_tec_felipe_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","inst_tec_felipe_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","inst_tec_felipe_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.carrillopuerto.tecnm.mx/index.php/oferta-academica/unidad-acad-fcp#tab";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

        }
        /////JOSE MARIA MORELOS///////
        if (valor.equals("uimqroo")){
            recibidor.setText("Universidad Intercultural Maya de Quintana Roo");
            imagen_uni.setImageResource(R.drawable.uimqroo);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","uimqroo_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","uimqroo_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","uimqroo_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","uimqroo_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","uimqroo_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","uimqroo_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        /////SOLIDARIDAD///////
        if (valor.equals("UniversidadSur_soli")){
            recibidor.setText("Universidad del Sur Campus Playa del Carmen");
            imagen_uni.setImageResource(R.drawable.universidadsur_solidaridad);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","unisur_soli_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","unisur_soli_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","unisur_soli_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","unisur_soli_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","unisur_soli_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","unisur_soli_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("universidadriviera_soli")){
            recibidor.setText("Universidad Riviera");
            imagen_uni.setImageResource(R.drawable.universidadriviera_solidaridad);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","uniriviera_soli_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","uniriviera_soli_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","uniriviera_soli_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","uniriviera_soli_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","uniriviera_soli_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","uniriviera_soli_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("ut_rivieramaya_soli")){
            recibidor.setText("Universidad Tecnológica Riviera Maya");
            imagen_uni.setImageResource(R.drawable.ut_rivieramaya_solidaridad);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","ut_rivieramaya_soli_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","ut_rivieramaya_soli_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","ut_rivieramaya_soli_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","ut_rivieramaya_soli_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","ut_rivieramaya_soli_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","ut_rivieramaya_soli_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("unid_soli")){
            recibidor.setText("Universidad Interamericana para el Desarrollo Campus Playa del Carmen");
            imagen_uni.setImageResource(R.drawable.unid_solidaridad);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","unid_soli_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","unid_soli_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","unid_soli_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","unid_soli_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","unid_soli_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","unid_soli_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("esc_enfermeria_soli")){
            recibidor.setText("Escuela de enfermería Ignacio Chávez");
            imagen_uni.setImageResource(R.drawable.esc_enfermeria_solidaridad);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","esc_enfermeria_soli_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","esc_enfermeria_soli_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","esc_enfermeria_soli_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","esc_enfermeria_soli_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","esc_enfermeria_soli_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","esc_enfermeria_soli_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        /////COZUMEL///////
        if (valor.equals("inst_partenon_cozumel")){
            recibidor.setText("Instituto Partenón de Cozumel");
            imagen_uni.setImageResource(R.drawable.inst_partenon_cozumel);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","inst_partenon_cozumel_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","inst_partenon_cozumel_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","inst_partenon_cozumel_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","inst_partenon_cozumel_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","inst_partenon_cozumel_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","inst_partenon_cozumel_ofertas");
                    startActivity(univerisdad);
                }
            });

        }

        /////BENITO JUÁREZ///////
        if (valor.equals("upqroo_benito_juarez")){
            recibidor.setText("Universidad Politécnica de Quintana Roo");
            imagen_uni.setImageResource(R.drawable.upqroo_benito_juarez);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","upqroo_benito_juarez_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","upqroo_benito_juarez_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","upqroo_benito_juarez_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","upqroo_benito_juarez_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","upqroo_benito_juarez_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","upqroo_benito_juarez_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("ut_benito_juarez")){
            recibidor.setText("Universidad Tecnológica de Cancún");
            imagen_uni.setImageResource(R.drawable.ut_benito_juarez);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","ut_benito_juarez_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","ut_benito_juarez_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","ut_benito_juarez_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","ut_benito_juarez_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","ut_benito_juarez_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","ut_benito_juarez_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("uni_henbord_benito_juarez")){
            recibidor.setText("Universidad Henbord");
            imagen_uni.setImageResource(R.drawable.uni_henbord_benito_juarez);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","henbord_benito_juarez_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","henbord_benito_juarez_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","henbord_benito_juarez_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","henbord_benito_juarez_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","henbord_benito_juarez_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","henbord_benito_juarez_ofertas");
                    startActivity(univerisdad);
                }
            });

        }

        if (valor.equals("uni_azteca_benito_juarez")){
            recibidor.setText("Universidad Azteca");
            imagen_uni.setImageResource(R.drawable.uni_azteca_benito_juarez);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","uni_azteca_benito_juarez_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","uni_azteca_benito_juarez_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","uni_azteca_benito_juarez_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","uni_azteca_benito_juarez_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","uni_azteca_benito_juarez_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","uni_azteca_benito_juarez_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("inst_humanista_gestalt_benito_juarez")){
            recibidor.setText("Instituto Humanista de Psicoterapia Gestalt");
            imagen_uni.setImageResource(R.drawable.inst_humanista_gestalt_benito_juarez);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","inst_humanista_benito_juarez_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","inst_humanista_benito_juarez_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","inst_humanista_juarez_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","inst_humanista_benito_juarez_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","inst_humanista_benito_juarez_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","inst_humanista_benito_juarez_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("la_salle_benito_juarez")){
            recibidor.setText("La Salle Campus Cancún");
            imagen_uni.setImageResource(R.drawable.la_salle_benito_juarez);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","la_salle_benito_juarez_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","la_salle_benito_juarez_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","la_salle_juarez_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","la_salle_benito_juarez_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","la_salle_benito_juarez_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","la_salle_benito_juarez_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("centro_gestalt_benito_juarez")){
            recibidor.setText("Cento de Estudios Gestalt");
            imagen_uni.setImageResource(R.drawable.centro_gestalt_benito_juarez);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","centro_gestalt_benito_juarez_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","centro_gestalt_benito_juarez_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","centro_gestalt_juarez_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","centro_gestalt_benito_juarez_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","centro_gestalt_benito_juarez_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","centro_gestalt_benito_juarez_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("unisur_benito_juarez")){
            recibidor.setText("Universidad del Sur Campus Cancún");
            imagen_uni.setImageResource(R.drawable.unisur_benito_juarez);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","unisur_benito_juarez_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","unisur_benito_juarez_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","unisur_juarez_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","unisur_benito_juarez_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","unisur_benito_juarez_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","unisur_benito_juarez_ofertas");
                    startActivity(univerisdad);
                }
            });

        }
        if (valor.equals("instituto_sup_leyes_benito_juarez")){
            recibidor.setText("Instituto Superior de Leyes");
            imagen_uni.setImageResource(R.drawable.instituto_sup_leyes_benito_juarez);

            contactos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, contactos_uni_detalle.class);
                    univerisdad.putExtra("universidad","sup_leyes_benito_juarez_contac");
                    startActivity(univerisdad);
                }
            });
            videos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, videos_detalle.class);
                    univerisdad.putExtra("universidad1","sup_leyes_benito_juarez_videos");
                    startActivity(univerisdad);
                }
            });
            fotos.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, fotos_detalles.class);
                    univerisdad.putExtra("universidad2","sup_leyes_juarez_fotos");
                    startActivity(univerisdad);
                }
            });
            becas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Becas_uni_detalle.class);
                    univerisdad.putExtra("universidad3","sup_leyes_benito_juarez_becas");
                    startActivity(univerisdad);
                }
            });
            admision.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Admision_uni_detalle.class);
                    univerisdad.putExtra("universidad4","sup_leyes_benito_juarez_admis");
                    startActivity(univerisdad);
                }
            });
            ofertas.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    Intent univerisdad = new Intent(context, Ofertas_uni_detalle.class);
                    univerisdad.putExtra("universidad5","sup_leyes_benito_juarez_ofertas");
                    startActivity(univerisdad);
                }
            });

        }

    }

}