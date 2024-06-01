package com.ingjuanfg.interfaces;

//FORMA 1
/*
* Una opcion es usar una clase abstracta como intermediaria para que esta se encargue de implementar y sobreescribir los metodos y aplicar Polimorfismo. Es decir, se definen los metodos y ya
* se sabe que van a responder, pero en caso tal que se requiera sobreescribir en otra clase en particular se puede hacer pero no necesariamente todos.
* Ejemplo.
* Al utilizar la palabra implements aqui y llamar la interface, esta clase esta obligada a sobreescribir los 2 metodos que alli se tienen.
* Cuando otra clase Herede de esta. ya no se tiene que preocupar por los 2 metodos de la interface sino por el que le interese sobreescribir si es el caso.
*
* CASO 1 Ver PruebaFuncional
* CASO 2 Ver PruebaNoFuncional
* */
public abstract class Prueba implements Ejecutable{

    private int id;
    private String titulo;
    private String descripcion;
    private String estado;

    public Prueba(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void ejecutar(){
        this.estado = "EN EJECUCION";
    }

    public String obtenerResultado(){
        return estado;
    }
}
