package com.bit.models;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Texto {
    private String texto;

    public Texto(String texto) {
        this.texto = texto;
    }

    public boolean toMayusculas() {
        if (this.texto != null && !this.texto.equals("")) {
            this.texto = this.texto.toUpperCase();
            return true;
        } else return false;
    }

    public boolean toMinusculas() {
        if (this.texto != null && !this.texto.equals("")) {
            this.texto = this.texto.toLowerCase();
            return true;
        } else return false;
    }

    public boolean toOracion() {
        if (this.texto != null && !this.texto.equals("")) {
            this.texto.toLowerCase();
            this.texto = _firstToUpper(this.texto);
            return true;
        } else return false;
    }

    private String _firstToUpper(String cadena) {
        if (cadena != null && !cadena.equals("")) return cadena.substring(0, 1).toUpperCase() + cadena.substring(1);
        else return cadena;
    }

    public boolean toPrimerasMayusculas() {
        if (this.texto != null && !this.texto.equals("")) {
            String subStrings[] = this.texto.split(" ");

            for (int i = 0; i < subStrings.length; i++) {
                subStrings[i] = _firstToUpper(subStrings[i]);
            }
            this.texto = String.join(" ", subStrings);
            return true;
        } else return false;

    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return this.texto;
    }
}
