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
            imagen_uni.setImageResource(R.drawable.cudv_1);

            imagen_f1.setImageResource(R.drawable.uni_6);
            imagen_f2.setImageResource(R.drawable.uni_7);
            imagen_f3.setImageResource(R.drawable.uni_8);
            imagen_f4.setImageResource(R.drawable.uni_9);
            imagen_f5.setImageResource(R.drawable.uni_10);

        }

        if (valor.equals("unid_chetumal_fotos")){
            recibidor.setText("Universidad Interamericana para el  Desarrollo Campus Chetumal");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.unid_chetumal);

            imagen_f1.setImageResource(R.drawable.uni_11);
            imagen_f2.setImageResource(R.drawable.uni_12);
            imagen_f3.setImageResource(R.drawable.uni_13);
            imagen_f4.setImageResource(R.drawable.uni_14);
            imagen_f5.setImageResource(R.drawable.uni_15);

        }
        if (valor.equals("modelo_chetumal_fotos")){
            recibidor.setText("Universidad Modelo");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.uni_modelo_chetumal);

            imagen_f1.setImageResource(R.drawable.uni_16);
            imagen_f2.setImageResource(R.drawable.uni_17);
            imagen_f3.setImageResource(R.drawable.uni_18);
            imagen_f4.setImageResource(R.drawable.uni_19);
            imagen_f5.setImageResource(R.drawable.uni_20);

        }
        if (valor.equals("uni_wozniak_fotos")){
            recibidor.setText("Instituto de Estudios Superiores Wozniak");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.wozniak);

            imagen_f1.setImageResource(R.drawable.uni_21);
            imagen_f2.setImageResource(R.drawable.uni_22);
            imagen_f3.setImageResource(R.drawable.uni_23);
            imagen_f4.setImageResource(R.drawable.uni_24);
            imagen_f5.setImageResource(R.drawable.uni_25);

        }
        if (valor.equals("uqroo_chetumal_fotos")){
            recibidor.setText("Universidad de Quintana Roo Campo Chetumal");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.uqroo);

            imagen_f1.setImageResource(R.drawable.uni_26);
            imagen_f2.setImageResource(R.drawable.uni_27);
            imagen_f3.setImageResource(R.drawable.uni_28);
            imagen_f4.setImageResource(R.drawable.uni_29);
            imagen_f5.setImageResource(R.drawable.uni_30);

        }
        if (valor.equals("ut_chetumal_fotos")){
            recibidor.setText("Universidad Tecnológica de Chetumal");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.ut_chetumal);

            imagen_f1.setImageResource(R.drawable.uni_31);
            imagen_f2.setImageResource(R.drawable.uni_32);
            imagen_f3.setImageResource(R.drawable.uni_33);
            imagen_f4.setImageResource(R.drawable.uni_34);
            imagen_f5.setImageResource(R.drawable.uni_35);

        }
        ///////BACALAR/////////

        if (valor.equals("politec_bacalar_fotos")){
            recibidor.setText("Universidad Politécnica de Bacalar");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.uni_poli_bacalar);

            imagen_f1.setImageResource(R.drawable.uni_36);
            imagen_f2.setImageResource(R.drawable.uni_37);
            imagen_f3.setImageResource(R.drawable.uni_38);
            imagen_f4.setImageResource(R.drawable.uni_39);
            imagen_f5.setImageResource(R.drawable.uni_40);
        }
        if (valor.equals("edu_bacalar_fotos")){
            recibidor.setText("Centro Regional de Educación Normal Lic. Javier Rojo Gómez");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.centro_regio_edu_bacalar);

            imagen_f1.setImageResource(R.drawable.uni_41);
            imagen_f2.setImageResource(R.drawable.uni_42);
            imagen_f3.setImageResource(R.drawable.uni_43);
            imagen_f4.setImageResource(R.drawable.uni_44);
            imagen_f5.setImageResource(R.drawable.uni_45);
        }
        /////FELIPE CARRILLO PUERTO////////
        if (valor.equals("upp_fotos")){
            recibidor.setText("Universidad Privada de la Península");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.upp);

            imagen_f1.setImageResource(R.drawable.uni_46);
            imagen_f2.setImageResource(R.drawable.uni_47);
            imagen_f3.setImageResource(R.drawable.uni_48);
            imagen_f4.setImageResource(R.drawable.uni_49);
            imagen_f5.setImageResource(R.drawable.uni_50);
        }
        if (valor.equals("inst_tec_felipe_fotos")){
            recibidor.setText("Instituto Tecnológico Superior de Felipe Carrillo Puerto");
            imagen_uni.setImageResource(R.drawable.inst_tec_felipe_c);
            recibidor2.setText("FOTOS");


            imagen_f1.setImageResource(R.drawable.uni_51);
            imagen_f2.setImageResource(R.drawable.uni_52);
            imagen_f3.setImageResource(R.drawable.uni_53);
            imagen_f4.setImageResource(R.drawable.uni_54);
            imagen_f5.setImageResource(R.drawable.uni_55);
        }
        /////JOSE MARIA MORELOS///////
        if (valor.equals("uimqroo_fotos")){
            recibidor.setText("Universidad Intercultural Maya de Quintana Roo");
            imagen_uni.setImageResource(R.drawable.uimqroo);
            recibidor2.setText("FOTOS");


            imagen_f1.setImageResource(R.drawable.uni_56);
            imagen_f2.setImageResource(R.drawable.uni_57);
            imagen_f3.setImageResource(R.drawable.uni_58);
            imagen_f4.setImageResource(R.drawable.uni_59);
            imagen_f5.setImageResource(R.drawable.uni_60);
        }
        /////SOLIDARIDAD///////
        if (valor.equals("unisur_soli_fotos")){
            recibidor.setText("Universidad del Sur Campus Playa del Carmen");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.unid_solidaridad);

            imagen_f1.setImageResource(R.drawable.uni_61);
            imagen_f2.setImageResource(R.drawable.uni_62);
            imagen_f3.setImageResource(R.drawable.uni_63);
            imagen_f4.setImageResource(R.drawable.uni_64);
            imagen_f5.setImageResource(R.drawable.uni_65);
        }
        if (valor.equals("uniriviera_soli_fotos")){
            recibidor.setText("Universidad Riviera");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.universidadriviera_solidaridad);

            imagen_f1.setImageResource(R.drawable.uni_66);
            imagen_f2.setImageResource(R.drawable.uni_67);
            imagen_f3.setImageResource(R.drawable.uni_68);
            imagen_f4.setImageResource(R.drawable.uni_69);
            imagen_f5.setImageResource(R.drawable.uni_70);
        }
        if (valor.equals("ut_rivieramaya_soli_fotos")){
            recibidor.setText("Universidad Tecnológica Riviera Maya");
            recibidor2.setText("FOTOS");
            imagen_uni.setImageResource(R.drawable.ut_rivieramaya_solidaridad);

            imagen_f1.setImageResource(R.drawable.uni_71);
            imagen_f2.setImageResource(R.drawable.uni_72);
            imagen_f3.setImageResource(R.drawable.uni_73);
            imagen_f4.setImageResource(R.drawable.uni_74);
            imagen_f5.setImageResource(R.drawable.uni_75);
        }
        if (valor.equals("unid_soli_fotos")){
            recibidor.setText("Universidad Interamericana para el Desarrollo Campus Playa del Carmen");
            imagen_uni.setImageResource(R.drawable.unid_solidaridad);
            recibidor2.setText("FOTOS");

            imagen_f1.setImageResource(R.drawable.uni_76);
            imagen_f2.setImageResource(R.drawable.uni_77);
            imagen_f3.setImageResource(R.drawable.uni_78);
            imagen_f4.setImageResource(R.drawable.uni_79);
            imagen_f5.setImageResource(R.drawable.uni_80);
        }
        if (valor.equals("esc_enfermeria_soli_fotos")){
            recibidor.setText("Escuela de enfermería Ignacio Chávez");
            imagen_uni.setImageResource(R.drawable.esc_enfermeria_solidaridad);
            recibidor2.setText("FOTOS");

            imagen_f1.setImageResource(R.drawable.uni_81);
            imagen_f2.setImageResource(R.drawable.uni_82);
            imagen_f3.setImageResource(R.drawable.uni_83);
            imagen_f4.setImageResource(R.drawable.uni_84);
            imagen_f5.setImageResource(R.drawable.uni_85);
        }
        /////COZUMEL///////
        if (valor.equals("inst_partenon_cozumel_fotos")){
            recibidor.setText("Instituto Partenón de Cozumel");
            imagen_uni.setImageResource(R.drawable.inst_partenon_cozumel);
            recibidor2.setText("FOTOS");

            imagen_f1.setImageResource(R.drawable.uni_86);
            imagen_f2.setImageResource(R.drawable.uni_87);
            imagen_f3.setImageResource(R.drawable.uni_88);
            imagen_f4.setImageResource(R.drawable.uni_89);
            imagen_f5.setImageResource(R.drawable.uni_90);
        }
        /////BENITO JUÁREZ///////
        if (valor.equals("upqroo_benito_juarez_fotos")){
            recibidor.setText("Universidad Politécnica de Quintana Roo");
            imagen_uni.setImageResource(R.drawable.upqroo_benito_juarez);
            recibidor2.setText("FOTOS");

            imagen_f1.setImageResource(R.drawable.uni_91);
            imagen_f2.setImageResource(R.drawable.uni_92);
            imagen_f3.setImageResource(R.drawable.uni_93);
            imagen_f4.setImageResource(R.drawable.uni_94);
            imagen_f5.setImageResource(R.drawable.uni_95);
        }
        if (valor.equals("ut_benito_juarez_fotos")){
            recibidor.setText("Universidad Tecnológica de Cancún");
            imagen_uni.setImageResource(R.drawable.ut_benito_juarez);
            recibidor2.setText("FOTOS");

            imagen_f1.setImageResource(R.drawable.uni_96);
            imagen_f2.setImageResource(R.drawable.uni_97);
            imagen_f3.setImageResource(R.drawable.uni_98);
            imagen_f4.setImageResource(R.drawable.uni_99);
            imagen_f5.setImageResource(R.drawable.uni_100);
        }
        if (valor.equals("henbord_benito_juarez_fotos")){
            recibidor.setText("Universidad Henbord");
            imagen_uni.setImageResource(R.drawable.uni_henbord_benito_juarez);
            recibidor2.setText("FOTOS");

            imagen_f1.setImageResource(R.drawable.uni_101);
            imagen_f2.setImageResource(R.drawable.uni_102);
            imagen_f3.setImageResource(R.drawable.uni_103);
            imagen_f4.setImageResource(R.drawable.uni_104);
            imagen_f5.setImageResource(R.drawable.uni_105);
        }
        if (valor.equals("uni_azteca_benito_juarez_fotos")){
            recibidor.setText("Universidad Azteca");
            imagen_uni.setImageResource(R.drawable.uni_azteca_benito_juarez);
            recibidor2.setText("FOTOS");

            imagen_f1.setImageResource(R.drawable.uni_106);
            imagen_f2.setImageResource(R.drawable.uni_107);
            imagen_f3.setImageResource(R.drawable.uni_108);
            imagen_f4.setImageResource(R.drawable.uni_109);
            imagen_f5.setImageResource(R.drawable.uni_110);
        }
        if (valor.equals("centro_gestalt_juarez_fotos")){
            recibidor.setText("Cento de Estudios Gestalt");
            imagen_uni.setImageResource(R.drawable.centro_gestalt_benito_juarez);
            recibidor2.setText("FOTOS");

            imagen_f1.setImageResource(R.drawable.uni_111);
            imagen_f2.setImageResource(R.drawable.uni_112);
            imagen_f3.setImageResource(R.drawable.uni_113);
            imagen_f4.setImageResource(R.drawable.uni_114);
            imagen_f5.setImageResource(R.drawable.uni_115);
        }

        if (valor.equals("la_salle_juarez_fotos")){
            recibidor.setText("La Salle Campus Cancún");
            imagen_uni.setImageResource(R.drawable.la_salle_benito_juarez);
            recibidor2.setText("FOTOS");

            imagen_f1.setImageResource(R.drawable.uni_116);
            imagen_f2.setImageResource(R.drawable.uni_117);
            imagen_f3.setImageResource(R.drawable.uni_118);
            imagen_f4.setImageResource(R.drawable.uni_119);
            imagen_f5.setImageResource(R.drawable.uni_120);
    }
        if (valor.equals("inst_humanista_juarez_fotos")){
            recibidor.setText("Instituto Humanista de Psicoterapia Gestalt");
            imagen_uni.setImageResource(R.drawable.inst_humanista_gestalt_benito_juarez);
            recibidor2.setText("FOTOS");

            imagen_f1.setImageResource(R.drawable.uni_121);
            imagen_f2.setImageResource(R.drawable.uni_122);
            imagen_f3.setImageResource(R.drawable.uni_123);
            imagen_f4.setImageResource(R.drawable.uni_124);
            imagen_f5.setImageResource(R.drawable.uni_125);
        }
        if (valor.equals("unisur_juarez_fotos")){
            recibidor.setText("Universidad del Sur Campus Cancún");
            imagen_uni.setImageResource(R.drawable.unisur_benito_juarez);
            recibidor2.setText("FOTOS");

            imagen_f1.setImageResource(R.drawable.uni_126);
            imagen_f2.setImageResource(R.drawable.uni_127);
            imagen_f3.setImageResource(R.drawable.uni_128);
            imagen_f4.setImageResource(R.drawable.uni_129);
            imagen_f5.setImageResource(R.drawable.uni_130);
        }
        if (valor.equals("sup_leyes_juarez_fotos")){
            recibidor.setText("Instituto Superior de Leyes");
            imagen_uni.setImageResource(R.drawable.instituto_sup_leyes_benito_juarez);
            recibidor2.setText("FOTOS");

            imagen_f1.setImageResource(R.drawable.uni_131);
            imagen_f2.setImageResource(R.drawable.uni_132);
            imagen_f3.setImageResource(R.drawable.uni_133);
            imagen_f4.setImageResource(R.drawable.uni_134);
            imagen_f5.setImageResource(R.drawable.uni_135);
        }

    }

}
