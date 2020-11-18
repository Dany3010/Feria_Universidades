package com.example.feria_universidades.ui.profile;

import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.feria_universidades.Feria_universitaria;
import com.example.feria_universidades.PresentacionActivity;
import com.example.feria_universidades.R;




public class profile extends Fragment {
Button btnCerrar;

    private ProfileViewModel mViewModel;

    public static profile newInstance() {
        return new profile();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        View root = inflater.inflate(R.layout.profile_fragment, container, false);
btnCerrar=root.findViewById(R.id.button);
btnCerrar.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        SharedPreferences preferences = getActivity().getSharedPreferences("preferenciasLogin", Context.MODE_PRIVATE);
        preferences.edit().clear().commit();
        Intent intent =new Intent(getActivity().getApplicationContext(), PresentacionActivity.class);
        startActivity(intent);
       getActivity().finish();
    }
});


        return root;
    }





    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(ProfileViewModel.class);

    }



}