package com.ingjuanfg.interfaces;

//CASO 1
/*
* En este caso vemos que al heredar (extends) y no implementar (implements), solo queremos sobreescribir el metodo obtenerResultado() y en caso tal de que necesitamos el metodo
* ejecutar, vamos poderlo invocar por estar heredando pero nos sirve como la clase abstracta (padre) lo hizo por nosotros al usar la interfaz.
* */
public class PruebaFuncional extends Prueba {
    private String tipoPrueba;

    public PruebaFuncional(int id, String titulo) {
        super(id, titulo);
    }

    public String getTipoPrueba() {
        return tipoPrueba;
    }

    public void setTipoPrueba(String tipoPrueba) {
        this.tipoPrueba = tipoPrueba;
    }

    //Sobreescrito de como esta en la clase abstracta.
    @Override
    public String obtenerResultado(){
        return "La Prueba Funcional es " + getEstado();
    }

}
