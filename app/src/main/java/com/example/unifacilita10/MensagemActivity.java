package com.example.unifacilita10;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MensagemActivity extends AppCompatActivity {

    private EditText editMensagem;
    private TextView txtContador;
    private Button btnContinuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mensagem);

        editMensagem = findViewById(R.id.editMensagem);
        txtContador = findViewById(R.id.txtContador);
        btnContinuar = findViewById(R.id.btnContinuar);

        // Atualiza contador de caracteres
        editMensagem.addTextChangedListener(new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override public void onTextChanged(CharSequence s, int start, int before, int count) {
                txtContador.setText(s.length() + " / 360");
            }
            @Override public void afterTextChanged(Editable s) {}
        });

        // Ação do botão
        btnContinuar.setOnClickListener(v -> {
            String mensagem = editMensagem.getText().toString().trim();
            if (mensagem.isEmpty()) {
                Toast.makeText(this, "Por favor, escreva sua mensagem.", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Mensagem enviada com sucesso!", Toast.LENGTH_SHORT).show();
                finish(); // volta para a tela anterior
            }
        });
    }
}

