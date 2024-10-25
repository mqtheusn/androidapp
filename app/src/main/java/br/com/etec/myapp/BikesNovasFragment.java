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
        lstmodelos.add(new Bikenova("bike1", R.drawable.model));
        lstmodelos.add(new Bikenova("bike2", R.drawable.bikee));
        lstmodelos.add(new Bikenova("bike3", R.drawable.bikeee));
        lstmodelos.add(new Bikenova("bike4", R.drawable.bikeeee));
        lstmodelos.add(new Bikenova("bike5", R.drawable.bikeeeee));
        lstmodelos.add(new Bikenova("bike6", R.drawable.bikeeeeee));
        lstmodelos.add(new Bikenova("bike7", R.drawable.bikeeeeeee));
        lstmodelos.add(new Bikenova("bike8", R.drawable.bikeeeeeeee));
        lstmodelos.add(new Bikenova("bike9", R.drawable.bikeeeeeeeee));
        lstmodelos.add(new Bikenova("bike10", R.drawable.bikeeeeeeeeee));

        RecyclerAdapterBikeNova adapterBikeNova = new RecyclerAdapterBikeNova(getContext(), lstmodelos);

        idmodelos.setLayoutManager(new GridLayoutManager(getContext(), 2));
        idmodelos.setAdapter(adapterBikeNova);
        return view;
    }
}