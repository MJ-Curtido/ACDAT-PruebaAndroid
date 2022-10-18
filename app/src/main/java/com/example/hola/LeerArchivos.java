package com.example.hola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LeerArchivos extends AppCompatActivity implements View.OnClickListener {
    SharedPreferences preferencias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leer_archivos);

        Button btnEnviar = findViewById(R.id.btnEnviar);

        btnEnviar.setOnClickListener(this);

        preferencias = getSharedPreferences ("archivo", Context.MODE_PRIVATE);
    }

    @Override
    public void onClick(View view) {
        EditText cajaTamanyo = findViewById(R.id.cajaTamanyo);

        SharedPreferences.Editor editor=preferencias.edit();

        editor.putString("archivo", cajaTamanyo.getText().toString());

        editor.commit();
    }
}