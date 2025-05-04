package com.example.unifacilita10;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FaculdadesActivity extends AppCompatActivity {

    private FaculdadesAdapter adapter;
    private List<String[]> listaFaculdades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_faculdades);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.faculdades), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText campoBusca = findViewById(R.id.input_pesquisar);
        RecyclerView recyclerView = findViewById(R.id.recyclerview_faculdades);

        listaFaculdades = new ArrayList<>();
        listaFaculdades.add(new String[]{"Universidade de Caxias do Sul - UCS", "R. Francisco Getúlio Vargas, 1130\nPetrópolis, Caxias do Sul\n(54) 3218-2100"});
        listaFaculdades.add(new String[]{"UniFtec Centro Universitário", "R. Gustavo Ramos Sehbe, 107\nCinquentenário, Caxias do Sul\n0800 603 0603"});
        listaFaculdades.add(new String[]{"Centro Universitário da Serra Gaúcha - FSG", "R. Os Dezoito do Forte, 2366\nSão Pelegrino, Caxias do Sul\n0800 721 5844"});
        listaFaculdades.add(new String[]{"Hamburgueria Jaime Rocha", "R. Marquês do Herval, 983\nCentro, Caxias do Sul\n(54) 3027-7760"});

        adapter = new FaculdadesAdapter(listaFaculdades, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        campoBusca.addTextChangedListener(new TextWatcher() {
            @Override
            public void afterTextChanged(Editable s) {
                filtrar(s.toString());
            }

            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override public void onTextChanged(CharSequence s, int start, int before, int count) {}
        });
    }

    private void filtrar(String texto) {
        List<String[]> filtrada = new ArrayList<>();
        for (String[] item : listaFaculdades) {
            if (item[0].toLowerCase().contains(texto.toLowerCase()) ||
                    item[1].toLowerCase().contains(texto.toLowerCase())) {
                filtrada.add(item);
            }
        }
        adapter.atualizarLista(filtrada);
    }
}