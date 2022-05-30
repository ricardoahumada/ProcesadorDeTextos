package com.bit.servicios;

import com.bit.models.Texto;
import com.bit.persistence.TextosEnMemoria;

public class GestorTextos {

    private static TextosEnMemoria textos = new TextosEnMemoria();

    public static TextosEnMemoria getTextos() {
        return textos;
    }

    //Mayusculas
    public static void pasarAMayusculasElemento(int idx) {
        Texto unTexto = textos.get(idx);
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
        int size = textos.getSize();
        for (int i = 0; i <= size; i++) {
            pasarAMayusculasElemento(i);
        }
    }

    //TODO Minusculas

    //TODO Oracion

    //TODO Primera a mayuscula

}
