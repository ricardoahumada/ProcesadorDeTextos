package com.banana.servicios;

import com.banana.models.Texto;
import com.banana.persistence.TextosEnMemoria;

public class GestorTextos {

    private static TextosEnMemoria almacenDeTextos = new TextosEnMemoria();

    public static TextosEnMemoria getAlmacenDeTextos() {
        return almacenDeTextos;
    }

    //Mayusculas
    public static void pasarAMayusculasElemento(int idx) {
        Texto unTexto = almacenDeTextos.get(idx);
        if (unTexto != null) {
            unTexto.toMayusculas();
        }
    }

    public static void pasarAMayusculasSubconjunto(int idx1, int idx2) {
        for (int i = idx1; i <= idx2; i++) {
            pasarAMayusculasElemento(i);
        }
    }

    public static void pasarAMayusculasTodos() {
        int size = almacenDeTextos.getSize();
        for (int i = 0; i <= size; i++) {
            pasarAMayusculasElemento(i);
        }
    }

    //TODO Minusculas

    //TODO Oracion

    //TODO Primera a mayuscula
    public static void pasarPrimeraMayusculasElemento(int idx) {
        Texto unTexto = almacenDeTextos.get(idx);
        if (unTexto != null) {
            unTexto.toPrimerasMayusculas();
        }
    }

    public static void pasarPrimeraMayusculasTodos() {
        int size = almacenDeTextos.getSize();
        for (int i = 0; i <= size; i++) {
            pasarPrimeraMayusculasElemento(i);
        }
    }
}
