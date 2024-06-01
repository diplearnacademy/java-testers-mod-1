package com.ingjuanfg.abstracta;

/*
* Tomamos la clase de la carpeta Herencia y le hacemos los cambios para convertirla en clase abstracta. Agregamos la palabra Abstract a la clase.
* Tener en cuenta que para que esta sea considerada como tal, debe tener al menos 1 solo metodo abstracto.
* */
public abstract class Prueba {
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

    //Se define este metodo como el unico abstracto. Haciendo que solo tenga la firma, es decir, modificador de acceso, palabra abstract tipo de dato si retorna algo en este caso
    //String, nombre del metodo, parentesis y cerramos con punto y coma. Estos metodos no llevan llaves y cuerpo.
    public abstract String obtenerResultado();

    //Un metodo que este declarado en una clase abstracta pero con cuerpo como este, tambien puede ser sobre escrito por una clase Hija si lo requiere.
    //Ver clase PruebaNoFuncional para ver como seria.
    public void ejecutar(){
        this.estado = "BLOQUEADO";
    }
}
