package com.example.unifacilita10;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FaculdadesAdapter extends RecyclerView.Adapter<FaculdadesAdapter.FaculdadeViewHolder> {

    private List<String[]> lista;
    private Context context;

    public FaculdadesAdapter(List<String[]> lista, Context context) {
        this.lista = lista;
        this.context = context;
    }

    public static class FaculdadeViewHolder extends RecyclerView.ViewHolder {
        public TextView nome;
        public TextView endereco;

        public FaculdadeViewHolder(View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.textViewNome);
            endereco = itemView.findViewById(R.id.textViewEndereco);
        }
    }

    @Override
    public FaculdadeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_faculdade, parent, false);
        return new FaculdadeViewHolder(v);
    }

    @Override
    public void onBindViewHolder(FaculdadeViewHolder holder, int position) {
        String[] item = lista.get(position);
        holder.nome.setText(item[0]);
        holder.endereco.setText(item[1]);

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, LoginFaculdadesActivity.class);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return lista.size();
    }

    public void atualizarLista(List<String[]> novaLista) {
        this.lista = novaLista;
        notifyDataSetChanged();
    }
}