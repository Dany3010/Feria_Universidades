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
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.feria_universidades.ItemList;
import com.example.feria_universidades.R;
import com.example.feria_universidades.RecyclerAdapter;
import com.example.feria_universidades.Uni_detalle;

import java.util.ArrayList;
import java.util.List;

public class UniversidadFragment extends Fragment implements RecyclerAdapter.RecyclerItemClick, SearchView.OnQueryTextListener{

    private RecyclerView rvLista;
    private SearchView svSearch;
    private RecyclerAdapter adapter;
    private List<ItemList> items;
    private UniversidadViewModel universidadViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        universidadViewModel =
                ViewModelProviders.of(this).get(UniversidadViewModel.class);
        View root = inflater.inflate(R.layout.fragment_universidades, container, false);
        final TextView textView = root.findViewById(R.id.text_notifications);
        rvLista = root.findViewById(R.id.rvLista);
        svSearch = root.findViewById(R.id.svSearch);
        initValues();
        initListener();
        return root;
    }

    private void initValues() {
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        rvLista.setLayoutManager(manager);

        items = getItems();
        adapter = new RecyclerAdapter(items, this);
        rvLista.setAdapter(adapter);
    }

    private void initListener() {
        svSearch.setOnQueryTextListener(this);
    }

    private List<ItemList> getItems() {
        List<ItemList> itemLists = new ArrayList<>();
        itemLists.add(new ItemList("itzm chetumal", "uni_itzm", R.drawable.itzm));
        itemLists.add(new ItemList("cudv chetumal", "uni_cudv", R.drawable.cudv_1));
        itemLists.add(new ItemList("unid chetumal", "unid_chetumal", R.drawable.unid_chetumal));
        itemLists.add(new ItemList("modelo chetumal", "modelo_chetumal", R.drawable.uni_modelo_chetumal));
        itemLists.add(new ItemList("politecnica bacalar", "politec_bacalar", R.drawable.uni_poli_bacalar));
        itemLists.add(new ItemList("centro regional de educacion bacalar", "centro_edu_bacalar", R.drawable.centro_regio_edu_bacalar));
        itemLists.add(new ItemList("upp felipe carrillo puerto", "upp", R.drawable.upp));
        itemLists.add(new ItemList("instituto tecnologico superior felipe carrillo puerto", "inst_tec_felipe_c", R.drawable.inst_tec_felipe_c));
        itemLists.add(new ItemList("uimqroo jose maria morelos", "uimqroo", R.drawable.uimqroo));
        itemLists.add(new ItemList("universidad del sur playa del carmen solidaridad", "UniversidadSur_soli", R.drawable.universidadsur_solidaridad));
        itemLists.add(new ItemList("universidad riviera playa del carmen solidaridad", "universidadriviera_soli", R.drawable.universidadriviera_solidaridad));
        itemLists.add(new ItemList("ut riviera maya solidaridad", "ut_rivieramaya_soli", R.drawable.ut_rivieramaya_solidaridad));
        itemLists.add(new ItemList("unid playa del carmen solidaridad", "unid_soli", R.drawable.unid_solidaridad));
        itemLists.add(new ItemList("instituto partenon de cozumel", "inst_partenon_cozumel", R.drawable.inst_partenon_cozumel));
        itemLists.add(new ItemList("universidad politecnica de quintana roo cancun benito juarez", "upqroo_benito_juarez", R.drawable.upqroo_benito_juarez));
        itemLists.add(new ItemList("universidad tecnologica cancun benito juarez", "ut_benito_juarez", R.drawable.ut_benito_juarez));
        itemLists.add(new ItemList("universidad henbord cancun benito juarez", "uni_henbord_benito_juarez", R.drawable.uni_henbord_benito_juarez));
        itemLists.add(new ItemList("universidad azteca cancun benito juarez", "uni_azteca_benito_juarez", R.drawable.uni_azteca_benito_juarez));
        itemLists.add(new ItemList("gestalt cancun benito juarez", "centro_gestalt_benito_juarez", R.drawable.centro_gestalt_benito_juarez));

        return itemLists;
    }
    @Override
    public void itemClick(ItemList item) {
        Intent intent = new Intent(getActivity(), Uni_detalle.class);
        intent.putExtra("uni", item.getDescripcion());
        startActivity(intent);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        adapter.filter(newText);
        return false;
    }
}