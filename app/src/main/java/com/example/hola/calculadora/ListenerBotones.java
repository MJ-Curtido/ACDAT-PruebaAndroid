package com.example.hola.calculadora;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hola.Calculadora;
import com.example.hola.R;

public abstract class ListenerBotones implements View.OnClickListener {
    Calculadora calc;

    public ListenerBotones(Calculadora calc) {
        this.calc = calc;
        Button btnSumar = calc.findViewById(R.id.btnSumar);
        Button btnRestar = calc.findViewById(R.id.btnRestar);
        btnSumar.setOnClickListener(this);
        btnRestar.setOnClickListener(this);
    }

    public void onClick(View view) {
        EditText txtNum1 = calc.findViewById(R.id.txtNum1);
        EditText txtNum2 = calc.findViewById(R.id.txtNum2);

        TextView txtSolucion = calc.findViewById(R.id.txtSolucion);
        if (!txtNum1.getText().toString().equals("") && !txtNum2.getText().toString().equals("")) {
            if (view.getId() == R.id.btnSumar) {
                txtSolucion.setText("Resultado: " + (Double.parseDouble(txtNum1.getText().toString()) + Double.parseDouble(txtNum2.getText().toString())));
            }
            else {
                txtSolucion.setText("Resultado: " + (Double.parseDouble(txtNum1.getText().toString()) - Double.parseDouble(txtNum2.getText().toString())));
            }
        }
        else {
            txtSolucion.setText("Hay algún campo sin completar");
        }
    }
}