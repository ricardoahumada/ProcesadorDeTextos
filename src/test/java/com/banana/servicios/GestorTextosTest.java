package com.banana.servicios;

import com.banana.models.Texto;
import com.banana.persistence.TextosEnMemoria;
import org.junit.Test;

import static org.junit.Assert.*;

public class GestorTextosTest {

    @Test
    public void getAlmacenDeTextos() {
        TextosEnMemoria alamacen = GestorTextos.getAlmacenDeTextos();
        assertNotNull(alamacen);
    }

    @Test
    public void pasarAMayusculasElemento() {
        TextosEnMemoria alamacen = GestorTextos.getAlmacenDeTextos();
        String stringAComprobar = new String(alamacen.get(1).getTexto());//"esto es un texto"
        GestorTextos.pasarAMayusculasElemento(1);
        String stringTransformado = alamacen.get(1).getTexto();
        assertEquals(stringAComprobar.toUpperCase(), stringTransformado);
    }

    @Test
    public void pasarAMayusculasSubconjunto() {
    }

    @Test
    public void pasarAMayusculasTodos() {
    }

    @Test
    public void pasarPrimeraMayusculasElemento() {
    }

    @Test
    public void pasarPrimeraMayusculasTodos() {
    }
}