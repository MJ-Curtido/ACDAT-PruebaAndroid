package com.example.hola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Botones extends AppCompatActivity implements  View.OnClickListener{
    private static Integer cont = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnSaludar2 = findViewById(R.id.btnSaludar2);
        Button btnSaludar = findViewById(R.id.btnSaludar);
        Button btnContar = findViewById(R.id.btnContar);

        btnSaludar2.setOnClickListener(this);
        btnContar.setOnClickListener(this);

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

        if (view.getId() == R.id.btnSaludar){
            txtSaludo.setText("wenos dia");
        }
        else if (view.getId() == R.id.btnSaludar2){
            txtSaludo.setText("wenas tarde");
        }
        else {
            cont++;
            Button btnContar = (Button) view;
            btnContar.setText("Pulsaciones: " + cont);
        }
    }
}