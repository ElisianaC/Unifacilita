package com.example.unifacilita10;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HomeActivity extends AppCompatActivity {

    private RecyclerView recyclerOpcoes;

    // as listas nomes, ícones e activities precisam ter o mesmo tamanho e ordem
    private String[] nomes = {
            "Estacionamento", "Biblioteca", "Impressão",
            "Reunião", "Dúvidas", "Financeiro",
            "Pedidos", "Fale Conosco", "Notas"
    };

    private int[] icones = {
            R.drawable.ic_estacionamento, R.drawable.ic_biblioteca, R.drawable.ic_impressao,
            R.drawable.ic_reuniao, R.drawable.ic_duvidas, R.drawable.ic_financeiro,
            R.drawable.ic_pedidos, R.drawable.ic_faleconosco, R.drawable.ic_notas
    };

    private Class<?>[] activities = {   //trocar o nome das activities de cada módulo. Aqui todas as opções do menu estão na FaleConoscoActivity. Precisa sequir a mesma ordem da lista "nomes" acima
            FaleConoscoActivity.class, BibliotecaActivity.class, FaleConoscoActivity.class,
            ReuniaoActivity.class, FaleConoscoActivity.class, FaleConoscoActivity.class,
            FaleConoscoActivity.class, FaleConoscoActivity.class, FaleConoscoActivity.class
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        recyclerOpcoes = findViewById(R.id.recyclerOpcoes);
        recyclerOpcoes.setLayoutManager(new GridLayoutManager(this, 3));

        HomeAdapter adapter = new HomeAdapter(this, nomes, icones, activities);
        recyclerOpcoes.setAdapter(adapter);
    }
}