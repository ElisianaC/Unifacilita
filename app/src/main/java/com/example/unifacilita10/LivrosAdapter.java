package com.example.unifacilita10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LivrosAdapter extends RecyclerView.Adapter<LivrosAdapter.LivroViewHolder> {
    private Context context;
    private List<Livro> livrosList;

    public LivrosAdapter(Context context, List<Livro> livrosList) {
        this.context = context;
        this.livrosList = livrosList;
    }

    @NonNull
    @Override
    public LivroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflando o layout do item da lista (cada livro)
        View view = LayoutInflater.from(context).inflate(R.layout.item_biblioteca, parent, false);
        return new LivroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LivroViewHolder holder, int position) {
        // Configurando os dados no ViewHolder
        Livro livro = livrosList.get(position);
        holder.titulo.setText(livro.getTitulo());
        holder.autor.setText(livro.getAutor());
        holder.acao.setText(livro.getAcao());
    }

    @Override
    public int getItemCount() {
        return livrosList.size();
    }

    // ViewHolder que representa cada item da lista
    public static class LivroViewHolder extends RecyclerView.ViewHolder {
        TextView titulo;
        TextView autor;
        TextView acao;

        public LivroViewHolder(View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.txtTitulo);
            autor = itemView.findViewById(R.id.txtAutor);
            acao = itemView.findViewById(R.id.txtAcao);
        }
    }
}
