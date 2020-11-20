package com.example.feria_universidades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Uni_detalle extends AppCompatActivity {
  ImageView imagen_uni;
  TextView recibidor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uni_detalle);

        Bundle bundle = getIntent().getExtras();
        String valor =bundle.getString("uni");
        imagen_uni = (ImageView)findViewById(R.id.imagenUni);
        recibidor= (TextView) findViewById(R.id.titulo_uni);

        /////OTHON P. BLANCO////////
        if (valor.equals("uni_itzm")){
            recibidor.setText("Instituto Tecnológico de la Zona Maya");
            imagen_uni.setImageResource(R.drawable.itzm);
        }
        if (valor.equals("uni_cudv")){
            recibidor.setText("Centro Universitario de Desarrollo Vanguardista");
            imagen_uni.setImageResource(R.drawable.cudv_1);
        }
        if (valor.equals("unid_chetumal")){
            recibidor.setText("Universidad Interamericana para el  Desarrollo Campus Chetumal");
            imagen_uni.setImageResource(R.drawable.unid_chetumal);
        }
        if (valor.equals("modelo_chetumal")){
            recibidor.setText("Universidad Modelo");
            imagen_uni.setImageResource(R.drawable.uni_modelo_chetumal);
        }
        if (valor.equals("uni_wozniak")){
            recibidor.setText("Instituto de Estudios Superiores Wozniak");
            imagen_uni.setImageResource(R.drawable.wozniak);
        }
        if (valor.equals("uqroo_chetumal")){
            recibidor.setText("Universidad de Quintana Roo Campo Chetumal");
            imagen_uni.setImageResource(R.drawable.uqroo);
        }
        if (valor.equals("ut_chetumal")){
            recibidor.setText("Universidad Tecnológica de Chetumal");
            imagen_uni.setImageResource(R.drawable.ut_chetumal);
        }
        ///////BACALAR/////////
        if (valor.equals("politec_bacalar")){
            recibidor.setText("Universidad Politécnica de Bacalar");
            imagen_uni.setImageResource(R.drawable.uni_poli_bacalar);
        }
        if (valor.equals("centro_edu_bacalar")){
            recibidor.setText("Centro Regional de Educación Normal Lic. Javier Rojo Gómez");
            imagen_uni.setImageResource(R.drawable.centro_regio_edu_bacalar);
        }
        /////FELIPE CARRILLO PUERTO////////
        if (valor.equals("upp")){
            recibidor.setText("Universidad Privada de la Península");
            imagen_uni.setImageResource(R.drawable.upp);
        }
        if (valor.equals("inst_tec_felipe_c")){
            recibidor.setText("Instituto Tecnológico Superior de Felipe Carrillo Puerto");
            imagen_uni.setImageResource(R.drawable.inst_tec_felipe_c);
        }
        /////JOSE MARIA MORELOS///////
        if (valor.equals("uimqroo")){
            recibidor.setText("Universidad Intercultural Maya de Quintana Roo");
            imagen_uni.setImageResource(R.drawable.uimqroo);
        }
        /////SOLIDARIDAD///////
        if (valor.equals("UniversidadSur_soli")){
            recibidor.setText("Universidad del Sur Campus Playa del Carmen");
            imagen_uni.setImageResource(R.drawable.universidadsur_solidaridad);
        }
        if (valor.equals("universidadriviera_soli")){
            recibidor.setText("Universidad Riviera");
            imagen_uni.setImageResource(R.drawable.universidadriviera_solidaridad);
        }
        if (valor.equals("ut_rivieramaya_soli")){
            recibidor.setText("Universidad Tecnológica Riviera Maya");
            imagen_uni.setImageResource(R.drawable.ut_rivieramaya_solidaridad);
        }
        if (valor.equals("unid_soli")){
            recibidor.setText("Universidad Interamericana para el Desarrollo Campus Playa del Carmen");
            imagen_uni.setImageResource(R.drawable.unid_solidaridad);
        }
        if (valor.equals("esc_enfermeria_soli")){
            recibidor.setText("Escuela de enfermería Ignacio Chávez");
            imagen_uni.setImageResource(R.drawable.esc_enfermeria_solidaridad);
        }
        /////COZUMEL///////
        if (valor.equals("inst_partenon_cozumel")){
            recibidor.setText("Instituto Partenón de Cozumel");
            imagen_uni.setImageResource(R.drawable.inst_partenon_cozumel);
        }

        /////BENITO JUÁREZ///////
        if (valor.equals("upqroo_benito_juarez")){
            recibidor.setText("Universidad Politécnica de Quintana Roo");
            imagen_uni.setImageResource(R.drawable.upqroo_benito_juarez);
        }
        if (valor.equals("ut_benito_juarez")){
            recibidor.setText("Universidad Tecnológica de Cancún");
            imagen_uni.setImageResource(R.drawable.ut_benito_juarez);
        }
        if (valor.equals("uni_henbord_benito_juarez")){
            recibidor.setText("Universidad Henbord");
            imagen_uni.setImageResource(R.drawable.uni_henbord_benito_juarez);
        }
        if (valor.equals("uni_azteca_benito_juarez")){
            recibidor.setText("Universidad Azteca");
            imagen_uni.setImageResource(R.drawable.uni_azteca_benito_juarez);
        }
        if (valor.equals("inst_humanista_gestalt_benito_juarez")){
            recibidor.setText("Instituto Humanista de Psicoterapia Gestalt");
            imagen_uni.setImageResource(R.drawable.inst_humanista_gestalt_benito_juarez);
        }
        if (valor.equals("la_salle_benito_juarez")){
            recibidor.setText("La Salle Campus Cancún");
            imagen_uni.setImageResource(R.drawable.la_salle_benito_juarez);
        }
        if (valor.equals("centro_gestalt_benito_juarez")){
            recibidor.setText("Cento de Estudios Gestalt");
            imagen_uni.setImageResource(R.drawable.centro_gestalt_benito_juarez);
        }
        if (valor.equals("unisur_benito_juarez")){
            recibidor.setText("Universidad del Sur Campus Cancún");
            imagen_uni.setImageResource(R.drawable.unisur_benito_juarez);
        }
        if (valor.equals("instituto_sup_leyes_benito_juarez")){
            recibidor.setText("Instituto Superior de Leyes");
            imagen_uni.setImageResource(R.drawable.instituto_sup_leyes_benito_juarez);
        }
    }
}