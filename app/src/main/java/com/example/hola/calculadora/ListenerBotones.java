package com.example.hola.calculadora;

import android.view.View;

import com.example.hola.Calculadora;

public abstract class ListenerBotones implements View.OnClickListener {
    Calculadora calc;

    public ListenerBotones(Calculadora calc) {
        this.calc = calc;
    }
}