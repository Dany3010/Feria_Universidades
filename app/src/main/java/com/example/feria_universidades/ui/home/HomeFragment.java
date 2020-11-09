package com.example.feria_universidades.ui.home;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.feria_universidades.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private VideoView videoView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        videoView=(VideoView)root.findViewById(R.id.video);
        videoView.setVideoURI(Uri.parse("https://rentaclassic.000webhostapp.com/videos/secretaria.mp4"));


        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);

                MediaController mediaController = new MediaController(getActivity());
                videoView.setMediaController(mediaController);
                videoView.requestFocus();
                videoView.start();
            }
        });
        return root;
    }
}