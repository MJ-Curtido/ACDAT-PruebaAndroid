package com.example.hola.manejadorEventos;

import android.view.View;
import android.widget.Button;

import com.example.hola.Calculadora;
import com.example.hola.R;

public class ListenerBotones implements View.OnClickListener {
    Calculadora calc;

    public ListenerBotones(Calculadora calc) {
        this.calc = calc;
        Button btnSumar = calc.findViewById(R.id.btnSumar);
        Button btnRestar = calc.findViewById(R.id.btnRestar);
        btnSumar.setOnClickListener(this);
        btnRestar.setOnClickListener(this);
    }

    public void onClick(View view) {
        if (view.getId() == R.id.btnSumar) {
            calc.hacerSuma();
        }
        else {
            calc.hacerResta();
        }
    }
}