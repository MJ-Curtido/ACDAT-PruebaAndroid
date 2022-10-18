package com.example.hola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LayoutIntent extends AppCompatActivity implements  View.OnClickListener{
    private static Integer cont = 0;
    Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_intent);
        Button btnContar = findViewById(R.id.btnContar);
        Button btnIntent2 = findViewById(R.id.btnIntent2);
        TextView txtTamanyo = findViewById(R.id.txtTamanyo);
        bundle = getIntent(). getExtras();

        btnContar.setText("Pulsaciones: " + cont);

        txtTamanyo.setText(bundle.getString("tamanyoPizza"));

        btnContar.setOnClickListener(this);
        btnIntent2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnContar) {
            cont++;
            Button btnContar = (Button) view;
            btnContar.setText("Pulsaciones: " + cont);
        }
        else {
            Intent i = new Intent(LayoutIntent.this, Botones.class);
            startActivity(i);
        }
    }
}