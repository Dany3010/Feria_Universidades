package com.example.feria_universidades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

public class Admision_uni_detalle extends AppCompatActivity {
    ImageView imagen_uni;
    TextView recibidor,recibidor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admision_uni_detalle);
        Bundle bundle = getIntent().getExtras();
        String valor =bundle.getString("universidad4");
        recibidor= (TextView) findViewById(R.id.tituloUni_admi);
        recibidor2= (TextView) findViewById(R.id.subtituloUni_admi);
        imagen_uni = (ImageView)findViewById(R.id.imagenUni_Ad);

        if (valor.equals("uni_itzm_admis")){
            recibidor.setText("Instituto Tecnológico de la Zona Maya");
            imagen_uni.setImageResource(R.drawable.itzm);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1BUKAH3H3DfLjM_brWeqOFqych0zchizQ/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");

        }
        if (valor.equals("uni_cudv_admis")){
            recibidor.setText("Centro Universitario de Desarrollo Vanguardista");
            imagen_uni.setImageResource(R.drawable.cudv_1);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1E7ubktTER-HmZrGNLlJnBfhfbjgrOsmW/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");

        }
        if (valor.equals("unid_chetumal_admis")){
            recibidor.setText("Universidad Interamericana para el  Desarrollo Campus Chetumal");
            imagen_uni.setImageResource(R.drawable.unid_chetumal);
            recibidor2.setText("PROCESO DE ADMISIÓN");

        }
        if (valor.equals("modelo_chetumal_admis")){
            recibidor.setText("Universidad Modelo");
            imagen_uni.setImageResource(R.drawable.uni_modelo_chetumal);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1vbROgVyHvSmZ-MKXBjrjL6y-RjO917ep/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");

        }
        if (valor.equals("uni_wozniak_admis")){
            recibidor.setText("Instituto de Estudios Superiores Wozniak");
            imagen_uni.setImageResource(R.drawable.wozniak);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1hCSb4UNKrlNEQqveEhCctAiqkKfeBNSe/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");


        }
        if (valor.equals("uqroo_chetumal_admis")){
            recibidor.setText("Universidad de Quintana Roo Campo Chetumal");
            imagen_uni.setImageResource(R.drawable.uqroo);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/185GLE-S3uP7KOAzjZD0z7hpTJy3FPzz8/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");


        }

        ///////BACALAR/////////
        if (valor.equals("politec_bacalar_admis")){
            recibidor.setText("Universidad Politécnica de Bacalar");
            imagen_uni.setImageResource(R.drawable.uni_poli_bacalar);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1OjkF9ci4Mm5Q71iUesgJ3HJMfO7zAkvS/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");
        }
        if (valor.equals("edu_bacalar_admis")){
            recibidor.setText("Centro Regional de Educación Normal Lic. Javier Rojo Gómez");
            imagen_uni.setImageResource(R.drawable.centro_regio_edu_bacalar);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1L7YuZ8jTd702SS6K_C5gdLsqSYhdmBK1/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");
        }
        /////FELIPE CARRILLO PUERTO////////
        if (valor.equals("upp_admis")){
            recibidor.setText("Universidad Privada de la Península");
            imagen_uni.setImageResource(R.drawable.upp);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/q4Qdl3a4WMvnoEURmVl64X5551zoyFof/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");
        }
        if (valor.equals("inst_tec_felipe_admis")){
            recibidor.setText("Instituto Tecnológico Superior de Felipe Carrillo Puerto");
            imagen_uni.setImageResource(R.drawable.inst_tec_felipe_c);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1gkSJYYvEfmOwukep9yCVWoVJbJOmnvjx/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");
        }
        /////JOSE MARIA MORELOS///////
        if (valor.equals("uimqroo_admis")){
            recibidor.setText("Universidad Intercultural Maya de Quintana Roo");
            imagen_uni.setImageResource(R.drawable.uimqroo);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1btIkpv2y6NZdXMaORRsr45f_hVBLD_hy/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");
        }
        /////SOLIDARIDAD///////
        if (valor.equals("unisur_soli_admis")){
            recibidor.setText("Universidad del Sur Campus Playa del Carmen");
            imagen_uni.setImageResource(R.drawable.universidadsur_solidaridad);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1ShFZKtWMcaTtjHegCn_PM91GU8Hzuj0Y/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");
        }
        if (valor.equals("uniriviera_soli_admis")){
            recibidor.setText("Universidad Riviera");
            imagen_uni.setImageResource(R.drawable.universidadriviera_solidaridad);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1k3xwl3PprEGzeOlkeYJ_yEV8VTLDhOHX/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");
        }
        if (valor.equals("ut_rivieramaya_soli_admis")){
            recibidor.setText("Universidad Tecnológica Riviera Maya");
            imagen_uni.setImageResource(R.drawable.ut_rivieramaya_solidaridad);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1z5KE9iTP68pDwrRNKhHlfN-JpTgtN0Lk/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");
        }
        if (valor.equals("unid_soli_admis")){
            recibidor.setText("Universidad Interamericana para el Desarrollo Campus Playa del Carmen");
            imagen_uni.setImageResource(R.drawable.unid_solidaridad);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1ziaAuvQuRNbOBf52Xy2-xK9zpbGvBvaK/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");
        }
        if (valor.equals("esc_enfermeria_soli_admis")){
            recibidor.setText("Escuela de enfermería Ignacio Chávez");
            imagen_uni.setImageResource(R.drawable.esc_enfermeria_solidaridad);
            recibidor2.setText("PROCESO DE ADMISIÓN");


        }
        /////COZUMEL///////
        if (valor.equals("inst_partenon_cozumel_admis")){
            recibidor.setText("Instituto Partenón de Cozumel");
            imagen_uni.setImageResource(R.drawable.inst_partenon_cozumel);
            recibidor2.setText("PROCESO DE ADMISIÓN");


        }
        /////BENITO JUÁREZ///////
        if (valor.equals("upqroo_benito_juarez_admis")){
            recibidor.setText("Universidad Politécnica de Quintana Roo");
            imagen_uni.setImageResource(R.drawable.upqroo_benito_juarez);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1Jxtni2ungr_BLeKQHfmGvAMPsuiSjvR6/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");


        }
        if (valor.equals("ut_benito_juarez_admis")){
            recibidor.setText("Universidad Tecnológica de Cancún");
            imagen_uni.setImageResource(R.drawable.ut_benito_juarez);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1ugNpXtLxuzuflHSvv2KcyzEz54TrSq6Q/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");


        }
        if (valor.equals("henbord_benito_juarez_admis")){
            recibidor.setText("Universidad Henbord");
            imagen_uni.setImageResource(R.drawable.uni_henbord_benito_juarez);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1wUpdYHAE4H9pXYZCaK5PeGyQXJQQ1UPp/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");

        }
        if (valor.equals("uni_azteca_benito_juarez_admis")){
            recibidor.setText("Universidad Azteca");
            imagen_uni.setImageResource(R.drawable.uni_azteca_benito_juarez);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1DUpnylrV9joRMR4w7y1jax9NTUFd98Yb/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");

        }
        if (valor.equals("centro_gestalt_benito_juarez_admis")){
            recibidor.setText("Cento de Estudios Gestalt");
            imagen_uni.setImageResource(R.drawable.centro_gestalt_benito_juarez);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1gV-yTlLYfoyeCNBXXTun-xCxWjMeOhzM/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");

        }
        if (valor.equals("la_salle_benito_juarez_admis")){
            recibidor.setText("La Salle Campus Cancún");
            imagen_uni.setImageResource(R.drawable.la_salle_benito_juarez);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/19XAHDp8gcW2kPNi-9Hnwet1mA6IFZSYO/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");

        }
        if (valor.equals("inst_humanista_benito_juarez_admis")){
            recibidor.setText("Instituto Humanista de Psicoterapia Gestalt");
            imagen_uni.setImageResource(R.drawable.inst_humanista_gestalt_benito_juarez);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/165OeX5q5448eXkmmCzqZHA2N7qX1nUbn/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1IBFLhWfdDrZVI8nSQCQWNggGBSU1P5g4/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu3 = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1Vd5N0ScakcpDdU-bFlToSbKVCR7pRpJk/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu4 = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1URIyGnb32zoiE-7W9wzzgE_rAjSIkjiB/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu5 = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1DqCDVHHn7NknPND4NfNumW_KgVlaq9d4/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebView myWebView2 = (WebView) findViewById(R.id.web_admis2);
            WebView myWebView3 = (WebView) findViewById(R.id.web_admis3);
            WebView myWebView4 = (WebView) findViewById(R.id.web_admis4);
            WebView myWebView5 = (WebView) findViewById(R.id.web_admis5);

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

            myWebView1.loadData(framedocu, "text/html", "utf-8");
            myWebView2.loadData(framedocu2, "text/html", "utf-8");
            myWebView3.loadData(framedocu3, "text/html", "utf-8");
            myWebView4.loadData(framedocu4, "text/html", "utf-8");
            myWebView5.loadData(framedocu5, "text/html", "utf-8");

        }
        if (valor.equals("unisur_benito_juarez_admis")){
            recibidor.setText("Universidad del Sur Campus Cancún");
            imagen_uni.setImageResource(R.drawable.unisur_benito_juarez);
            recibidor2.setText("PROCESO DE ADMISIÓN");

            String framedocu = "<html><body><br><iframe width=\"360\" height=\"330\"  src=\"https://drive.google.com/file/d/1ae8jjRHhd3spZcDWf_lt_puL19YbHgTa/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            WebView myWebView1 = (WebView) findViewById(R.id.web_admis);
            WebSettings webSettings1= myWebView1.getSettings();
            webSettings1.setJavaScriptEnabled(true);
            myWebView1.loadData(framedocu, "text/html", "utf-8");

        }
        if (valor.equals("sup_leyes_benito_juarez_admis")){
            recibidor.setText("Instituto Superior de Leyes");
            imagen_uni.setImageResource(R.drawable.instituto_sup_leyes_benito_juarez);
            recibidor2.setText("PROCESO DE ADMISIÓN");


        }
    }

}