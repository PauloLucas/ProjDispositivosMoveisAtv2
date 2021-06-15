package com.example.dispositivosmoveisatv2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dispositivosmoveisatv1.R;

public class Home extends AppCompatActivity {
    EditText nome;
    EditText senha;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        nome = findViewById(R.id.nome);
        senha =  findViewById(R.id.senha);
        login = findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(nome.getText().toString().equals(senha.getText().toString())){
                    Intent acessar = new Intent(Home.this,TelaPrincipal.class);
                    startActivity(acessar);
                }else {
                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(Home.this);
                    builder.setTitle("Erro");
                    builder.setMessage("Senha Incorreta!");
                    builder.setCancelable(true);
                    builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent x = new Intent(Home.this, Home.class);
                            Home.this.startActivity(x);
                        }
                    });
                    AlertDialog alertDialog = builder.create();
                    alertDialog.show();
                }
            }
        });

    }
}