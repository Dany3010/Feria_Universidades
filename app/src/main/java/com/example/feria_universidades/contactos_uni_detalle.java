package com.example.feria_universidades;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class contactos_uni_detalle extends AppCompatActivity {
    ImageView imagen_uni;
    TextView recibidor,recibidor2;
    Button face,twit,b_web,mail,insta,whats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos_uni_detalle);
        Bundle bundle = getIntent().getExtras();
        String valor =bundle.getString("universidad");
        recibidor= (TextView) findViewById(R.id.tituloUni_contactos);
        recibidor2= (TextView) findViewById(R.id.subtituloUni_contact_map);
        imagen_uni = (ImageView)findViewById(R.id.imagenUni_contacto);

        face= (Button)findViewById(R.id.facebook);
        twit= (Button)findViewById(R.id.twitter);
        b_web= (Button)findViewById(R.id.buscador_web);
        mail= (Button)findViewById(R.id.correo);
        insta= (Button)findViewById(R.id.instagram);
        whats= (Button)findViewById(R.id.Whatsapp);


        if (valor.equals("uni_itzm_contac")){
            recibidor.setText("Instituto Tecnológico de la Zona Maya");
            imagen_uni.setImageResource(R.drawable.itzm);
            recibidor2.setText("Carretera Chetumal – Escárcega Km. 21.5 Ejido Juan Sarabia, Quintana Roo, C.P. 77965");
            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/TECNMCampusZonaMaya";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
            twit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://twitter.com/tecnmzonamaya";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="http://www.itzonamaya.edu.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
            insta.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.instagram.com/tecnmcampuszonamaya/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            whats.setVisibility(View.INVISIBLE);

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:itzm_comunicacionydifusion@hotmail.com";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
            whats.setVisibility(View.GONE);
        }
        if (valor.equals("uni_cudv_contac")){
            recibidor.setText("Centro Universitario de Desarrollo Vanguardista");
            imagen_uni.setImageResource(R.drawable.cudv_1);
            recibidor2.setText("CENTRO UNIVERSITARIO DE DESARROLLO VANGUARDISTA Avenida, Javier Rojo Gomez #367, 77020 Chetumal, Q.R.");

            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/CUDVChetumal/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
            whats.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://api.whatsapp.com/send/?phone=5219837325177&text&app_absent=0";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
            twit.setVisibility(View.INVISIBLE);

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://cudv.com.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.instagram.com/cudvchetumal/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:hello@cudv.com.mx";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
        if (valor.equals("unid_chetumal_contac")){
            recibidor.setText("Universidad Interamericana para el  Desarrollo Campus Chetumal");
            imagen_uni.setImageResource(R.drawable.unid_chetumal);
            recibidor2.setText("Av. Juárez 168, Centro, 77000 Chetumal, Q.R.");

            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/UNIDCampusChetumal/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            twit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://twitter.com/RedUNID/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "http://www.unid.edu.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.instagram.com/unid_che_/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:chetumal@unid.mx";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
            whats.setVisibility(View.INVISIBLE);
        }
        if (valor.equals("modelo_chetumal_contac")){
            recibidor.setText("Universidad Modelo");
            imagen_uni.setImageResource(R.drawable.uni_modelo_chetumal);
            recibidor2.setText("Carr. Federal Chetumal - Sub-teniente López. S/N. Entre la glorieta al mestizaje y la glorieta de Sta. Elena. Chetumal, Quintana Roo.");

            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/umodelochetumal/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            twit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://twitter.com/unimodelo_ch";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://www.unimodelo.edu.mx/chetumal";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.instagram.com/unimodelochetumal/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:chetumal@modelo.edu.mx";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
            whats.setVisibility(View.INVISIBLE);
        }
        ///////BACALAR/////////
        if (valor.equals("politec_bacalar_contac")){
            recibidor.setText("Universidad Politécnica de Bacalar");
            imagen_uni.setImageResource(R.drawable.uni_poli_bacalar);
            recibidor2.setText("Avenida 39 entre calle 50 y 54, C.P. 77930,\n" +
                    "Bacalar, Q.Roo. Tel: 983 733 5292 y 983 168 2490");

            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/Upbacalar";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            twit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://twitter.com/upbacalar";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "http://www.upb.edu.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setVisibility(View.INVISIBLE);
            whats.setVisibility(View.INVISIBLE);

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:sandy.manzo@upb.edu.mx";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
        if (valor.equals("edu_bacalar_contac")){
            recibidor.setText("Centro Regional de Educación Normal Lic. Javier Rojo Gómez");
            imagen_uni.setImageResource(R.drawable.centro_regio_edu_bacalar);
            recibidor2.setText("Boulevard Costero 77930 Bacalar Quintana Roo México.\n" +
                    "Teléfono: 983-834-2185");
            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/crenjrgbacalar";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            twit.setVisibility(View.INVISIBLE);

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://www.crenjrg.edu.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setVisibility(View.INVISIBLE);
            whats.setVisibility(View.INVISIBLE);

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:crenjrgbacalar@hotmail.com";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
        /////FELIPE CARRILLO PUERTO////////
        if (valor.equals("upp_contac")){
            recibidor.setText("Universidad Privada de la Península");
            imagen_uni.setImageResource(R.drawable.upp);
            recibidor2.setText("UBICACIÓN: AV. CONSTITUYENTES X CALLE 67, #750, CENTRO. \n" +
                    "FELIPE CARRILLO PUERTO\n" +
                    "TELEFONO: 99 93 35 09 52");
            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/UPPCarrilloPuerto/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            twit.setVisibility(View.INVISIBLE);

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://www.universidadupp.edu.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setVisibility(View.INVISIBLE);
            whats.setVisibility(View.INVISIBLE);

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:MIZRAIM.TUN@UNIVERSIDADUPP.EDU.MX";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
        if (valor.equals("inst_tec_felipe_contac")){
            recibidor.setText("Instituto Tecnológico Superior de Felipe Carrillo Puerto");
            imagen_uni.setImageResource(R.drawable.inst_tec_felipe_c);
            recibidor2.setText("Av. Vigía Chico 77200 Felipe Carrillo Puerto, Quintana Roo");
            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/TecNMcampusFelipeCarrilloPuerto";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            twit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://twitter.com/TecNMCarrillo";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://www.carrillopuerto.tecnm.mx/index.php/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setVisibility(View.INVISIBLE);
            whats.setVisibility(View.INVISIBLE);

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:direccion@itscarrillopuerto.edu.mx";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
        /////JOSE MARIA MORELOS///////
        if (valor.equals("uimqroo_contac")){
            recibidor.setText("Universidad Intercultural Maya de Quintana Roo");
            imagen_uni.setImageResource(R.drawable.uimqroo);
            recibidor2.setText("CARRETERA MUNA-FELIPE CARRILLO PUERTO KM. 137, S/N PRESUMIDA, MUNICIPIO DE JOSÉ MARÍA MORELOS, QUINTANA ROO, C.P. 77870.");
            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/UIMQROO-Universidad-176572969856015";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            twit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://twitter.com/UIMQRoo";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "http://www.uimqroo.edu.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setVisibility(View.INVISIBLE);
            whats.setVisibility(View.INVISIBLE);

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:oscar.parrao@uimqroo.edu.mxx";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
        /////SOLIDARIDAD///////
        if (valor.equals("uimqroo_contac")){
            recibidor.setText("Universidad Intercultural Maya de Quintana Roo");
            imagen_uni.setImageResource(R.drawable.uimqroo);
            recibidor2.setText("CARRETERA MUNA-FELIPE CARRILLO PUERTO KM. 137, S/N PRESUMIDA, MUNICIPIO DE JOSÉ MARÍA MORELOS, QUINTANA ROO, C.P. 77870.");
            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/UIMQROO-Universidad-176572969856015";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            twit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://twitter.com/UIMQRoo";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "http://www.uimqroo.edu.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setVisibility(View.INVISIBLE);
            whats.setVisibility(View.INVISIBLE);

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:oscar.parrao@uimqroo.edu.mxx";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
        /////SOLIDARIDAD///////
        if (valor.equals("unisur_soli_contac")){
            recibidor.setText("Universidad del Sur Campus Playa del Carmen");
            imagen_uni.setImageResource(R.drawable.universidadsur_solidaridad);
            recibidor2.setText("Plaza Antigua, 10 Avenida Sur, Playacar, 77717 \n" +
                    "Playa del Carmen, Q.R.\n" +
                    "Teléfono: 9984878406");
            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/UsPlayadelCarmen?_rdc=2&_rdr";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            twit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://twitter.com/unidelsur?lang=es";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://www.universidaddelsur.edu.mx/universidaddelsur/playa.php";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setVisibility(View.INVISIBLE);
            whats.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://api.whatsapp.com/message/LNN5KCTO2HG5G1";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:universidaddelsur@hotmail.com";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
        if (valor.equals("uniriviera_soli_contac")){
            recibidor.setText("Universidad del Sur Campus Playa del Carmen");
            imagen_uni.setImageResource(R.drawable.universidadsur_solidaridad);
            recibidor2.setText("Av. 58 Norte MZ 168 Lote 4 Real Ibiza, 77723 Playa del  Carmen, QRO");

            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/UniversidadRivieraMX";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://www.instagram.com/universidadriviera/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://www.universidadriviera.edu.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            twit.setVisibility(View.INVISIBLE);
            whats.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://api.whatsapp.com/send/?phone=529841295110&text&app_absent=0";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:carlos.montoya@universidadriviera.edu.mx";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
        if (valor.equals("ut_rivieramaya_soli_contac")){
            recibidor.setText("Universidad Tecnológica Riviera Maya");
            imagen_uni.setImageResource(R.drawable.ut_rivieramaya_solidaridad);
            recibidor2.setText("Av. Paseo del Mayab 4000 Región 79 Playa del Carmen, Quintana Roo - México C.P. 77710 \n" +
                    "Telefono: 9848774600");

            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/UTRivieraMaya.BIS/?_rdc=2&_rdr";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://www.instagram.com/utrivieramaya.bis/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://www.utrivieramaya.edu.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            twit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://twitter.com/UT_RivieraMaya";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
            whats.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://api.whatsapp.com/send?phone=529842787995";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:nuevoingreso@utrivieramaya.edu.mx";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
        if (valor.equals("unid_soli_contac")){
            recibidor.setText("Universidad Interamericana para el Desarrollo Campus Playa del Carmen");
            imagen_uni.setImageResource(R.drawable.unid_solidaridad);
            recibidor2.setText("Calle 28 Norte, Mz 130 L5 entre Calle 50 y Carretera Federal Cancún-Tulum, Col. Ejidal\n" +
                    "Playa del Carmen");

            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/UNIDCampusPlayadelCarmen";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://www.instagram.com/RedUNID/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://www.unid.edu.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            twit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://twitter.com/RedUNID/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
            whats.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://api.whatsapp.com/message/D36S7CLQJZYML1";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:playadelcarmen@unid.mx";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
        /////COZUMEL///////
        if (valor.equals("inst_partenon_cozumel_contac")){
            recibidor.setText("Instituto Partenón de Cozumel");
            imagen_uni.setImageResource(R.drawable.inst_partenon_cozumel);
            recibidor2.setText("11 AV. ENTRE 90 Y 90 BIS COL. CUZAMIL,\n" +
                    "TELÉFONO: 987 8693874 Y 987 8693530");

            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/UniversidadPartenon/?_rdc=2&_rdr";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            twit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://twitter.com/partenoncozumel";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "http://www.upc.edu.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.instagram.com/partenoncozumel/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
            whats.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://api.whatsapp.com/send?phone=5299871119880&text=&source=&data=&app_absent=";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:sistemas@upc.edu.mx";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
        /////BENITO JUÁREZ///////
        if (valor.equals("upqroo_benito_juarez_contac")){
            recibidor.setText("Universidad Politécnica de Quintana Roo");
            imagen_uni.setImageResource(R.drawable.upqroo_benito_juarez);
            recibidor2.setText("Av. Arco Bicentenario, Mza. 11, Lote 1119-33, SM. 255. \n" +
                    "Cancún, Quintana Roo, México. C.P. 77500\n" +
                    "Tel. y Fax (998) 283 1859 ");

            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/upqroo?_rdc=1&_rdr";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            twit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://twitter.com/upqroo";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "http://www.upqroo.edu.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setVisibility(View.INVISIBLE);
            whats.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://api.whatsapp.com/send?phone=5299871119880&text=&source=&data=&app_absent=";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:buzon@upqroo.edu.mx";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
        if (valor.equals("ut_benito_juarez_contac")){
            recibidor.setText("Universidad Tecnológica de Cancún");
            imagen_uni.setImageResource(R.drawable.ut_benito_juarez);
            recibidor2.setText("Carretera Cancún-Aeropuerto, Km. 11.5, S.M. 299, Mz. 5, Lt 1\n" +
                    "Cancún, Quintana Roo, C.P. 77565\n" +
                    "Tel. 01 (998) 881 19 00 ");

            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/UTdeCancun";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            twit.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://twitter.com/UTCancun";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "http://utcancun.edu.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.instagram.com/utcancun/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            whats.setVisibility(View.INVISIBLE);

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:informesut@utcancun.edu.mx";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
        if (valor.equals("henbord_benito_juarez_contac")){
            recibidor.setText("Universidad Henbord");
            imagen_uni.setImageResource(R.drawable.uni_henbord_benito_juarez);
            recibidor2.setText(" Av de las Torres Sm 523 Mz 16\n" +
                    "Teléfono: 9984878406");

            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/UHenbord/?_rdc=1&_rdr";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://www.instagram.com/universidad_henbord/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://henbord.com.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            whats.setVisibility(View.INVISIBLE);

            twit.setVisibility(View.INVISIBLE);

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:admisiones@henbord.com.mx";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
        if (valor.equals("uni_azteca_benito_juarez_contac")){
            recibidor.setText("Universidad Azteca");
            imagen_uni.setImageResource(R.drawable.uni_azteca_benito_juarez);
            recibidor2.setText(" 1, Av. Chichen Itza Mz 12, 59, 77515 Cancún, Q.R.");

            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/UHenbord/?_rdc=1&_rdr";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setVisibility(View.INVISIBLE);

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://universidadazteca.edu.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            mail.setVisibility(View.INVISIBLE);

            twit.setVisibility(View.INVISIBLE);

            whats.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://api.whatsapp.com/send?phone=9983241003";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
        if (valor.equals("centro_gestalt_benito_juarez_contac")){
            recibidor.setText("Cento de Estudios Gestalt");
            imagen_uni.setImageResource(R.drawable.centro_gestalt_benito_juarez);
            recibidor2.setText(" Av. Nichupté Mz 5, 17, 77505 Cancún, Q.R. \n" +
                    "Telefono+529982537502");

            face.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.facebook.com/LaUniversidadDelDiseno/?_rdc=2&_rdr";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            insta.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://www.instagram.com/launiversidaddeldiseno/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            b_web.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url= "https://www.cegestalt.mx/";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            mail.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="mailto:informescancun@cegestalt.mx";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });

            twit.setVisibility(View.INVISIBLE);

            whats.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    // Do something in response to button click
                    String url="https://api.whatsapp.com/send/?phone=529981309911&text&app_absent=0";
                    Uri uri = Uri.parse(url);
                    Intent univerisdad = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(univerisdad);
                }
            });
        }
    }
}