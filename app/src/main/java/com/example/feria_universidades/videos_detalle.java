package com.example.feria_universidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

public class videos_detalle extends AppCompatActivity {
    Context context;
    ImageView imagen_uni_v;
    TextView recibidor_v,recibidor_v2,recibidor_v3,recibidor_v4;
    private VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos_detalle);
        context=this;
        Bundle bundle = getIntent().getExtras();
        String valor =bundle.getString("universidad1");
        imagen_uni_v = (ImageView)findViewById(R.id.imagenUni_v);
        recibidor_v= (TextView) findViewById(R.id.titulo_uni_v);
        recibidor_v2= (TextView) findViewById(R.id.subtitulo_uni_v);
        recibidor_v3= (TextView) findViewById(R.id.subtitulo_uni_v2);
        recibidor_v4= (TextView) findViewById(R.id.subtitulo_uni_v3);

        /////OTHON P. BLANCO////////
        if (valor.equals("uni_itzm_videos")){
            recibidor_v.setText("Instituto Tecnológico de la Zona Maya");
            imagen_uni_v.setImageResource(R.drawable.itzm);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("OFERTA EDUCATIVA");
            recibidor_v4.setText("VIDEO INSTITUCIONAL");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1u4cGvsASuv0Y0pWbxu2opArSE7BdK9sv/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1LehV9h00YG3klvP9SpkQq-dfpsIGDM9m/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1mleK_VQ6-3KUqWSeH5pNu7LTqc4f1adL/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1TkuA4JVtnvFhw1Eo4QYJiEIQTyBgCU-V/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo5 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1nj9q4Ww-Hsf7giQqoWUAIdkIWHCfmCbw/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);
            WebView myWebView3 = (WebView) findViewById(R.id.video_uni3);
            WebView myWebView4 = (WebView) findViewById(R.id.video_uni4);
            WebView myWebView5 = (WebView) findViewById(R.id.video_uni7);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();
            WebSettings webSettings4= myWebView4.getSettings();
            WebSettings webSettings5= myWebView5.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);
            webSettings4.setJavaScriptEnabled(true);
            webSettings5.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");
            myWebView3.loadData(frameVideo3, "text/html", "utf-8");
            myWebView4.loadData(frameVideo4, "text/html", "utf-8");
            myWebView5.loadData(frameVideo5, "text/html", "utf-8");
            //////////////////////////////////////////

        }
        if (valor.equals("uni_cudv_videos")){
            recibidor_v.setText("Centro Universitario de Desarrollo Vanguardista");
            imagen_uni_v.setImageResource(R.drawable.cudv_1);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

           String frameVideo = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1NKYf72d7tGOm1GDxRcoWEeyS0tmjuyG-/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView = (WebView) findViewById(R.id.video_uni1);
            WebSettings webSettings1= myWebView.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView.loadData(frameVideo, "text/html", "utf-8");

            //////////////////////////////////////////

        }

        if (valor.equals("unid_chetumal_videos")){
            recibidor_v.setText("Universidad Interamericana para el  Desarrollo Campus Chetumal");
            imagen_uni_v.setImageResource(R.drawable.unid_chetumal);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/15_kgKP0oe6AZSRfwL5LbV73hSytb0iO_/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView = (WebView) findViewById(R.id.video_uni1);
            WebSettings webSettings1= myWebView.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView.loadData(frameVideo, "text/html", "utf-8");

            //////////////////////////////////////////

        }
        if (valor.equals("modelo_chetumal_videos")){
            recibidor_v.setText("Universidad Modelo");
            imagen_uni_v.setImageResource(R.drawable.uni_modelo_chetumal);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1Sf8MXvk9Q5nFNfLuRxquWyemaqtkefRh/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1cpYc9wnV1UfM-o9Fsig3-KSflFHV5fsu/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1XtvbSSYlFzRlWD3wqMkCfUD1foaAOVjT/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";


            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);
            WebView myWebView3 = (WebView) findViewById(R.id.video_uni3);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");
            myWebView3.loadData(frameVideo3, "text/html", "utf-8");

            //////////////////////////////////////////

        }

        if (valor.equals("uni_wozniak_videos")){
            recibidor_v.setText("Instituto de Estudios Superiores Wozniak");
            imagen_uni_v.setImageResource(R.drawable.uni_modelo_chetumal);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("VIDEO DE LA OFERTA EDUCATIVA");
            recibidor_v4.setText("VIDEO DE LAS INSTALACIONES");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/19DTy9bK4eSQreukRivgqLxSTvGonxEL1/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1VYDf5pmM5K9wR-JZSrKMhUmK37_RXyAq/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";


            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);


            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");

            //////////////////////////////////////////

        }

        if (valor.equals("uqroo_chetumal_videos")){
            recibidor_v.setText("Universidad de Quintana Roo Campo Chetumal");
            imagen_uni_v.setImageResource(R.drawable.uni_modelo_chetumal);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1jdocWcp2i8h5uw7PLgC6kpnyXwpeOy8C/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1Y4jpA-goL3shSF2EdRI_GB9TH9y-4v5e/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";


            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);


            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");

            //////////////////////////////////////////

        }
        if (valor.equals("ut_chetumal")){
            recibidor_v.setText("Universidad Tecnológica de Chetumal");
            imagen_uni_v.setImageResource(R.drawable.uni_modelo_chetumal);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("MENSAJE DEL RECTOR");
            recibidor_v4.setText("RECORRIDO VIRTUAL");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1TkoFJ23Eh2Laz3N90-grsVxFqVyS0VSa/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1361CNH5P_s_N2OAmVh6wDz1FgtnogTyY/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";


            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);


            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");

            //////////////////////////////////////////

        }
        ///////BACALAR/////////
        if (valor.equals("politec_bacalar_videos")){
            recibidor_v.setText("Universidad Politécnica de Bacalar");
            imagen_uni_v.setImageResource(R.drawable.uni_poli_bacalar);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("OFERTA EDUCATIVA");
            recibidor_v4.setText("BIENVENIDA");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1Kkq6l0veQwzbhPNTXl5F0qEkeDL2AvMo/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1UzU09oQs0kuNxvzeGuI1N7KzA7qCrcxT/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1oJQyW8h6tiDF3y6aWjqEJwrJ2B4o5Axo/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1uBscuAEdDIzDfNwDDdeaS5Jg5TX3Zzmg/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo5 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1bA_VSnZ5LaJlunTdTDewlgtD2sEDoPt7/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo6 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1U627PcM9RsOpBdxXNWo8h6Nh6D_N8H0Z/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo7 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/15sRmExTLVfBxlAP0VkydDOiAFHh31I9Q/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";


            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);
            WebView myWebView3 = (WebView) findViewById(R.id.video_uni3);
            WebView myWebView4 = (WebView) findViewById(R.id.video_uni4);
            WebView myWebView5 = (WebView) findViewById(R.id.video_uni5);
            WebView myWebView6 = (WebView) findViewById(R.id.video_uni6);
            WebView myWebView7 = (WebView) findViewById(R.id.video_uni7);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();
            WebSettings webSettings4= myWebView4.getSettings();
            WebSettings webSettings5= myWebView5.getSettings();
            WebSettings webSettings6= myWebView6.getSettings();
            WebSettings webSettings7= myWebView7.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);
            webSettings4.setJavaScriptEnabled(true);
            webSettings5.setJavaScriptEnabled(true);
            webSettings6.setJavaScriptEnabled(true);
            webSettings7.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");
            myWebView3.loadData(frameVideo3, "text/html", "utf-8");
            myWebView4.loadData(frameVideo4, "text/html", "utf-8");
            myWebView5.loadData(frameVideo5, "text/html", "utf-8");
            myWebView6.loadData(frameVideo6, "text/html", "utf-8");
            myWebView7.loadData(frameVideo7, "text/html", "utf-8");
            //////////////////////////////////////////

        }
        if (valor.equals("centro_edu_bacalar")){
            recibidor_v.setText("Centro Regional de Educación Normal Lic. Javier Rojo Gómez");
            imagen_uni_v.setImageResource(R.drawable.centro_regio_edu_bacalar);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1oXDUo0966-f-uCnqTtj4tzXfLdiOjyQk/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1ByUFXefiWxYjwfCosJz31te_G-OnEoom/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1_PYoVtBWs4hC7NB9tqF3zRk-OtRsaf4b/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);
            WebView myWebView3 = (WebView) findViewById(R.id.video_uni3);


            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");
            myWebView2.loadData(frameVideo3, "text/html", "utf-8");

            //////////////////////////////////////////

        }
        if (valor.equals("upp_videos")){
            recibidor_v.setText("Universidad Privada de la Península");
            imagen_uni_v.setImageResource(R.drawable.centro_regio_edu_bacalar);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("MENSAJE DEL RECTOR");
            recibidor_v4.setText("TESTIMONIO DE EGRESADA");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1NkaLj6dIGT71JSxCfyBuDbJOlzwh83U1/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1_R-yb2nuoMRt2nztFiGw5mnkcK7SSlFB/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView7 = (WebView) findViewById(R.id.video_uni7);


            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings7= myWebView7.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings7.setJavaScriptEnabled(true);


            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView7.loadData(frameVideo2, "text/html", "utf-8");

            //////////////////////////////////////////

        }
        if (valor.equals("inst_tec_felipe_videos")){
            recibidor_v.setText("Instituto Tecnológico Superior de Felipe Carrillo Puerto");
            imagen_uni_v.setImageResource(R.drawable.inst_tec_felipe_c);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("VIDEO PROMOCIONAL");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1GyhOk8VtuZanH7M2vIqAZZ2fw-rQjMhq/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);

            WebSettings webSettings1= myWebView1.getSettings();

            webSettings1.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");

            //////////////////////////////////////////

        }
        /////JOSE MARIA MORELOS///////
        if (valor.equals("uimqroo_videos")){
            recibidor_v.setText("Universidad Intercultural Maya de Quintana Roo");
            imagen_uni_v.setImageResource(R.drawable.uimqroo);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1sf5Us0AoSnv2UR_MCSwMHn51uYhdfOwh/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1hurnL7SE0bN8GI09uYWHBzw9QGCkQWXu/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");

            //////////////////////////////////////////

        }
        /////SOLIDARIDAD///////
        if (valor.equals("unisur_soli_videos")){
            recibidor_v.setText("Universidad del Sur Campus Playa del Carmen");
            imagen_uni_v.setImageResource(R.drawable.universidadsur_solidaridad);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1FrN54BRrCy-Ijj5m_rR2PusyXYDcktRa/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1xs8ymzZqc6QRd4-PLsTWoFKyJ_kKiBLX/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1afmS7zjcrGYF7x5RP_ZGghHsKFdj_ye6/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);
            WebView myWebView3 = (WebView) findViewById(R.id.video_uni3);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");
            myWebView3.loadData(frameVideo3, "text/html", "utf-8");

            //////////////////////////////////////////

        }
        if (valor.equals("uniriviera_soli_videos")){
            recibidor_v.setText("Universidad Riviera");
            imagen_uni_v.setImageResource(R.drawable.universidadriviera_solidaridad);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1C5cEr8l-gvW3GCXNt2JdmVXU6EFezAPL/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/17-wgVnNkW_nZVpn5DldqP1xfdMg6zxtn/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1M6ErWskKeq6UuFbAnODNysFlDW4qbYrl/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);
            WebView myWebView3 = (WebView) findViewById(R.id.video_uni3);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");
            myWebView3.loadData(frameVideo3, "text/html", "utf-8");

            //////////////////////////////////////////

        }
        if (valor.equals("ut_rivieramaya_soli_videos")){
            recibidor_v.setText("Universidad Tecnológica Riviera Maya");
            imagen_uni_v.setImageResource(R.drawable.universidadriviera_solidaridad);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1RXWLGElaBEwj2r3qVWTNkI-02sn-ih-a/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1qce7y1V_iidU_GwzFffn5cp_0pIjOA49/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1QrMmSPLA_B6csZsjbSsykA1vmyhtsuMQ/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);
            WebView myWebView3 = (WebView) findViewById(R.id.video_uni3);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");
            myWebView3.loadData(frameVideo3, "text/html", "utf-8");

            //////////////////////////////////////////

        }
        if (valor.equals("unid_soli_videos")){
            recibidor_v.setText("Universidad Interamericana para el Desarrollo Campus Playa del Carmen");
            imagen_uni_v.setImageResource(R.drawable.unid_solidaridad);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1rN274cwHReF8R5_BcZi9WlL0OpRTaRCf/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1T6dwT96cIpk8wLT2THQqiLxtey2UoD12/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/12d6Ysys1l5x4Ud4U_YDmCLgjWVtlA0FD/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1maJ9BWGWRh4gyv_gl2OmYpr2Q4Bm29en/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);
            WebView myWebView3 = (WebView) findViewById(R.id.video_uni3);
            WebView myWebView4 = (WebView) findViewById(R.id.video_uni4);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();
            WebSettings webSettings4= myWebView4.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);
            webSettings4.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");
            myWebView3.loadData(frameVideo3, "text/html", "utf-8");
            myWebView4.loadData(frameVideo4, "text/html", "utf-8");

            //////////////////////////////////////////

        }
        if (valor.equals("esc_enfermeria_soli_videos")){
            recibidor_v.setText("Escuela de enfermería Ignacio Chávez");
            imagen_uni_v.setImageResource(R.drawable.esc_enfermeria_solidaridad);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("No hay videos");
            recibidor_v4.setText("");
            //////////////////////////////////////////

        }
        /////COZUMEL///////
        if (valor.equals("inst_partenon_cozumel_videos")){
            recibidor_v.setText("Instituto Partenón de Cozumel");
            imagen_uni_v.setImageResource(R.drawable.inst_partenon_cozumel);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/15R0ov7or8VS3ehyDv4xRuzv-bYZBGzaV/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1q_jYdqsiY_Q0E9orCJcgMPGgAyWC6qfZ/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1b9C-gFPWMD7fQbp6CjUDuU0mQhgs25D2/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);
            WebView myWebView3 = (WebView) findViewById(R.id.video_uni3);


            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");
            myWebView3.loadData(frameVideo3, "text/html", "utf-8");

            //////////////////////////////////////////
        }
        /////BENITO JUÁREZ///////
        if (valor.equals("upqroo_benito_juarez_videos")){
            recibidor_v.setText("Instituto Partenón de Cozumel");
            imagen_uni_v.setImageResource(R.drawable.upqroo_benito_juarez);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1yQsJ5HeOF0ntmPnsFoyqqewHgY7Qyc-Z/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1RIMkbs83zouhKHD4MvqKhFYLUNvLntfp/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1jOld8s-jfRWlVbXyu9bbDzMBJuKl5aSo/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1oAqFFgJAZg1EUu9fVBdDsh89M87KWpGt/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);
            WebView myWebView3 = (WebView) findViewById(R.id.video_uni3);
            WebView myWebView4 = (WebView) findViewById(R.id.video_uni4);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();
            WebSettings webSettings4= myWebView4.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);
            webSettings4.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");
            myWebView3.loadData(frameVideo3, "text/html", "utf-8");
            myWebView4.loadData(frameVideo4, "text/html", "utf-8");

            //////////////////////////////////////////
        }
        if (valor.equals("ut_benito_juarez_videos")){
            recibidor_v.setText("Universidad Tecnológica de Cancún");
            imagen_uni_v.setImageResource(R.drawable.upqroo_benito_juarez);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1epE0lUYQvexwMQCwXh1K0cF2oMsbEJWW/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1c0mVpRZrTOKpM6TjXaNPRm77A63eTRgn/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);


            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();


            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");


            //////////////////////////////////////////
        }
        if (valor.equals("henbord_benito_juarez_videos")){
            recibidor_v.setText("Universidad Henbord");
            imagen_uni_v.setImageResource(R.drawable.uni_henbord_benito_juarez);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1Oi4pJRsRm6jrOJ4NhSEnwF2MJ8i0JUsw/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1qGOjWtfClMy35lksXxDfu4oDRCiCzgY-/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1LYx8KaZ4G4C_8gXwIaqokDMEYE122vwg/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);
            WebView myWebView3 = (WebView) findViewById(R.id.video_uni3);


            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();


            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");
            myWebView3.loadData(frameVideo3, "text/html", "utf-8");

            //////////////////////////////////////////
        }
        if (valor.equals("uni_azteca_benito_juarez_videos")){
            recibidor_v.setText("Universidad Azteca");
            imagen_uni_v.setImageResource(R.drawable.uni_azteca_benito_juarez);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/14pdBHJH3vZROiEQ1e6wmg8jcWPZt4I71/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/19Q61tfevfNNpC7TlDZICLRJDjYrC205P/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1SyPXK9N9a49LEK56vFw_10Z4HQdvtC6Z/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1OH4slbc0cu37_bBMKhQRBjcuZTdtyYlz/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);
            WebView myWebView3 = (WebView) findViewById(R.id.video_uni3);
            WebView myWebView4 = (WebView) findViewById(R.id.video_uni4);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();
            WebSettings webSettings4= myWebView4.getSettings();


            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);
            webSettings4.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");
            myWebView3.loadData(frameVideo3, "text/html", "utf-8");
            myWebView4.loadData(frameVideo4, "text/html", "utf-8");

            //////////////////////////////////////////
        }
        if (valor.equals("uni_azteca_benito_juarez_videos")){
            recibidor_v.setText("Cento de Estudios Gestalt");
            imagen_uni_v.setImageResource(R.drawable.centro_gestalt_benito_juarez);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1EZ6zRUNISoK8tbGX-jh9iYvPhNg4jokl/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1V7asZtJZIV2-41hib4WJqr1LcN6xS5ZC/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1qOJ3K_-ptXUt-4--khed5ARa3VSMwpQb/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1NgU10htDZg0wVnDnN5quuQFEiubAtt2b/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);
            WebView myWebView3 = (WebView) findViewById(R.id.video_uni3);
            WebView myWebView4 = (WebView) findViewById(R.id.video_uni4);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();
            WebSettings webSettings4= myWebView4.getSettings();


            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);
            webSettings4.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");
            myWebView3.loadData(frameVideo3, "text/html", "utf-8");
            myWebView4.loadData(frameVideo4, "text/html", "utf-8");

            //////////////////////////////////////////
        }
        if (valor.equals("la_salle_benito_juarez_videos")){
            recibidor_v.setText("La Salle Campus Cancún");
            imagen_uni_v.setImageResource(R.drawable.la_salle_benito_juarez);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1IoT0yqfUCq85iDkPFCE80FbXy4zRc18i/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1mG7pdB0C4D1drIzKDsptmhx-fNEe2VY3/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();


            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);


            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");

            //////////////////////////////////////////
        }
        if (valor.equals("inst_humanista_benito_juarez_videos")){
            recibidor_v.setText("Instituto Humanista de Psicoterapia Gestalt");
            imagen_uni_v.setImageResource(R.drawable.inst_humanista_gestalt_benito_juarez);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1UrfP8VQWKtqTvTb1BcdDECkeJ8ja2yfI/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1UNP_Lq64aOzrfYuzmiuLTog_jh44EF_k/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/10ibhEzlmkYK1DydzM2e9S-sVgSfKo8n3/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);
            WebView myWebView3 = (WebView) findViewById(R.id.video_uni3);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");
            myWebView3.loadData(frameVideo3, "text/html", "utf-8");

            //////////////////////////////////////////
        }
        if (valor.equals("unisur_benito_juarez_videos")){
            recibidor_v.setText("Universidad del Sur Campus Cancún");
            imagen_uni_v.setImageResource(R.drawable.unisur_benito_juarez);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/151MLv0yoz4eJzviIrifNF7wXEjlap-dB/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1g1trHf1UCIf8psIEwY9SGR-E5cLfrpRs/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1Taqf8vgK3gJ3r2ipl3tHwhDWyn9gQJ-T/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);
            WebView myWebView3 = (WebView) findViewById(R.id.video_uni3);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");
            myWebView3.loadData(frameVideo3, "text/html", "utf-8");

            //////////////////////////////////////////
        }
        if (valor.equals("sup_leyes_benito_juarez_videos")){
            recibidor_v.setText("Instituto Superior de Leyes");
            imagen_uni_v.setImageResource(R.drawable.instituto_sup_leyes_benito_juarez);
            recibidor_v2.setText("VIDEOS");
            recibidor_v3.setText("");
            recibidor_v4.setText("");
            //////////////////////////////////////////

            String frameVideo1 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1JtwgDmyl1H2Pws5FcqVSaCh1siHPAgkj/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1pYKyazhgzU0dINcRsCUEUB3uyIXRxlaj/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String frameVideo3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1Crx9D3cFajdJJ9_f6eWtcjOOM2qp7LJO/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.video_uni1);
            WebView myWebView2 = (WebView) findViewById(R.id.video_uni2);
            WebView myWebView3 = (WebView) findViewById(R.id.video_uni3);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);

            myWebView1.loadData(frameVideo1, "text/html", "utf-8");
            myWebView2.loadData(frameVideo2, "text/html", "utf-8");
            myWebView3.loadData(frameVideo3, "text/html", "utf-8");

            //////////////////////////////////////////
        }
    }
}