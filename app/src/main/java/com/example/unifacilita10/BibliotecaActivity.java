package com.example.unifacilita10;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class BibliotecaActivity extends AppCompatActivity {

    private EditText editTextPesquisar;
    private Button btnBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biblioteca);

        // Inicializando os componentes
        editTextPesquisar = findViewById(R.id.editTextPesquisar);
        btnBuscar = findViewById(R.id.btnBuscar);

        // Definindo a ação do botão "Buscar"
        btnBuscar.setOnClickListener(v -> {
            // Aqui você pode adicionar a lógica para realizar a busca
            String pesquisa = editTextPesquisar.getText().toString();
            // Implemente a lógica de pesquisa com base no texto digitado
        });
    }
}


