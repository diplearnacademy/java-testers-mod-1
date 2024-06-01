package com.ingjuanfg.clases;

//ESTO QUE SE HACE ACA. NO ES RECOMENDABLE. SE ESTA DUPLICANDO EL MISMO CODIGO DE CASODEPRUEBA EN ESTA CLASE. PARA VER UNA FORMA OPTIMA, VER EJEMPLO EN HERENCIA.
public class PruebaFuncional {
    private int id;
    private String titulo;
    private String descripcion;
    private String estado;

    //RETORNAR EL VALOR DE UN ATRIBUTO
    public int getId(){
        return id;
    }

    //DEFINIR UN VALOR A UN ATRIBUTO
    public void setId(int id){
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

    //METODO PARA EJECUTAR EL CP
    public void ejecutar(String estadoCp){
        this.estado = estadoCp;
    }

    public String obtenerResultado(){
        return "El Caso de Prueba " + titulo + " ha sido " + estado;
    }
}
