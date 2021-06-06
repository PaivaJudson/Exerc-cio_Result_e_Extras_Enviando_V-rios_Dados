package com.judson.exerccioi_resulteextras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt_nome;
    EditText edt_morada;
    EditText edt_telemovel;
    EditText edt_email;
    EditText edt_genero;
    Button btn_cadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_nome = findViewById(R.id.edt_nome);
        edt_morada = findViewById(R.id.edt_morada);
        edt_telemovel = findViewById(R.id.edt_telemovel);
        edt_email = findViewById(R.id.edt_email);
        edt_genero = findViewById(R.id.edt_genero);


        btn_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("nome",      edt_nome.getText().toString());
                i.putExtra("morada",    edt_morada.getText().toString());
                i.putExtra("telemovel", edt_telemovel.getText().toString());
                i.putExtra("email",     edt_email.getText().toString());
                i.putExtra("genero",    edt_genero.getText().toString());
            }
        });

    }
}