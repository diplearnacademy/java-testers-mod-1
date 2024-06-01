package com.ingjuanfg.herencia;

//ES LA MISMA CLASE QUE CASODEPRUEBA EN LA CARPETRA CLASES, SOLO SE CAMBIA EL NOMBRE PARA EVITAR CONFUSIONES.
public class Prueba {
    private int id;
    private String titulo;
    private String descripcion;
    private String estado;

    //ACA SE ADICIONA UN CONSTRUCTOR. EN ESTE CONSTRUCTOR SE ESTA ESPECIFICANDO QUE PARA CREAR UN OBJETO DE PRUEBA, SE DEBE CREAR OBLIGATORIAMENTE CON
    //ID Y TITULO ENVIANDOLO  COMO PARAMETRO EN LA CLASE MAIN CUANDO SE INVOCA LA CLASE.

    public Prueba(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

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

    public void ejecutar(String estadoCp) {
        this.estado = estadoCp;
    }

    public String obtenerResultado() {
        return "El Caso de Prueba " + " ha sido " + estado;
    }
}
