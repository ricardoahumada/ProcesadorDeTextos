package com.banana.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextoTest {

    private final Texto TEXTOPRUEBA =new Texto("Esto es un texto de prueba!");

    @Test
    public void toMayusculas() {
        TEXTOPRUEBA.toMayusculas();
        System.out.println(TEXTOPRUEBA);
        assertEquals(TEXTOPRUEBA.getTexto(),"ESTO ES UN TEXTO DE PRUEBA!");
    }

    @Test
    public void toMinusculas() {
        TEXTOPRUEBA.toMinusculas();
        System.out.println(TEXTOPRUEBA);
        assertEquals(TEXTOPRUEBA.getTexto(),"esto es un texto de prueba!");
    }

    @Test
    public void toOracion() {
        TEXTOPRUEBA.toOracion();
        System.out.println(TEXTOPRUEBA);
        assertEquals(TEXTOPRUEBA.getTexto(),"Esto es un texto de prueba!");
    }

    @Test
    public void toPrimerasMayusculas() {
        TEXTOPRUEBA.toPrimerasMayusculas();
        System.out.println(TEXTOPRUEBA);
        assertEquals(TEXTOPRUEBA.getTexto(),"Esto Es Un Texto De Prueba!");
    }
}