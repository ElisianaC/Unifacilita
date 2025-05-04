package com.example.unifacilita10;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LivrosAdapter adapter;
    private List<Livro> livrosList;  // Lista de livros (modelo de dados)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biblioteca);

        // Inicializando RecyclerView
        recyclerView = findViewById(R.id.recyclerViewLivros);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Inicializando a lista de livros
        livrosList = new ArrayList<>();
        livrosList.add(new Livro("José Dornelas", "Empreendedorismo", "Retirar"));
        livrosList.add(new Livro("Jerônimo Mendes", "Empreendedorismo 360°", "Retirar"));
        livrosList.add(new Livro("Tarcísio Teixeira", "Startups e Inovação", "Retirar"));

        // Criando o adaptador
        adapter = new LivrosAdapter(this, livrosList);
        recyclerView.setAdapter(adapter);
    }
}
