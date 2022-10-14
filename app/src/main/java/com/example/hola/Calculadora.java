package com.example.hola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hola.calculadora.ListenerBotones;

public class Calculadora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        new ListenerBotones(this);
    }

    public void hacerSuma() {
        EditText txtNum1 = findViewById(R.id.txtNum1);
        EditText txtNum2 = findViewById(R.id.txtNum2);
        TextView txtSolucion = findViewById(R.id.txtSolucion);

        if (!txtNum1.getText().toString().equals("") && !txtNum2.getText().toString().equals("")) {
            txtSolucion.setText("Resultado: " + (Double.parseDouble(txtNum1.getText().toString()) + Double.parseDouble(txtNum2.getText().toString())));
        }
        else {
            txtSolucion.setText("Hay algún campo sin completar");
        }
    }

    public void hacerResta() {
        EditText txtNum1 = findViewById(R.id.txtNum1);
        EditText txtNum2 = findViewById(R.id.txtNum2);
        TextView txtSolucion = findViewById(R.id.txtSolucion);

        if (!txtNum1.getText().toString().equals("") && !txtNum2.getText().toString().equals("")) {
            txtSolucion.setText("Resultado: " + (Double.parseDouble(txtNum1.getText().toString()) - Double.parseDouble(txtNum2.getText().toString())));
        }
        else {
            txtSolucion.setText("Hay algún campo sin completar");
        }
    }
}