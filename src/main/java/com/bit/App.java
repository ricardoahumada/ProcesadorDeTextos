package com.bit;

import com.bit.controller.GestorTextos;
import com.bit.models.Texto;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("INICIANDO PROCESADOR DE TEXTOS");
        muestraTodosLosTextos();

        //paso a mayusculas el tercero
        GestorTextos.pasarAMayusculasElemento(2);
        muestraTodosLosTextos();

        //paso a mayusculas del 0-1
        GestorTextos.pasarAMayusculasSubconjunto(0, 1);
        muestraTodosLosTextos();

        //paso a mayusculas todos
        GestorTextos.pasarAMayusculasTodos();
        muestraTodosLosTextos();
    }

    private static void muestraTodosLosTextos() {
        List<Texto> textos = GestorTextos.getTextos().geAll();
        System.out.println("\n**** Mostrando textos.... *****");
        for (Texto unTexto : textos) {
            System.out.println(unTexto);
        }
    }
}
