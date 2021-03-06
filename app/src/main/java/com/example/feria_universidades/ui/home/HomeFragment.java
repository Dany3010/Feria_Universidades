package com.example.feria_universidades.ui.home;

import android.content.Intent;
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

import com.example.feria_universidades.MainActivity2;
import com.example.feria_universidades.R;


public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private VideoView videoView;
    private TextView inicio;
    private Button testvoc,play,pause,restart;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
          inicio=(TextView)root.findViewById(R.id.parrafo1);
        testvoc=(Button)root.findViewById(R.id.test);

        play=(Button) root.findViewById(R.id.playh);
        pause=(Button) root.findViewById(R.id.pauseh);
        restart=(Button) root.findViewById(R.id.restarth);

        videoView=(VideoView)root.findViewById(R.id.video);
        String videoPath = "https://mirutamx.000webhostapp.com/videos/secretaria.mp4";
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);



        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
                String p1="La Feria Virtual Universitaria es un evento estatal que reúne a " +
                        "todos los Programas Educativos de nivel superior, en un esfuerzo por acercar la " +
                        "Oferta Educativa a todos los jóvenes que quieren continuar su formación cursando una " +
                        "carrera universitaria.";
                inicio.setText(p1);




                testvoc.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent Bmeters = new Intent( getActivity() ,MainActivity2.class);
                        startActivity(Bmeters);
                    }
                });

                play.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        videoView.start();
                    }
                });
                pause.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        videoView.pause();
                    }
                });
                restart.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        videoView.seekTo(-10000);
                        videoView.pause();
                    }
                });

            }
        });
        return root;
    }
}
