package com.example.feria_universidades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class Ofertas_uni_detalle extends AppCompatActivity {
    Context context;
    ImageView imagen_uni_o;
    TextView recibidor,recibidor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ofertas_uni_detalle);

        Bundle bundle = getIntent().getExtras();
        String valor =bundle.getString("universidad5");
        recibidor= (TextView) findViewById(R.id.tituloUni_Ofertas);
        recibidor2= (TextView) findViewById(R.id.subtituloUni_Ofertas);
        imagen_uni_o = (ImageView)findViewById(R.id.imagenUni_Of1);

        if (valor.equals("uni_itzm_ofertas")){
            recibidor.setText("Instituto Tecnológico de la Zona Maya");
            imagen_uni_o.setImageResource(R.drawable.itzm);
            recibidor2.setText("OFERTA EDUCATIVA");

            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1PqqJZ24cFgVIn-b8ibwV-XpFG4LbNBW2/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);

            WebSettings webSettings1= myWebView1.getSettings();

            webSettings1.setJavaScriptEnabled(true);

            myWebView1.loadData(framedocu, "text/html", "utf-8");


        }
        if (valor.equals("uni_cudv_ofertas")){
            recibidor.setText("Centro Universitario de Desarrollo Vanguardista");
            imagen_uni_o.setImageResource(R.drawable.cudv_1);
            recibidor2.setText("OFERTA EDUCATIVA");

            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1GUYX20fAiC-UmA-p2WIGvPI82_dwQGNy/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);

            WebSettings webSettings1= myWebView1.getSettings();

            webSettings1.setJavaScriptEnabled(true);

            myWebView1.loadData(framedocu, "text/html", "utf-8");


        }
        if (valor.equals("unid_chetumal_ofertas")){
            recibidor.setText("Universidad Interamericana para el  Desarrollo Campus Chetumal");
            imagen_uni_o.setImageResource(R.drawable.unid_chetumal);
            recibidor2.setText("OFERTA EDUCATIVA");

            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1_6dxsbxBUSuLUZ2yjzBy7YUmG2QL30oT/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);

            WebSettings webSettings1= myWebView1.getSettings();

            webSettings1.setJavaScriptEnabled(true);

            myWebView1.loadData(framedocu, "text/html", "utf-8");

        }
        if (valor.equals("uni_wozniak_ofertas")){
            recibidor.setText("Instituto de Estudios Superiores Wozniak");
            imagen_uni_o.setImageResource(R.drawable.wozniak);
            recibidor2.setText("OFERTA EDUCATIVA");

            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1Jiwnl6BipBvFl7JnXNVpFJ0outFBuG77/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1Jiwnl6BipBvFl7JnXNVpFJ0outFBuG77/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/13Vhj9mYkz59x4EI9CoVAkltqXsNcKuN5/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/157rzwugbZ-jg7R8ZCLyTsPO6d3bvMbgW/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu5 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/171Zp_6P33bn2pQsCPIWWN4aW2dYGtFop/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);
            WebView myWebView3 = (WebView) findViewById(R.id.webOfert3);
            WebView myWebView4 = (WebView) findViewById(R.id.webOfert4);
            WebView myWebView5 = (WebView) findViewById(R.id.webOfert5);

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
        if (valor.equals("modelo_chetumal_ofertas")){
            recibidor.setText("Universidad Modelo");
            imagen_uni_o.setImageResource(R.drawable.uni_modelo_chetumal);
            recibidor2.setText("OFERTA EDUCATIVA");

            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1Jiwnl6BipBvFl7JnXNVpFJ0outFBuG77/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1-xugL_yuBsMhD7gN4KKXj5YDGUB8m7Ai/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1aXIoLA9HVS-5C09xB_2kmyW578mIgozQ/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1DtV9OlWOGZleoW8qS7R_sUKsZNPwpUfW/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu5 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1iq8lTi_lhBvQK9DbigY0s_rmfllVOsB2/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);
            WebView myWebView3 = (WebView) findViewById(R.id.webOfert3);
            WebView myWebView4 = (WebView) findViewById(R.id.webOfert4);
            WebView myWebView5 = (WebView) findViewById(R.id.webOfert5);

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
        if (valor.equals("uqroo_chetumal_ofertas")){
            recibidor.setText("Universidad de Quintana Roo Campo Chetumal");
            imagen_uni_o.setImageResource(R.drawable.uqroo);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1JETUiLjMcGGQwOYzizA9rLCPhVfs3WB1/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);

            WebSettings webSettings1= myWebView1.getSettings();

            webSettings1.setJavaScriptEnabled(true);

            myWebView1.loadData(framedocu, "text/html", "utf-8");

        }
        if (valor.equals("ut_chetumal_ofertas")){
            recibidor.setText("Universidad Tecnológica de Chetumal");
            imagen_uni_o.setImageResource(R.drawable.ut_chetumal);
            recibidor2.setText("OFERTA EDUCATIVA");
            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1UlvnzLFSZzKChiIKLBpEmDW_C_Tn9O9u/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1YGzMwWgffRdt9qPDrSlUjQeg8cw5s6NJ/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1lixcRPWo68MgiEUC9DubyHwd1M6qLHgy/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1UirfN9EQrKkdTHqqjwrjH53pKOSRN0Gp/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);
            WebView myWebView3 = (WebView) findViewById(R.id.webOfert3);
            WebView myWebView4 = (WebView) findViewById(R.id.webOfert4);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();
            WebSettings webSettings4= myWebView4.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);
            webSettings4.setJavaScriptEnabled(true);

            myWebView1.loadData(framedocu, "text/html", "utf-8");
            myWebView2.loadData(framedocu2, "text/html", "utf-8");
            myWebView3.loadData(framedocu3, "text/html", "utf-8");
            myWebView4.loadData(framedocu4, "text/html", "utf-8");
        }
        ///////BACALAR/////////
        if (valor.equals("politec_bacalar_ofertas")){
            recibidor.setText("Universidad Politécnica de Bacalar");
            imagen_uni_o.setImageResource(R.drawable.uni_poli_bacalar);
            recibidor2.setText("OFERTA EDUCATIVA");
            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/13aCwtdizaaXiMCla_GKKS1GbCpBipXjs/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1Oz6DCdWUEgYnhJFzbPwJrYYB8dDcHKo_/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1nxAv9TI4-o3g7WjSi_ubH2aBMhDI8mKe/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1NMyZNke3Zc1HNvST2QO-C3G8IbKbzIZz/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);
            WebView myWebView3 = (WebView) findViewById(R.id.webOfert3);
            WebView myWebView4 = (WebView) findViewById(R.id.webOfert4);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();
            WebSettings webSettings4= myWebView4.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);
            webSettings4.setJavaScriptEnabled(true);

            myWebView1.loadData(framedocu, "text/html", "utf-8");
            myWebView2.loadData(framedocu2, "text/html", "utf-8");
            myWebView3.loadData(framedocu3, "text/html", "utf-8");
            myWebView4.loadData(framedocu4, "text/html", "utf-8");


        }
        /////FELIPE CARRILLO PUERTO////////
        if (valor.equals("upp_ofertas")){
            recibidor.setText("Universidad Privada de la Península");
            imagen_uni_o.setImageResource(R.drawable.upp);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/12aC2eExmMwhHg-MDiZr5NLdu-EFiQ5fL/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);

            WebSettings webSettings1= myWebView1.getSettings();

            webSettings1.setJavaScriptEnabled(true);

            myWebView1.loadData(framedocu, "text/html", "utf-8");

        }

        /////JOSE MARIA MORELOS///////
        if (valor.equals("uimqroo_ofertas")){
            recibidor.setText("Universidad Intercultural Maya de Quintana Roo");
            imagen_uni_o.setImageResource(R.drawable.uimqroo);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1U7H-EImiPBN2dFoiWedi4uXVpAQZl3iO/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1_wiyG5GvqDFg3SHqZUauKccz-gt55mde/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);

            myWebView1.loadData(framedocu, "text/html", "utf-8");
            myWebView2.loadData(framedocu2, "text/html", "utf-8");

        }
        /////SOLIDARIDAD///////
        if (valor.equals("unisur_soli_ofertas")){
            recibidor.setText("Universidad del Sur Campus Playa del Carmen");
            imagen_uni_o.setImageResource(R.drawable.universidadsur_solidaridad);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1hLeXK9jXXkkBRj4ahw5SWARnMNwr51Io/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1PhWM6Jr1JNX3F4OTudk-DylrsL64a1nr/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);

            myWebView1.loadData(framedocu, "text/html", "utf-8");
            myWebView2.loadData(framedocu2, "text/html", "utf-8");

        }
        if (valor.equals("uniriviera_soli_ofertas")){
            recibidor.setText("Universidad Riviera");
            imagen_uni_o.setImageResource(R.drawable.universidadriviera_solidaridad);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1FInlhmdMMdJ2IY2Qj6j8gxmsSb0K9lRi/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1h5dTPnHm5kM3fcb7iUOMpcpJ0Mbj4bBj/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1iU19VXSaAT-HhoTIcbi6EQudxJDO-fPo/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1hjvPTmR79-BF6qHEJaac3yPLHkrUQrME/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu5 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1q_3tAVBjKA-A8TQGaBrYoy2nJXYWRS0H/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);
            WebView myWebView3 = (WebView) findViewById(R.id.webOfert3);
            WebView myWebView4 = (WebView) findViewById(R.id.webOfert4);
            WebView myWebView5 = (WebView) findViewById(R.id.webOfert5);

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
        if (valor.equals("ut_rivieramaya_soli_ofertas")){
            recibidor.setText("Universidad Tecnológica Riviera Maya");
            imagen_uni_o.setImageResource(R.drawable.ut_rivieramaya_solidaridad);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1fLQv-IbvcwS4r0R0dVW6IvvbXUNtZBg8/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1SAphYKjdmLQhQsmbYe0E2a9IF-FIh385/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1oJ5tZf2Askw9Ljkmiz2T6NIQjweCQ5hQ/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1IWoqhm8zNo2XFhRfTAgxrfuBYyTL0acC/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu5 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1_NR4KqPk-OCQpHkJXMxT8nB_w5i5uqfn/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);
            WebView myWebView3 = (WebView) findViewById(R.id.webOfert3);
            WebView myWebView4 = (WebView) findViewById(R.id.webOfert4);
            WebView myWebView5 = (WebView) findViewById(R.id.webOfert5);

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
        if (valor.equals("unid_soli_ofertas")){
            recibidor.setText("Universidad Interamericana para el Desarrollo Campus Playa del Carmen");
            imagen_uni_o.setImageResource(R.drawable.unid_solidaridad);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1CxkmKKT1NMCNUbYPlwwXdx5zt8qykmGy/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1ZdnmLDW5bnsxotS1bhmJUWGCdH-RXv4k/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1_yEZk47CnIg0gDUNQ7kNDT13aTAjoJpq/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1bUPgmjjGAx_KStpAqMRyJp5SwjkT_I1t/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu5 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1KYFO89T3u9ctBN078Qi8t5Wsdct5xQ8b/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);
            WebView myWebView3 = (WebView) findViewById(R.id.webOfert3);
            WebView myWebView4 = (WebView) findViewById(R.id.webOfert4);
            WebView myWebView5 = (WebView) findViewById(R.id.webOfert5);

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
        if (valor.equals("esc_enfermeria_soli_ofertas")){
            recibidor.setText("Escuela de enfermería Ignacio Chávez");
            imagen_uni_o.setImageResource(R.drawable.esc_enfermeria_solidaridad);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1ow-jKS4TrnDFPOQrXwdmMn3nW5E4GyZ4/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);


            WebSettings webSettings1= myWebView1.getSettings();


            webSettings1.setJavaScriptEnabled(true);

            myWebView1.loadData(framedocu, "text/html", "utf-8");

        }
        /////COZUMEL///////
        if (valor.equals("inst_partenon_cozumel_ofertas")){
            recibidor.setText("Instituto Partenón de Cozumel");
            imagen_uni_o.setImageResource(R.drawable.inst_partenon_cozumel);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1jnAECMO8hPBR2-q8edctAxBmr4jIbo9c/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1T0GGIkKSnuQTO_bcn54wnxv60NmMfEpA/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/12kO6QZCpwazMTJeR_0aK7-kL3Xfdi01d/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);
            WebView myWebView3 = (WebView) findViewById(R.id.webOfert3);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);

            myWebView1.loadData(framedocu, "text/html", "utf-8");
            myWebView2.loadData(framedocu2, "text/html", "utf-8");
            myWebView3.loadData(framedocu3, "text/html", "utf-8");
        }
        /////BENITO JUÁREZ///////
        if (valor.equals("upqroo_benito_juarez_ofertas")){
            recibidor.setText("Universidad Politécnica de Quintana Roo");
            imagen_uni_o.setImageResource(R.drawable.upqroo_benito_juarez);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1bDwpYlEZiNeJpghW_pfLxONhe4CXfsei/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/14lYOwjxOhqrsZksVc2cJI-RC1FuAZG2C/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1ZZEkEpTW5hw0UtnU9riqkjQypNoZEOQ_/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1ruMwvSmlSIOFD5NB4yTuW7p53T6sYaUw/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu5 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1W2IoSpADkg4F_svaCom2FJ5hHVyOzurk/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);
            WebView myWebView3 = (WebView) findViewById(R.id.webOfert3);
            WebView myWebView4 = (WebView) findViewById(R.id.webOfert4);
            WebView myWebView5 = (WebView) findViewById(R.id.webOfert5);

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
        if (valor.equals("ut_benito_juarez_ofertas")){
            recibidor.setText("Universidad Tecnológica de Cancún");
            imagen_uni_o.setImageResource(R.drawable.ut_benito_juarez);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1SprHItZWg4T56dZXrPGyEe6snUZKKGWl/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1XE95wzfETnpSw0a2rP0jQUm9PmZo96D7/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1AhhCoX6PuWTqaA30HI4WiQhKTLxf3-e0/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1m1WhtUkGe_L9w7ATM3o7C-biP881JFfv/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu5 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1jP5doCHb1fZz5W7V-xyoASSc4_YC3hRh/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);
            WebView myWebView3 = (WebView) findViewById(R.id.webOfert3);
            WebView myWebView4 = (WebView) findViewById(R.id.webOfert4);
            WebView myWebView5 = (WebView) findViewById(R.id.webOfert5);

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
        if (valor.equals("henbord_benito_juarez_ofertas")){
            recibidor.setText("Universidad Henbord");
            imagen_uni_o.setImageResource(R.drawable.uni_henbord_benito_juarez);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1c2GMKpeWYBKKKaeaMwq432iQ0MmEzXJX/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1wORwkuN1MMDHrYqPstv8ly0LA4AMILm-/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1ckegyplbbXB9IpdSbCQk0iEUQECOvEde/view/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1e78DoqssRQrHGB_hfqf4k65rpzosXXfZ/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu5 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1ce0BG9qhfcRtVOxinZlM8UQBriAiD7u6/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);
            WebView myWebView3 = (WebView) findViewById(R.id.webOfert3);
            WebView myWebView4 = (WebView) findViewById(R.id.webOfert4);
            WebView myWebView5 = (WebView) findViewById(R.id.webOfert5);

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
        if (valor.equals("uni_azteca_benito_juarez_ofertas")){
            recibidor.setText("Universidad Azteca");
            imagen_uni_o.setImageResource(R.drawable.uni_azteca_benito_juarez);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1-PUEwdw3HT_8IK-0vbKzJMRL2r3VVa77/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);

            WebSettings webSettings1= myWebView1.getSettings();

            webSettings1.setJavaScriptEnabled(true);

            myWebView1.loadData(framedocu, "text/html", "utf-8");

        }
        if (valor.equals("centro_gestalt_benito_juarez_ofertas")){
            recibidor.setText("Cento de Estudios Gestalt");
            imagen_uni_o.setImageResource(R.drawable.centro_gestalt_benito_juarez);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1NnkPEbq0_REwiQAxWACD9e47uiQm6dQ7/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1Wy_zQds84GkFqvRn0KKBq3KWmEMg3b0W/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1Rcei-nMS9-FYmWz0YVVAikdH2zqbZJXv/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1TdUO6uht9DX8XP491b6MmFzO5Ks9qXkW/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu5 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1O39ZPI6rCHWFTmeE96DawiK1J5mJh4Tn/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);
            WebView myWebView3 = (WebView) findViewById(R.id.webOfert3);
            WebView myWebView4 = (WebView) findViewById(R.id.webOfert4);
            WebView myWebView5 = (WebView) findViewById(R.id.webOfert5);

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
        if (valor.equals("la_salle_benito_juarez_ofertas")){
            recibidor.setText("La Salle Campus Cancún");
            imagen_uni_o.setImageResource(R.drawable.la_salle_benito_juarez);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1mBp3EeHLyVCaVVCmAAkwRefRethauHzO/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1-ePoEUrq5qkTmkX7HxcVZVccV363dmdN/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1MN7XrV0kTXuRQPHA1xnaoObFC8V48kOu/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1B4RurcwYoW2vxFjxbDaC-rvCwpQFcycy/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu5 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1gEArSxgqk7d2pga_1IpiSrSG4FHuo9ez/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);
            WebView myWebView3 = (WebView) findViewById(R.id.webOfert3);
            WebView myWebView4 = (WebView) findViewById(R.id.webOfert4);
            WebView myWebView5 = (WebView) findViewById(R.id.webOfert5);

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
        if (valor.equals("inst_humanista_benito_juarez_ofertas")){
            recibidor.setText("Instituto Humanista de Psicoterapia Gestalt");
            imagen_uni_o.setImageResource(R.drawable.inst_humanista_gestalt_benito_juarez);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1JL8UmkPM-pNduXaxY0qqP1Rg21iGg72l/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1o-S6wZWZeReSlMRsJfGQrtaHJNbp9MeA/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/13hMtvGyp32EW6Ow4OfKybHumlLMXYcaE/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu4 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1aC9ahaBINayaZkcXxgvbZgHMviceal_A/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);
            WebView myWebView3 = (WebView) findViewById(R.id.webOfert3);
            WebView myWebView4 = (WebView) findViewById(R.id.webOfert4);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();
            WebSettings webSettings4= myWebView4.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);
            webSettings4.setJavaScriptEnabled(true);

            myWebView1.loadData(framedocu, "text/html", "utf-8");
            myWebView2.loadData(framedocu2, "text/html", "utf-8");
            myWebView3.loadData(framedocu3, "text/html", "utf-8");
            myWebView4.loadData(framedocu4, "text/html", "utf-8");

        }
        if (valor.equals("unisur_benito_juarez_ofertas")){
            recibidor.setText("Universidad del Sur Campus Cancún");
            imagen_uni_o.setImageResource(R.drawable.unisur_benito_juarez);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/164Ekc_MTpz41YRiFTEh5F6DFZLPw6RbM/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1LbwXYoSu2tW12xI5saO--db3Ohy-Eqfy/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);

            myWebView1.loadData(framedocu, "text/html", "utf-8");
            myWebView2.loadData(framedocu2, "text/html", "utf-8");

        }
        if (valor.equals("sup_leyes_benito_juarez_ofertas")){
            recibidor.setText("Instituto Superior de Leyes");
            imagen_uni_o.setImageResource(R.drawable.instituto_sup_leyes_benito_juarez);
            recibidor2.setText("OFERTA EDUCATIVA");


            String framedocu = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1-ujxB53yCiW336WrHvOfmJt_sRjEdUqO/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu2 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1Yorao0y-rmqEhHp7H2IQ0W_mG70_acNI/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";
            String framedocu3 = "<html><body><br><iframe width=\"370\" height=\"260\"  src=\"https://drive.google.com/file/d/1NoHngn9iUuePRacZKFD6dxTY6mZ_5E2R/preview\" frameborder=\"0\" allowfullscreen></iframe></body></html>";

            WebView myWebView1 = (WebView) findViewById(R.id.webOfert);
            WebView myWebView2 = (WebView) findViewById(R.id.webOfert2);
            WebView myWebView3 = (WebView) findViewById(R.id.webOfert3);

            WebSettings webSettings1= myWebView1.getSettings();
            WebSettings webSettings2= myWebView2.getSettings();
            WebSettings webSettings3= myWebView3.getSettings();

            webSettings1.setJavaScriptEnabled(true);
            webSettings2.setJavaScriptEnabled(true);
            webSettings3.setJavaScriptEnabled(true);

            myWebView1.loadData(framedocu, "text/html", "utf-8");
            myWebView2.loadData(framedocu2, "text/html", "utf-8");
            myWebView3.loadData(framedocu3, "text/html", "utf-8");

        }
    }
}