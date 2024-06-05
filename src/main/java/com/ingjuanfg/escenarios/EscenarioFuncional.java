package com.ingjuanfg.escenarios;

public class EscenarioFuncional {
    private int id;
    private String estado;

    public EscenarioFuncional(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void asignarEstadoEscenario(){
        this.estado = "Escenario Funcional Creado";
    }
}
