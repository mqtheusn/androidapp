package br.com.etec.myapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class BikesNovasFragment extends Fragment {

    private List<Bikenova> lstmodelos;
    RecyclerView idmodelos;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragmen1

        View view = inflater.inflate(R.layout.fragment_modelos, container, false);


        idmodelos = view.findViewById(R.id.idmenumodelos);

        // carregando os objetos na lista
        lstmodelos = new ArrayList<>();
        lstmodelos.add(new Bikenova("m1", R.drawable.modelum));
        lstmodelos.add(new Bikenova("m2", R.drawable.modeldois));
        lstmodelos.add(new Bikenova("m3", R.drawable.modeltres));
        lstmodelos.add(new Bikenova("m4", R.drawable.modelquatro));
        lstmodelos.add(new Bikenova("m5", R.drawable.modelcinco));
        lstmodelos.add(new Bikenova("m6", R.drawable.modelseis));
        lstmodelos.add(new Bikenova("m7", R.drawable.modelsete));
        lstmodelos.add(new Bikenova("m8", R.drawable.modeloito));
        lstmodelos.add(new Bikenova("m9", R.drawable.modelnove));
        lstmodelos.add(new Bikenova("m10", R.drawable.modeldez));
        lstmodelos.add(new Bikenova("m11", R.drawable.modelonze));
        lstmodelos.add(new Bikenova("m12", R.drawable.modeldouze));
        lstmodelos.add(new Bikenova("m13", R.drawable.modeltreze));
        lstmodelos.add(new Bikenova("m14", R.drawable.modelquartoze));
        lstmodelos.add(new Bikenova("m15", R.drawable.modelquinze));
        lstmodelos.add(new Bikenova("m16", R.drawable.modeldezesseis));
        lstmodelos.add(new Bikenova("m17", R.drawable.modeldezete));
        lstmodelos.add(new Bikenova("m18", R.drawable.modeldezoite));
        lstmodelos.add(new Bikenova("m19", R.drawable.modeldezenove));
        lstmodelos.add(new Bikenova("m20", R.drawable.modelvinte));

        RecyclerAdapterBikeNova adapterBikeNova = new RecyclerAdapterBikeNova(getContext(), lstmodelos);

        idmodelos.setLayoutManager(new GridLayoutManager(getContext(), 2));
        idmodelos.setAdapter(adapterBikeNova);
        return view;
    }
}