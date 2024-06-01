package com.ingjuanfg.interfaces;

//CASO 2
/*
 * En este caso vemos que no estamos heredando de la clase abstracta. Sino que estamos yendo directamente a implementar la interfaz. Al hacer esto, estamos obligados a implementar
 * o sobreescribir,SI o SI ambos metodos de la interfaz. Ya que no estamos usando la clase abstracta como intermediaria.
 *
 * IMPORTANTE
 * como esta clase esta heredando, no podemos usar ninguno de los atributos o metodos definidos en la clase Prueba. Este es solo un ejemplo de como se veria implementarla.
 * */
public class PruebaNoFuncional implements Ejecutable{

    @Override
    public void ejecutar() {
        System.out.println("El caso de prueba se esta ejecutando");
    }

    @Override
    public String obtenerResultado() {
        return "No se puede obtener un resultado";
    }
}
