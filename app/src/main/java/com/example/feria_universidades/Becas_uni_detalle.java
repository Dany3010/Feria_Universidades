package com.example.feria_universidades;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class Becas_uni_detalle extends AppCompatActivity {
    ImageView imagen_uni,imagen_uni2;
    TextView recibidor,recibidor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_becas_uni_detalle);

        Bundle bundle = getIntent().getExtras();
        String valor =bundle.getString("universidad3");
        recibidor= (TextView) findViewById(R.id.tituloUni_beca);
        recibidor2= (TextView) findViewById(R.id.subtituloUni_beca);
        imagen_uni = (ImageView)findViewById(R.id.imagenUni_beca);
        imagen_uni2 = (ImageView)findViewById(R.id.image_becas);

        WebView myWebView1 = (WebView)findViewById(R.id.web_beca);
        WebView myWebView2 = (WebView)findViewById(R.id.web_beca2);
        ///ocultar
        myWebView1.setVisibility(View.GONE);
        myWebView2.setVisibility(View.GONE);
        imagen_uni2 .setVisibility(View.GONE);

        if (valor.equals("uni_itzm_becas")){
            recibidor.setText("Instituto Tecnológico de la Zona Maya");
            imagen_uni.setImageResource(R.drawable.itzm);
            recibidor2.setText("BECAS PARA ESTUDIANTES");

            //////mostrar
            myWebView2.setVisibility(View.VISIBLE);
            myWebView1.setVisibility(View.VISIBLE);
            //////////////
            myWebView1.getSettings().setJavaScriptEnabled(true);
            myWebView2.getSettings().setJavaScriptEnabled(true);


            myWebView1.setWebViewClient(new WebViewClient() {
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon){
                    super.onPageStarted(view, url, favicon);

                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);

                }
            });
            myWebView2.setWebViewClient(new WebViewClient() {
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon){
                    super.onPageStarted(view, url, favicon);

                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);

                }
            });

            //Carga url de .PDF en WebView  mediante Google Drive Viewer.
            myWebView1.loadUrl("https://drive.google.com/file/d/1HPidGWK6AQasHHGyiGQ3e8zlfUs9M3Ix/preview");
            myWebView2.loadUrl("https://drive.google.com/file/d/1OHEsgAxWtnVVk8Gwm8KsqOx4WYYICPGj/preview");
        }
        if (valor.equals("uni_cudv_becas")){
            recibidor.setText("Centro Universitario de Desarrollo Vanguardista");
            imagen_uni.setImageResource(R.drawable.cudv_1);
            recibidor2.setText("SIN BECAS PARA ESTUDIANTES POR EL MOMENTO");


        }
        if (valor.equals("unid_chetumal_becas")){
            recibidor.setText("Universidad Interamericana para el  Desarrollo Campus Chetumal");
            imagen_uni.setImageResource(R.drawable.unid_chetumal);
            recibidor2.setText("SIN BECAS PARA ESTUDIANTES POR EL MOMENTO");

        }
        if (valor.equals("modelo_chetumal_becas")){
            recibidor.setText("Universidad Modelo");
            imagen_uni.setImageResource(R.drawable.uni_modelo_chetumal);
            recibidor2.setText("BECAS PARA ESTUDIANTES");

            //////mostrar
            myWebView1.setVisibility(View.VISIBLE);

            //////////////
            myWebView1.getSettings().setJavaScriptEnabled(true);



            myWebView1.setWebViewClient(new WebViewClient() {
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon){
                    super.onPageStarted(view, url, favicon);

                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);

                }
            });


            //Carga url de .PDF en WebView  mediante Google Drive Viewer.
            myWebView1.loadUrl("https://drive.google.com/file/d/1qFlioBJ8NcWQxVjw8z2Fd8Qc12sz51Zt/preview");

        }
        if (valor.equals("uni_wozniak_becas")){
            recibidor.setText("Instituto de Estudios Superiores Wozniak");
            imagen_uni.setImageResource(R.drawable.wozniak);
            recibidor2.setText("BECAS PARA ESTUDIANTES");

            //////mostrar
            myWebView1.setVisibility(View.VISIBLE);

            //////////////
            myWebView1.getSettings().setJavaScriptEnabled(true);



            myWebView1.setWebViewClient(new WebViewClient() {
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon){
                    super.onPageStarted(view, url, favicon);

                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);

                }
            });


            //Carga url de .PDF en WebView  mediante Google Drive Viewer.
            myWebView1.loadUrl("https://drive.google.com/file/d/1RFcUuqUD-aGtinAvaaSsp4AoUEhfteqj/preview");

        }
        if (valor.equals("uqroo_chetumal_becas")){
            recibidor.setText("Universidad de Quintana Roo Campo Chetumal");
            imagen_uni.setImageResource(R.drawable.uqroo);
            recibidor2.setText("BECAS PARA ESTUDIANTES");

            //////mostrar
            myWebView1.setVisibility(View.VISIBLE);

            //////////////
            myWebView1.getSettings().setJavaScriptEnabled(true);



            myWebView1.setWebViewClient(new WebViewClient() {
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon){
                    super.onPageStarted(view, url, favicon);

                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);

                }
            });


            //Carga url de .PDF en WebView  mediante Google Drive Viewer.
            myWebView1.loadUrl("https://drive.google.com/file/d/1fPYqSTuyjkikJ6nvUNbMNzq_RGUmbTlA/preview");

        }
        if (valor.equals("ut_chetumal_becas")){
            recibidor.setText("Universidad Tecnológica de Chetumal");
            imagen_uni.setImageResource(R.drawable.ut_chetumal);
            recibidor2.setText("BECAS PARA ESTUDIANTES");
            //////mostrar
            myWebView1.setVisibility(View.VISIBLE);

            //////////////
            myWebView1.getSettings().setJavaScriptEnabled(true);



            myWebView1.setWebViewClient(new WebViewClient() {
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon){
                    super.onPageStarted(view, url, favicon);

                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);

                }
            });


            //Carga url de .PDF en WebView  mediante Google Drive Viewer.
            myWebView1.loadUrl("https://drive.google.com/file/d/1IMuAbux91fO5NYPLj3k4n4NUqgWufasS/preview");

        }
        ///////BACALAR/////////
        if (valor.equals("politec_bacalar_becas")){
            recibidor.setText("Universidad Politécnica de Bacalar");
            imagen_uni.setImageResource(R.drawable.uni_poli_bacalar);
            recibidor2.setText("BECAS PARA ESTUDIANTES");

            //////mostrar
            myWebView1.setVisibility(View.VISIBLE);

            //////////////
            myWebView1.getSettings().setJavaScriptEnabled(true);



            myWebView1.setWebViewClient(new WebViewClient() {
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon){
                    super.onPageStarted(view, url, favicon);

                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);

                }
            });


            //Carga url de .PDF en WebView  mediante Google Drive Viewer.
            myWebView1.loadUrl("https://drive.google.com/file/d/1LNIJ-GawZUwRlvU9VrMHQldzj8rFijnN/preview");

        }
        if (valor.equals("edu_bacalar_becas")){
            recibidor.setText("Centro Regional de Educación Normal Lic. Javier Rojo Gómez");
            imagen_uni.setImageResource(R.drawable.centro_regio_edu_bacalar);
            recibidor2.setText("SIN BECAS PARA ESTUDIANTES POR EL MOMENTO");

        }
        /////FELIPE CARRILLO PUERTO////////
        if (valor.equals("upp_becas")){
            recibidor.setText("Universidad Privada de la Península");
            imagen_uni.setImageResource(R.drawable.upp);
            recibidor2.setText("BECAS PARA ESTUDIANTES");
            //////mostrar
            myWebView1.setVisibility(View.VISIBLE);

            //////////////
            myWebView1.getSettings().setJavaScriptEnabled(true);



            myWebView1.setWebViewClient(new WebViewClient() {
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon){
                    super.onPageStarted(view, url, favicon);

                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);

                }
            });
                    //Carga url de .PDF en WebView  mediante Google Drive Viewer.
                     myWebView1.loadUrl("https://drive.google.com/file/d/1ywQj0ea03VQUHYQO-GmQjJD_0Ub89Bfn/preview");


        }
        if (valor.equals("inst_tec_felipe_becas")){
            recibidor.setText("Instituto Tecnológico Superior de Felipe Carrillo Puerto");
            imagen_uni.setImageResource(R.drawable.inst_tec_felipe_c);
            recibidor2.setText("SIN BECAS PARA ESTUDIANTES POR EL MOMENTO");

        }
        /////JOSE MARIA MORELOS///////
        if (valor.equals("uimqroo_becas")){
            recibidor.setText("Universidad Intercultural Maya de Quintana Roo");
            imagen_uni.setImageResource(R.drawable.uimqroo);
            recibidor2.setText("SIN BECAS PARA ESTUDIANTES POR EL MOMENTO");

        }
        /////SOLIDARIDAD///////
        if (valor.equals("unisur_soli_becas")){
            recibidor.setText("Universidad del Sur Campus Playa del Carmen");
            imagen_uni.setImageResource(R.drawable.universidadsur_solidaridad);
            recibidor2.setText("BECAS PARA ESTUDIANTES");

            //////mostrar
            myWebView1.setVisibility(View.VISIBLE);

            //////////////
            myWebView1.getSettings().setJavaScriptEnabled(true);



            myWebView1.setWebViewClient(new WebViewClient() {
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon){
                    super.onPageStarted(view, url, favicon);

                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);

                }
            });
            //Carga url de .PDF en WebView  mediante Google Drive Viewer.
            myWebView1.loadUrl("https://drive.google.com/file/d/1m3EuX9YpZ2mOJAQ4rNfxnZReNWrJLHwx/preview");

        }
        if (valor.equals("uniriviera_soli_becas")){
            recibidor.setText("Universidad Riviera");
            imagen_uni.setImageResource(R.drawable.universidadriviera_solidaridad);
            recibidor2.setText("SIN BECAS PARA ESTUDIANTES POR EL MOMENTO");


        }
        if (valor.equals("ut_rivieramaya_soli_becas")){
            recibidor.setText("Universidad Tecnológica Riviera Maya");
            imagen_uni.setImageResource(R.drawable.ut_rivieramaya_solidaridad);
            recibidor2.setText("BECAS PARA ESTUDIANTES");
            //////mostrar/////////
            imagen_uni2.setVisibility(View.VISIBLE);
            imagen_uni2.setImageResource(R.drawable.becas_imagen_1);
        }
        if (valor.equals("unid_soli_becas")){
            recibidor.setText("Universidad Interamericana para el Desarrollo Campus Playa del Carmen");
            imagen_uni.setImageResource(R.drawable.unid_solidaridad);
            recibidor2.setText("SIN BECAS PARA ESTUDIANTES POR EL MOMENTO");

        }
        if (valor.equals("esc_enfermeria_soli_becas")){
            recibidor.setText("Escuela de enfermería Ignacio Chávez");
            imagen_uni.setImageResource(R.drawable.esc_enfermeria_solidaridad);
            recibidor2.setText("SIN BECAS PARA ESTUDIANTES POR EL MOMENTO");

        }
        /////COZUMEL///////
        if (valor.equals("inst_partenon_cozumel_becas")){
            recibidor.setText("Instituto Partenón de Cozumel");
            imagen_uni.setImageResource(R.drawable.inst_partenon_cozumel);
            recibidor2.setText("BECAS PARA ESTUDIANTES");

            //////mostrar
            myWebView1.setVisibility(View.VISIBLE);

            //////////////
            myWebView1.getSettings().setJavaScriptEnabled(true);



            myWebView1.setWebViewClient(new WebViewClient() {
                @Override
                public void onPageStarted(WebView view, String url, Bitmap favicon){
                    super.onPageStarted(view, url, favicon);

                }

                @Override
                public void onPageFinished(WebView view, String url) {
                    super.onPageFinished(view, url);

                }
            });
            //Carga url de .PDF en WebView  mediante Google Drive Viewer.
            myWebView1.loadUrl("https://drive.google.com/file/d/1FP6ndty-7juOS1YMdzBYcgzqNIhwW8RM/preview");

        }
    }
}