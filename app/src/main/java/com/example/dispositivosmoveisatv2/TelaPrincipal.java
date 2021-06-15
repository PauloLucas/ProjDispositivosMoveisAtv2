package com.example.dispositivosmoveisatv2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dispositivosmoveisatv1.R;

public class TelaPrincipal extends AppCompatActivity {
    Button servicos;
    Button valores;
    Button promocoes;
    Button lojas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);
        servicos = findViewById(R.id.promocoes);
        valores = findViewById(R.id.valores);
        promocoes = findViewById(R.id.servicos);
        lojas = findViewById(R.id.lojas);

        servicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaPrincipal.this, TiposServicos.class);
                startActivity(i);
            }
        });
        valores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaPrincipal.this, TiposValores.class);
                startActivity(i);
            }
        });
        promocoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaPrincipal.this, TiposPromocoes.class);
                startActivity(i);
            }
        });
        lojas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(TelaPrincipal.this, TiposLojas.class);
                startActivity(i);
            }
        });
    }
}