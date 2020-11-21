package com.example.feria_universidades;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.MediaController;
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
            WebView myWebView5 = (WebView) findViewById(R.id.video_uni5);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();
            WebSettings webSettings4= myWebView4.getSettings();
            WebSettings webSettings5= myWebView4.getSettings();

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
            imagen_uni_v.setImageResource(R.drawable.cudv_1);
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
    }
}