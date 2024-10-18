package br.com.etec.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.widget.TextViewOnReceiveContentListener;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerAdapterBikeNova extends RecyclerView.Adapter<RecyclerAdapterBikeNova.ViewHolder> {

    //criando variaveis globais para a lista e o contexto
    private Context context;
    private List<Bikenova> lstBikenova;

    //criando construtor
    public RecyclerAdapterBikeNova(Context context, List<Bikenova> lstBikenova) {
        this.context = context;
        this.lstBikenova = lstBikenova;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_bikes_novas,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.idModeloTituloBikeNova.setText(lstBikenova.get(position).getTitulo());
    holder.idModeloImagemBikeNova.setImageResource(lstBikenova.get(position).getImagem());

    }

    @Override
    public int getItemCount() {
        return lstBikenova.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //Criando variável que irá representar o xml no java
        CardView idModeloBikeNova;
        ImageView idModeloImagemBikeNova;
        TextView idModeloTituloBikeNova;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //Apresentando o java para o xml do modelo
            idModeloBikeNova = itemView.findViewById(R.id.idModeloBikeNova);
            idModeloImagemBikeNova = itemView.findViewById(R.id.idModeloImagemBikeNova);
            idModeloTituloBikeNova = itemView.findViewById(R.id.idModeloTituloBikeNova);

        }
    }

}
