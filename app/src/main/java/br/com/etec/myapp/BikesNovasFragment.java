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

    private List<Bikenova> lstBikenova;
    RecyclerView idRecBikesNovas;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragmen1

        View view = inflater.inflate(R.layout.fragment_bikes_novas, container, false);


        idRecBikesNovas = view.findViewById(R.id.idRecBikesNovas);

        // carregando os objetos na lista
        lstBikenova = new ArrayList<>();
        lstBikenova.add(new Bikenova("bike1", R.drawable.bikea));
        lstBikenova.add(new Bikenova("bike2", R.drawable.bikee));
        lstBikenova.add(new Bikenova("bike3", R.drawable.bikeee));
        lstBikenova.add(new Bikenova("bike4", R.drawable.bikeeee));
        lstBikenova.add(new Bikenova("bike5", R.drawable.bikeeeee));
        lstBikenova.add(new Bikenova("bike6", R.drawable.bikeeeeee));
        lstBikenova.add(new Bikenova("bike7", R.drawable.bikeeeeeee));
        lstBikenova.add(new Bikenova("bike8", R.drawable.bikeeeeeeee));
        lstBikenova.add(new Bikenova("bike9", R.drawable.bikeeeeeeeee));
        lstBikenova.add(new Bikenova("bike10", R.drawable.bikeeeeeeeeee));

        RecyclerAdapterBikeNova adapterBikeNova = new RecyclerAdapterBikeNova(getContext(), lstBikenova);

        idRecBikesNovas.setLayoutManager(new GridLayoutManager(getContext(), 2));
        idRecBikesNovas.setAdapter(adapterBikeNova);
        return view;
    }
}