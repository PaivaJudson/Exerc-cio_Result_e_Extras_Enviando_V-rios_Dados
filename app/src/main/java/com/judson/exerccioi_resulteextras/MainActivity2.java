package com.judson.exerccioi_resulteextras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txt_resultado;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt_resultado = findViewById(R.id.txt_resultado);
        intent = getIntent();

        String nome = intent.getExtras().getString("nome");
        String morada = intent.getExtras().getString("morada");
        String telefone = intent.getExtras().getString("telemovel");
        String email = intent.getExtras().getString("email");
        String genero = intent.getExtras().getString("genero");

        if (genero.toLowerCase().equals("masculino") || (genero.toLowerCase().equals("m"))){
            txt_resultado.setText("O "+nome+" mora na "+morada+" tem o telefone "+telefone+" e o email "+email);
        }else if (genero.toLowerCase().equals("Femenino") || (genero.toLowerCase().equals("f"))) {
            txt_resultado.setText("A "+nome+" mora na "+morada+" tem o telefone "+telefone+" e o email "+email);
        }

    }
}