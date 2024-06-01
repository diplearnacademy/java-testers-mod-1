package com.ingjuanfg.clases;

public class CasosDePrueba {

    private int id;
    private String titulo;
    private String descripcion;
    private String estado;

    //NO TENEMOS CONSTRUCTOR

    //RETORNAR EL VALOR DE UN ATRIBUTO
    public int getId() {
        return id;
    }

    //DEFINIR UN VALOR A UN ATRIBUTO
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

    //METODO PARA EJECUTAR EL CASO DE PRUEBA
    public void ejecutar(String estadoCp) {
        this.estado = estadoCp;
    }

    //METODO PARA OBTENER EL RESULTADO
    public String obtenerResultado() {
        return "El Caso de Prueba " + titulo + " ha sido " + estado;
    }
}
