package com.example.feria_universidades;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
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
            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps?ll=18.517217,-88.488534&z=16&t=m&hl=es&gl=US&mapclient=embed&q=ITZM+Chetumal+-+Villahermosa+Quintana+Roo");
        }
        if (valor.equals("uni_cudv_contac")){
            recibidor.setText("Centro Universitario de Desarrollo Vanguardista");
            imagen_uni.setImageResource(R.drawable.cudv_1);
            recibidor2.setText("CENTRO UNIVERSITARIO DE DESARROLLO VANGUARDISTA Avenida, Javier Rojo Gomez #367, 77020 Chetumal, Q.R.");

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps/place/Javier+Rojo+Gomez+367,+Emancipaci%C3%B3n,+Chetumal,+Q.R.,+M%C3%A9xico/@18.519803,-88.31863,16z/data=!4m5!3m4!1s0x8f5ba4ac2aa471d9:0xea9dbdbefa174374!8m2!3d18.5239785!4d-88.3190622?hl=es");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps/place/UNID+Campus+Chetumal/@18.5030201,-88.300051,17z/data=!4m12!1m6!3m5!1s0x8f5ba36f7b431571:0xcb1d6ca0b325cd57!2sUNID+Campus+Chetumal!8m2!3d18.503015!4d-88.2978623!3m4!1s0x8f5ba36f7b431571:0xcb1d6ca0b325cd57!8m2!3d18.503015!4d-88.2978623");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps/place/Escuela+Modelo,/@18.516237,-88.3784,16z/data=!4m13!1m7!3m6!1s0x85f686b92042ad0d:0x284583a811b100eb!2sM%C3%A9xico+186,+Quintana+Roo,+M%C3%A9xico!3b1!8m2!3d18.5268951!4d-88.4653732!3m4!1s0x8f5bbb8a75694dab:0x3516c5d5ff38b46b!8m2!3d18.5157262!4d-88.3786529?hl=es");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps?ll=18.701903,-88.399762&z=17&t=m&hl=es&gl=US&mapclient=embed&cid=3069743588276653113");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps/place/Av+1+27,+Magisterial,+Bacalar,+Q.R.,+M%C3%A9xico/@18.6709706,-88.3919787,19.75z/data=!4m5!3m4!1s0x8f5bb13abdf4bf49:0xa68f8e1682a745fd!8m2!3d18.6710689!4d-88.391555?hl=es");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps?ll=19.577837,-88.042053&z=17&t=m&hl=es&gl=US&mapclient=embed&q=Av+Constituyentes+Centro+Felipe+Carrillo+Puerto,+Q.R.");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps/place/TecNM+-+Instituto+Tecnol%C3%B3gico+Superior+de+Felipe+Carrillo+Puerto/@19.582993,-88.0300862,15z/data=!4m5!3m4!1s0x0:0x5440ca7444f004c8!8m2!3d19.582993!4d-88.0300862");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps/place/UIMQRoo/@19.759122,-88.724301,16z/data=!4m5!3m4!1s0x0:0xa8eb4ed2b1b4ce59!8m2!3d19.7590624!4d-88.7245752?hl=es");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps/place/Universidad+del+Sur/@20.6205147,-87.0781076,20z/data=!4m13!1m7!3m6!1s0x8f4e433ebe87df49:0x4a32ee3f3e4ac6ab!2s10+Avenida+Sur+10,+Playacar,+77717+Playa+del+Carmen,+Q.R.,+M%C3%A9xico!3b1!8m2!3d20.6208122!4d-87.0785031!3m4!1s0x8f4e433eb7f97bb3:0xdad11789d07c36c2!8m2!3d20.6206509!4d-87.0780176?hl=es");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps?ll=20.659798,-87.096395&z=17&t=m&hl=es&gl=US&mapclient=embed&cid=7117098258206392931");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps?ll=20.682752,-87.064428&z=16&t=m&hl=es&gl=US&mapclient=embed&cid=2724757065671096726");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps/place/UNID+Campus+Playa+del+Carmen/@20.634345,-87.079205,16z/data=!4m5!3m4!1s0x8f4e432162c9b227:0x7c9c2a93ad84b304!8m2!3d20.634152!4d-87.0793319?hl=es");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps/place/Universidad+Parten%C3%B3n+de+Cozumel/@20.4924946,-86.9422011,19z/data=!4m13!1m7!3m6!1s0x8f4e57803ba52333:0x9e26d96d373b493!2sAvenida+Andres+Q+Roo+%26+90+Avenida+Sur,+Repobladores,+San+Miguel+de+Cozumel,+Q.R.,+M%C3%A9xico!3b1!8m2!3d20.4927725!4d-86.941572!3m4!1s0x8f4e57803b95f7d9:0x2e18ae6867a7a818!8m2!3d20.492358!4d-86.9417788?hl=es");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps?ll=21.180753,-86.906414&z=17&t=m&hl=es&gl=US&mapclient=embed&cid=903002927684944988");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps?ll=21.133183,-86.846065&z=22&t=m&hl=es&gl=US&mapclient=embed&q=Av+Las+Torres+523+Canc%C3%BAn,+Q.R.");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps/place/Universidad+Henbord/@21.13199,-86.8450775,17.5z/data=!4m5!3m4!1s0x0:0x8c0187edf0476964!8m2!3d21.1320782!4d-86.843812");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps/place/Universidad+Azteca/@21.1584596,-86.8526638,15z/data=!4m2!3m1!1s0x0:0x2e6767c5dc3aebfd?sa=X&ved=2ahUKEwjqz4zq2J7tAhV8TTABHWDUAsgQ_BIwCnoECBEQAw");

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

            WebView webView = (WebView) findViewById(R.id.mapas_unis);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("https://www.google.com/maps/place/Gestalt/@21.1417847,-86.8316616,15z/data=!4m2!3m1!1s0x0:0x111c46cbd712c2c3?sa=X&ved=2ahUKEwieyoWE2Z7tAhUvRDABHW6_Dv0Q_BIwCnoECBQQBQ");

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