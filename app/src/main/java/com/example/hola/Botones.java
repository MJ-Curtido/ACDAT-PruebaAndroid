package com.example.hola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Botones extends AppCompatActivity implements  View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSaludar2 = findViewById(R.id.btnSaludar2);
        Button btnIntent = findViewById(R.id.btnIntent);

        btnIntent.setOnClickListener(this);
        btnSaludar2.setOnClickListener(this);

        Log.i("info", "funciona");

        /*
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        TextView texto = new TextView(this);
        texto.setText("Hello, Android");
        setContentView(texto);
        */
    }

    @Override
    public void onClick(View view) {
        TextView txtSaludo = findViewById(R.id.txtSaludo);

        if (view.getId() == R.id.btnSaludar) {
            txtSaludo.setText("wenos dia");
        }
        else if (view.getId() == R.id.btnSaludar2) {
            txtSaludo.setText("wenas tarde");
        }
        else {
            Intent i = new Intent(Botones.this, LayoutIntent.class);

            String tamanyo = "Vaya paho pizza mpare";
            i.putExtra("tamanyoPizza", tamanyo);

            startActivity(i);
        }
    }
}