package com.example.unifacilita10;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FaleConoscoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faleconosco);

        LinearLayout opcaoWhatsApp = findViewById(R.id.opcaoWhatsApp);
        LinearLayout opcaoTelefone = findViewById(R.id.opcaoTelefone);
        LinearLayout opcaoMensagem = findViewById(R.id.opcaoMensagem);

        opcaoWhatsApp.setOnClickListener(v ->
                Toast.makeText(this, "Abrir chat no WhatsApp", Toast.LENGTH_SHORT).show());

        opcaoTelefone.setOnClickListener(v ->
                Toast.makeText(this, "Entre em contato pelo fone 0800 603 0603", Toast.LENGTH_SHORT).show());

        opcaoMensagem.setOnClickListener(v -> {
            Intent intent = new Intent(FaleConoscoActivity.this, MensagemActivity.class);
            startActivity(intent);
        });
    }
}


