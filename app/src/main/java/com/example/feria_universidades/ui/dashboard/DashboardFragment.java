package com.example.feria_universidades.ui.dashboard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.MediaController;
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
private WebView webView;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        webView=(WebView)root.findViewById(R.id.webview);

        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
                webView.setWebViewClient(new WebViewClient() { public boolean shouldOverrideUrlLoading(WebView view, String url) {
                   if (url.startsWith("vnd.youtube:")) {
                        int n = url.indexOf("?"); if (n > 0) {
                            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(String.format("https://www.youtube.com/watch?v=q8zuQ295U5s",
                                    url.substring("vnd.youtube:".length(),n)))));
                        } return (true);
                    } return (false);
                } });


            }
        });
        return root;
    }

    }