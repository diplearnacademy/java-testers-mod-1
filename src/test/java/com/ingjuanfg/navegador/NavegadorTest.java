package com.ingjuanfg.navegador;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class NavegadorTest {

    private Navegador chrome;

    @BeforeMethod
    public void testInicial(){
        chrome = new Navegador();
    }

    @Test
    public void testAbrirNavegadorIncognito(){
        String instanciaNavegador;
        chrome.setInstancia("Incognito");
        instanciaNavegador = chrome.getInstancia();
        assertEquals("Incognito", instanciaNavegador);
    }

    @Test
    public void testTipoNavegador(){
        chrome.setNombre("Firefox");
        assertEquals("Firefoxx", chrome.getNombre());
    }
}
