package com.example.feria_universidades.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.feria_universidades.R;

public class NotificationsFragment extends Fragment {
    /////OTHON P. BLANCO////////
Button itzm,cudv,unid_chetumal,uni_modelo_chetumal,uni_wozniak,uqroo_chetumal,ut_chetumal;

    /////BACALAR////////
Button uni_poli_bacalar,centro_regio_edu_bacalar;

    /////FELIPE CARRILLO PUERTO////////
    Button upp,inst_tec_felipe_c;

    /////JOSE MARIA MORELOS///////
Button uimqroo;

    /////SOLIDARIDAD///////
    Button UniversidadSur_soli,universidadriviera_soli,ut_rivieramaya_soli,unid_soli,esc_enfermeria_soli;

    /////COZUMEL///////
    Button inst_partenon_cozumel;

    /////BENITO JUÁREZ///////
    Button upqroo_benito_juarez,ut_benito_juarez,uni_henbord_benito_juarez,uni_azteca_benito_juarez,centro_gestalt_benito_juarez;
    Button la_salle_benito_juarez,inst_humanista_gestalt_benito_juarez,unisur_benito_juarez,instituto_sup_leyes_benito_juarez;

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
                /////OTHON P. BLANCO////////
                ///////BACALAR/////////
                /////FELIPE CARRILLO PUERTO////////
                /////JOSE MARIA MORELOS///////
                /////SOLIDARIDAD///////
                /////COZUMEL///////
                /////BENITO JUÁREZ///////
            }
        });
        return root;
    }
}