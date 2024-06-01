package com.ingjuanfg.interfaces;

/*
* Una interface es basicamente una clase que solo tiene firma de metodos, esta no contiene atributos ni metodos con alguna accion predefinida. Lo unico que puede tener
* son metodos como lo hicimos en la clase abstracta y en caso tal, una constante. No aplica modificadores de acceso a los metodos.
* */
public interface Ejecutable {
    void ejecutar();
    String obtenerResultado();
}
