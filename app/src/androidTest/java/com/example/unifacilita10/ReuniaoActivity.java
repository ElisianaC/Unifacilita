package com.example.unifacilita10;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ReuniaoActivity extends AppCompatActivity {

    private EditText editData, editHorario;
    private RadioGroup radioTipo;
    private RadioButton radioPresencial, radioOnline;
    private Button btnAgendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reuniao);

        // Ligando os elementos da tela
        editData = findViewById(R.id.editData);
        editHorario = findViewById(R.id.editHorario);
        radioTipo = findViewById(R.id.radioTipo);
        radioPresencial = findViewById(R.id.radioPresencial);
        radioOnline = findViewById(R.id.radioOnline);
        btnAgendar = findViewById(R.id.btnAgendar);

        btnAgendar.setOnClickListener(v -> {
            String data = editData.getText().toString();
            String horario = editHorario.getText().toString();
            String tipo = radioPresencial.isChecked() ? "Presencial" : radioOnline.isChecked() ? "Online" : "";

            if (data.isEmpty() || horario.isEmpty() || tipo.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
            } else {
                String mensagem = "Reunião agendada:\n" +
                        tipo + " em " + data + " às " + horario;
                Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show();
            }
        });
    }
}
{
}
