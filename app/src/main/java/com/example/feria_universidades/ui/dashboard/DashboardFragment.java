package com.example.feria_universidades.ui.dashboard;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.feria_universidades.R;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private VideoView conf1,conf2,conf3,conf4,conf5,conf6,conf7,conf8;
    private Button play,play2,play3,play4,play5,play6,play7,play8;
    private Button pause,pause2,pause3,pause4,pause5,pause6,pause7,pause8;
    private Button restart,restart2,restart3,restart4,restart5,restart6,restart7,restart8;


    public View onCreateView(@NonNull final LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_conferencia, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);

        conf1=(VideoView)root.findViewById(R.id.confe1);
        conf2=(VideoView)root.findViewById(R.id.confe2);
        conf3=(VideoView)root.findViewById(R.id.confe3);
        conf4=(VideoView)root.findViewById(R.id.confe4);
        conf5=(VideoView)root.findViewById(R.id.confe5);
        conf6=(VideoView)root.findViewById(R.id.confe6);


        play=(Button) root.findViewById(R.id.play);
        pause=(Button) root.findViewById(R.id.pause);
        restart=(Button) root.findViewById(R.id.restart);

        play2=(Button)  root.findViewById(R.id.play2);
        pause2=(Button)  root.findViewById(R.id.pause2);
        restart2 =(Button)  root.findViewById(R.id.restart2);

        play3=(Button)  root.findViewById(R.id.play3);
        pause3=(Button)  root.findViewById(R.id.pause3);
        restart3 =(Button)  root.findViewById(R.id.restart3);

        play4=(Button)  root.findViewById(R.id.play4);
        pause4=(Button)  root.findViewById(R.id.pause4);
        restart4 =(Button)  root.findViewById(R.id.restart4);

        play5=(Button)  root.findViewById(R.id.play5);
        pause5=(Button)  root.findViewById(R.id.pause5);
        restart5 =(Button)  root.findViewById(R.id.restart5);

        play6=(Button)  root.findViewById(R.id.play6);
        pause6=(Button)  root.findViewById(R.id.pause6);
        restart6 =(Button)  root.findViewById(R.id.restart6);

        ////primer videoview
        conf1.setVideoURI(Uri.parse("https://rentaclassic.000webhostapp.com/Video%20Conferencias%20Uni/UNIVERSIDAD%20MODELO%20CONFERENCIA%20MOTIVACIONAL.mp4"));
        conf1.requestFocus();
        conf1.setKeepScreenOn(true);
        //////

        ////segundo videoview
        conf2.setVideoURI(Uri.parse("https://rentaclassic.000webhostapp.com/Video%20Conferencias%20Uni/Utrivieramaya.mp4"));
        conf2.requestFocus();
        conf2.setKeepScreenOn(true);

        //////

        ////tercer videoview
        conf3.setVideoURI(Uri.parse("https://rentaclassic.000webhostapp.com/Video%20Conferencias%20Uni/Las%20Oportunidades%20De%20Un%20Egresado%20En%20Dise%C3%B1o%20Y%20Mercadotecnia%20De%20La%20Moda%20.mp4"));
        conf3.requestFocus();
        conf3.setKeepScreenOn(true);
        //////

        ////cuarto videoview
        conf4.setVideoURI(Uri.parse("https://rentaclassic.000webhostapp.com/Video%20Conferencias%20Uni/De%20La%20Gr%C3%A1fica%20A%20La%20Multimedia%20%20%20Centro%20De%20Estudios%20Gestalt.mp4"));
        conf4.requestFocus();
        conf4.setKeepScreenOn(true);
        //////

        ////quinto videoview
        conf5.setVideoURI(Uri.parse("https://rentaclassic.000webhostapp.com/Video%20Conferencias%20Uni/Imesad%201.mp4"));
        conf5.requestFocus();
        conf5.setKeepScreenOn(true);
        //////

        ////sexto videoview
        conf6.setVideoURI(Uri.parse("https://rentaclassic.000webhostapp.com/Video%20Conferencias%20Uni/Webinar%20Mercadotecnia.mp4"));
        conf6.requestFocus();
        conf6.setKeepScreenOn(true);
        //////


        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);

                play.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf1.start();
                    }
                });
                pause.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf1.pause();
                    }
                });
                restart.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf1.seekTo(-10000);
                        conf1.pause();
                    }
                });
                /////////
                play2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf2.start();
                    }
                });
                pause2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf2.pause();
                    }
                });
                restart2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf2.seekTo(-10000);
                        conf2.pause();
                    }
                });
                /////////
                play3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf3.start();
                    }
                });
                pause3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf3.pause();
                    }
                });
                restart3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf3.seekTo(-10000);
                        conf3.pause();
                    }
                });
                /////////
                play4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf4.start();
                    }
                });
                pause4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf4.pause();
                    }
                });
                restart4.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf4.seekTo(-10000);
                        conf4.pause();
                    }
                });
                play5.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf5.start();
                    }
                });
                pause5.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf5.pause();
                    }
                });
                restart5.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf5.seekTo(-10000);
                        conf5.pause();
                    }
                });
                play6.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf6.start();
                    }
                });
                pause6.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf6.pause();
                    }
                });
                restart6.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        conf6.seekTo(-10000);
                        conf6.pause();
                    }
                });
            }
        });
        return root;
    }

    }