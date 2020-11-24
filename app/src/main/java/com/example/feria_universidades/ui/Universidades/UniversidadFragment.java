package com.example.feria_universidades.ui.Universidades;

import android.content.Intent;
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
import com.example.feria_universidades.Uni_detalle;

public class UniversidadFragment extends Fragment {
    /////OTHON P. BLANCO////////
Button itzm,cudv,unid_chetumal,uni_modelo_chetumal;

    /////BACALAR////////
Button uni_poli_bacalar,centro_regio_edu_bacalar;

    /////FELIPE CARRILLO PUERTO////////
    Button upp,inst_tec_felipe_c;

    /////JOSE MARIA MORELOS///////
Button uimqroo;

    /////SOLIDARIDAD///////
    Button UniversidadSur_soli,universidadriviera_soli,ut_rivieramaya_soli,unid_soli;

    /////COZUMEL///////
    Button inst_partenon_cozumel,buscardor;

    /////BENITO JUÁREZ///////
    Button upqroo_benito_juarez,ut_benito_juarez,uni_henbord_benito_juarez,uni_azteca_benito_juarez,centro_gestalt_benito_juarez;

    private UniversidadViewModel universidadViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        universidadViewModel =
                ViewModelProviders.of(this).get(UniversidadViewModel.class);
        View root = inflater.inflate(R.layout.fragment_universidades, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);

        /////OTHON P. BLANCO////////
        itzm =(Button)root.findViewById(R.id.itzm);
        cudv =(Button)root.findViewById(R.id.cudv);
        unid_chetumal =(Button)root.findViewById(R.id.unid_chetumal);
        uni_modelo_chetumal =(Button)root.findViewById(R.id.uni_modelo_chetumal);


        /////BACALAR////////
        uni_poli_bacalar =(Button)root.findViewById(R.id.uni_poli_bacalar);
        centro_regio_edu_bacalar =(Button)root.findViewById(R.id.centro_regio_edu_bacalar);

        /////FELIPE CARRILLO PUERTO////////
        upp =(Button)root.findViewById(R.id.upp);
        inst_tec_felipe_c =(Button)root.findViewById(R.id.inst_tec_felipe_c);

        /////JOSE MARIA MORELOS///////
        uimqroo =(Button)root.findViewById(R.id.uimqroo);

        /////SOLIDARIDAD///////
        UniversidadSur_soli =(Button)root.findViewById(R.id.UniversidadSur_soli);
        universidadriviera_soli =(Button)root.findViewById(R.id.universidadriviera_soli);
        ut_rivieramaya_soli =(Button)root.findViewById(R.id.ut_rivieramaya_soli);
        unid_soli =(Button)root.findViewById(R.id.unid_soli);


        /////COZUMEL///////
        inst_partenon_cozumel =(Button)root.findViewById(R.id.inst_partenon_cozumel);

        /////BENITO JUÁREZ///////
        upqroo_benito_juarez =(Button)root.findViewById(R.id.upqroo_benito_juarez);
        ut_benito_juarez =(Button)root.findViewById(R.id.ut_benito_juarez);
        uni_henbord_benito_juarez =(Button)root.findViewById(R.id.uni_henbord_benito_juarez);
        uni_azteca_benito_juarez =(Button)root.findViewById(R.id.uni_azteca_benito_juarez);
        centro_gestalt_benito_juarez =(Button)root.findViewById(R.id.centro_gestalt_benito_juarez);




        universidadViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);


                /////OTHON P. BLANCO////////
                itzm.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","uni_itzm");
                        startActivity(univerisdad);
                    }
                });

                cudv.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","uni_cudv");
                        startActivity(univerisdad);
                    }
                });

                unid_chetumal.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","unid_chetumal");
                        startActivity(univerisdad);
                    }
                });

                uni_modelo_chetumal.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","modelo_chetumal");
                        startActivity(univerisdad);
                    }
                });



                ///////BACALAR/////////
                uni_poli_bacalar.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","politec_bacalar");
                        startActivity(univerisdad);
                    }
                });
                centro_regio_edu_bacalar.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","centro_edu_bacalar");
                        startActivity(univerisdad);
                    }
                });
                /////FELIPE CARRILLO PUERTO////////
                upp.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","upp");
                        startActivity(univerisdad);
                    }
                });
                inst_tec_felipe_c.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","inst_tec_felipe_c");
                        startActivity(univerisdad);
                    }
                });
                /////JOSE MARIA MORELOS///////
                uimqroo.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","uimqroo");
                        startActivity(univerisdad);
                    }
                });

                /////SOLIDARIDAD///////
                UniversidadSur_soli.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","UniversidadSur_soli");
                        startActivity(univerisdad);
                    }
                });
                universidadriviera_soli.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","universidadriviera_soli");
                        startActivity(univerisdad);
                    }
                });
                ut_rivieramaya_soli.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","ut_rivieramaya_soli");
                        startActivity(univerisdad);
                    }
                });
                unid_soli.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","unid_soli");
                        startActivity(univerisdad);
                    }
                });

                /////COZUMEL///////
                inst_partenon_cozumel.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","inst_partenon_cozumel");
                        startActivity(univerisdad);
                    }
                });

                /////BENITO JUÁREZ///////
                upqroo_benito_juarez.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","upqroo_benito_juarez");
                        startActivity(univerisdad);
                    }
                });
                ut_benito_juarez.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","ut_benito_juarez");
                        startActivity(univerisdad);
                    }
                });
                uni_henbord_benito_juarez.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","uni_henbord_benito_juarez");
                        startActivity(univerisdad);
                    }
                });
                uni_azteca_benito_juarez.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","uni_azteca_benito_juarez");
                        startActivity(univerisdad);
                    }
                });

                centro_gestalt_benito_juarez.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        // Do something in response to button click
                        Intent univerisdad = new Intent( getActivity() , Uni_detalle.class);
                        univerisdad.putExtra("uni","centro_gestalt_benito_juarez");
                        startActivity(univerisdad);
                    }
                });

            }
        });
        return root;
    }
}